package com.alibaba.json.bvt.serializer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature1 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature2 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteBigDecimalAsPlain;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature4 = com.alibaba.fastjson.serializer.SerializerFeature.WriteBigDecimalAsPlain;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] { serializerFeature0, serializerFeature1, serializerFeature2, serializerFeature3, serializerFeature4 };
        com.alibaba.fastjson.serializer.SerializeWriter serializeWriter6 = new com.alibaba.fastjson.serializer.SerializeWriter(serializerFeatureArray5);
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName;
        serializeWriter6.writeEnum((java.lang.Enum<com.alibaba.fastjson.serializer.SerializerFeature>) serializerFeature7);
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature11 = com.alibaba.fastjson.serializer.SerializerFeature.WriteBigDecimalAsPlain;
        serializeWriter6.writeFieldValue(' ', "null:", (java.lang.Enum<com.alibaba.fastjson.serializer.SerializerFeature>) serializerFeature11);
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature13 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
        serializeWriter6.writeEnum((java.lang.Enum<com.alibaba.fastjson.serializer.SerializerFeature>) serializerFeature13);
        serializeWriter6.writeDouble(0.0d, true);
        boolean boolean19 = serializeWriter6.isEnabled((int) (short) 100);
        serializeWriter6.close();
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature21 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature22 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature23 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature24 = com.alibaba.fastjson.serializer.SerializerFeature.WriteBigDecimalAsPlain;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature25 = com.alibaba.fastjson.serializer.SerializerFeature.WriteBigDecimalAsPlain;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray26 = new com.alibaba.fastjson.serializer.SerializerFeature[] { serializerFeature21, serializerFeature22, serializerFeature23, serializerFeature24, serializerFeature25 };
        com.alibaba.fastjson.serializer.SerializeWriter serializeWriter27 = new com.alibaba.fastjson.serializer.SerializeWriter(serializerFeatureArray26);
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature28 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName;
        serializeWriter27.writeEnum((java.lang.Enum<com.alibaba.fastjson.serializer.SerializerFeature>) serializerFeature28);
        char[] charArray30 = com.alibaba.fastjson.util.IOUtils.replaceChars;
        serializeWriter27.write(charArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serializeWriter6.writeString(charArray30);
    }
}

