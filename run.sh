#!/bin/bash

if [[ $1 == "" ]] || [[ $2 == "" ]]; then
    echo "arg1 - Path to CSV with project and sha"
    echo "arg2 - Path to properties file"
    exit
fi

CURRENT_DIR=$(pwd)

# Store the files dirs
projects_file=$1
properties_file=$2

# Check if the properties file exists
if [ ! -f "$properties_file" ]; then
    echo "Properties file not found in directory: $properties_file"
    exit 1
fi

# Check if the projects file exists
if [ ! -f "$projects_file" ]; then
    echo "Projects file not found in directory: $projects_file"
    exit 1
fi

echo "-------------------Loading Properties file-------------------"
while IFS='=' read -r key value || [ -n "$key" ]; do
    # Skip empty lines and comments
    if [[ ! $key =~ ^\s*# && -n $key ]]; then
        echo "Key: $key, Value: $value"
        case $key in
            round_number) round_number="$value" ;;
            timeout) timeout="$value" ;;
            script_to_run) script_to_run="$value" ;;
        esac

    fi
done < "$properties_file"

echo "-------------------Cloning Tool Repos-------------------"

if [[ ! -d ./toolRepos/iDFlakies ]]; then
        git clone https://github.com/UT-SE-Research/iDFlakies ./toolRepos/iDFlakies
	git -C ./toolRepos/iDFlakies checkout 001e57490e984bdf0f7890f9fe4d7b3321911fe0
fi

if [[ ! -d ./toolRepos/ODRepair ]]; then
	git clone https://github.com/UT-SE-Research/ODRepair ./toolRepos/ODRepair
	git -C ./toolRepos/ODRepair checkout f1c38c319246bae3f5b946fc066cf21ec8a07
fi


echo "-------------------Generate Run ID-------------------"
generate_random_string() {
    cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w "${1:-10}" | head -n 1
}

unique_id=$(date +"%Y%m%d_%H%M")_$(generate_random_string 6)
echo "Unique ID for this run: $unique_id"
mkdir -p ./output/$unique_id

echo "-------------------Executing iDFlakies Detection-------------------"
echo "Detection start: $(date)" > ./output/$unique_id/time.txt

(cd "./toolRepos/iDFlakies/scripts/docker/" && bash create_and_run_dockers.sh $projects_file $round_number $timeout $script_to_run)

echo "Detection end: $(date)" >> ./output/$unique_id/time.txt

cd "$CURRENT_DIR"
mv ./toolRepos/iDFlakies/scripts/docker/all-output ./output/$unique_id

# Transform iDFlakies output into usable input data for ODRepair
cd ./output/$unique_id
temp_file=$(mktemp)
temp_file2=$(mktemp)

find . -type f -name "all_flaky_tests_list.csv" |
while IFS= read -r file; do
    project_name=$(basename "$(dirname "$file")")
    sed "s|^|$project_name,|" "$file" >> "$temp_file"
done
awk 'BEGIN {FS=OFS=","} {sub(/\./,"/",$1); sub("_output$","",$1)}1' "$temp_file" > "$temp_file2"

sort -o "$temp_file" "$temp_file2"
sed -i 's/#/./g' "$temp_file"
sed -i 's/()//g' "$temp_file"
sort -t ',' -u -k2,2 "$temp_file" | awk 'BEGIN {FS=OFS=","} {print $1,$2}' > "$temp_file2"

> "$temp_file"
while IFS=, read -r string rest_of_line; do
    match=$(awk -F',' -v search="$string" 'tolower($1) ~ tolower(search) {print $2; exit}' "$projects_file")
    if [ -n "$match" ]; then
        echo "$string,$rest_of_line,$match,." >> "$temp_file"
    else
        echo "$string,$rest_of_line,." >> "$temp_file"
    fi
done < "$temp_file2"

awk -F',' 'BEGIN {OFS=","} {print $1, $3, $4, $2}' "$temp_file" > detected_flaky_tests.csv

rm "$temp_file"
rm "$temp_file2"

cd "$CURRENT_DIR"

echo "-------------------Executing ODRepair Patch Generation-------------------"

echo "Repair start: $(date)" >> ./output/$unique_id/time.txt

(cd "./toolRepos/ODRepair/experiments/" && bash runAll.sh "../../../output/$unique_id/detected_flaky_tests.csv")

echo "Repair end: $(date)" >> ./output/$unique_id/time.txt

#Move repair results to output
cd "$CURRENT_DIR"
mkdir -p ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/output ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/allFields ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/diffFields ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/gen_tests ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/resetters ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/patches ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/logs ./output/$unique_id/repair-output
mv ./toolRepos/ODRepair/experiments/_results ./output/$unique_id/repair-output

#Copy repair results to main folder for ease of access
cp ./output/$unique_id/repair-output/output/overall_results.csv ./output/$unique_id/repair_results.csv

echo "-------------------Finished execution-------------------"
