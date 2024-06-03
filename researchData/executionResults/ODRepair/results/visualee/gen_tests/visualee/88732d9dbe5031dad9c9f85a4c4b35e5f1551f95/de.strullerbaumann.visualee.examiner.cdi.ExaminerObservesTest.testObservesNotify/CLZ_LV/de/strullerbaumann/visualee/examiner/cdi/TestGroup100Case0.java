package de.strullerbaumann.visualee.examiner.cdi;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test001");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("My test sourcecode");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.Charset charset0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getEncoding();
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: My test sourcecode");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.lang.Class<?> wildcardClass1 = filterContainer0.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("try {");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        java.lang.Class<?> wildcardClass5 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.lang.Class<?> wildcardClass5 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("Snapshot");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        java.lang.Class<?> wildcardClass10 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("Bindings binding = this.scriptEngine.createBindings();");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.info("");
        java.lang.Class<?> wildcardClass3 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.lang.Class<?> wildcardClass3 = javaSourceCollection2.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        org.junit.Assert.assertNotNull(filterContainer0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("}");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        boolean boolean3 = filterContainer0.isOk(javaSource2);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(filterList4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.info("");
        logProvider0.debug("binding.put(\"previous\", recent);");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        logProvider0.warn("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.warn("BrowserWindow");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        java.lang.Throwable throwable11 = null;
        logProvider0.error("ToDo", throwable11);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.info("");
        logProvider0.warn("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("List<Script> scripts = this.scripting.activeScripts();");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.lang.Class<?> wildcardClass5 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = javaSourceContainer0.getJavaSourceByName("ToDo");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = javaSourceContainer0.getJavaSourceByName("");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection10 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNull(javaSource7);
        org.junit.Assert.assertNull(javaSource9);
        org.junit.Assert.assertNotNull(javaSourceCollection10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        org.apache.maven.plugin.logging.Log log10 = null;
        logProvider0.setLog(log10);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Filtered");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        javaSourceContainer0.add(javaSource6);
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("binding.put(\"current\", current);");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.info("because of");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        java.lang.Throwable throwable6 = null;
        logProvider0.error("ToDo", throwable6);
        java.lang.Class<?> wildcardClass8 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        boolean boolean3 = filterContainer0.isOk(javaSource2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        logProvider0.info("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.debug("binding.put(\"current\", current);");
        java.lang.Class<?> wildcardClass9 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        boolean boolean3 = filterContainer0.isOk(javaSource2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(filterList6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.debug("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("long start = System.currentTimeMillis();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("} catch (Exception e) {");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        // The following exception was thrown during execution in test generation
        try {
            javaSourceContainer0.loadJavaFiles("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: } catch (Exception e) {");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.info("} catch (Exception e) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        org.apache.maven.plugin.logging.Log log12 = null;
        logProvider0.setLog(log12);
        java.lang.Throwable throwable15 = null;
        logProvider0.error("binding.put(\"previous\", recent);", throwable15);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        logProvider0.warn("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        logProvider0.debug("Filtered");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.lang.Class<?> wildcardClass3 = javaSourceCollection2.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.debug("");
        java.lang.Class<?> wildcardClass15 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.debug("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        java.lang.Class<?> wildcardClass11 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        java.lang.Throwable throwable10 = null;
        logProvider0.error("hi!", throwable10);
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.debug("");
        org.apache.maven.plugin.logging.Log log15 = null;
        logProvider0.setLog(log15);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        org.apache.maven.plugin.logging.Log log9 = null;
        logProvider0.setLog(log9);
        java.lang.Class<?> wildcardClass11 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.lang.Class<?> wildcardClass2 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        logProvider0.warn("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.warn("BrowserWindow");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        java.lang.Throwable throwable13 = null;
        logProvider0.error("Filtered", throwable13);
        logProvider0.info("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.lang.Class<?> wildcardClass7 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        java.lang.Class<?> wildcardClass3 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = javaSourceContainer0.getJavaSourceByName("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNull(javaSource7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.warn("Snapshot");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.info("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        org.apache.maven.plugin.logging.Log log5 = null;
        logProvider0.setLog(log5);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        javaSourceContainer0.loadJavaFiles("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        org.apache.maven.plugin.logging.Log log12 = null;
        logProvider0.setLog(log12);
        java.lang.Class<?> wildcardClass14 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("List<Script> scripts = this.scripting.activeScripts();");
        javaSourceContainer0.clear();
        java.lang.Class<?> wildcardClass10 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        javaSourceContainer0.add(javaSource5);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = javaSourceContainer0.getJavaSourceByName("ToDo");
        javaSourceContainer0.clear();
        javaSourceContainer0.loadJavaFiles("Filtered");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNull(javaSource7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection3 = javaSourceContainer0.getJavaSources();
        java.lang.Class<?> wildcardClass4 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        java.lang.Throwable throwable11 = null;
        logProvider0.error("long start = System.currentTimeMillis();", throwable11);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        java.lang.Class<?> wildcardClass6 = filterContainer0.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        java.lang.Class<?> wildcardClass10 = filterList9.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        java.lang.Class<?> wildcardClass8 = filterContainer0.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        javaSourceContainer0.add(javaSource9);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        javaSourceContainer0.add(javaSource5);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.debug("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.apache.maven.plugin.logging.Log log13 = null;
        logProvider0.setLog(log13);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = javaSourceContainer0.getJavaSourceByName("ToDo");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNull(javaSource7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.debug("");
        org.apache.maven.plugin.logging.Log log11 = null;
        logProvider0.setLog(log11);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Filtered");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("binding.put(\"current\", current);");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        logProvider0.warn("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.warn("BrowserWindow");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        boolean boolean3 = filterContainer0.isOk(javaSource2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.warn("");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.loadJavaFiles("hi!");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("hi!");
        javaSourceContainer0.loadJavaFiles("ToDo");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection3 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            javaSourceContainer0.loadJavaFiles("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("List<Script> scripts = this.scripting.activeScripts();");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = javaSourceContainer0.getJavaSourceByName("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        javaSourceContainer0.add(javaSource11);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource8);
        org.junit.Assert.assertNull(javaSource10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.debug("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        logProvider0.warn("hi!");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.warn("} catch (Exception e) {");
        logProvider0.warn("binding.put(\"current\", current);");
        logProvider0.warn("hi!");
        logProvider0.warn("try {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.debug("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        filterContainer0.clear();
        java.lang.Class<?> wildcardClass9 = filterContainer0.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        java.lang.Throwable throwable6 = null;
        logProvider0.error("ToDo", throwable6);
        logProvider0.info("try {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.info("}");
        java.lang.Class<?> wildcardClass11 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        java.lang.Throwable throwable13 = null;
        logProvider0.error("}", throwable13);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.debug("");
        logProvider0.info("hi!");
        org.apache.maven.plugin.logging.Log log17 = null;
        logProvider0.setLog(log17);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        org.apache.maven.plugin.logging.Log log9 = null;
        logProvider0.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        logProvider0.setLog(log11);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        java.lang.Class<?> wildcardClass3 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.loadJavaFiles("hi!");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("binding.put(\"previous\", recent);");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("ToDo");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        java.lang.Throwable throwable10 = null;
        logProvider0.error("List<Script> scripts = this.scripting.activeScripts();", throwable10);
        org.apache.maven.plugin.logging.Log log12 = null;
        logProvider0.setLog(log12);
        logProvider0.warn("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        java.lang.Throwable throwable17 = null;
        logProvider0.error("", throwable17);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        javaSourceContainer0.add(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.debug("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.lang.Throwable throwable14 = null;
        logProvider0.error("List<Script> scripts = this.scripting.activeScripts();", throwable14);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        boolean boolean3 = filterContainer0.isOk(javaSource2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.debug("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.debug("because of");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("}");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Filtered");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        javaSourceContainer0.add(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = javaSourceContainer0.getJavaSourceByName("}");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
        org.junit.Assert.assertNull(javaSource9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("binding.put(\"current\", current);");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("Snapshot");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        javaSourceContainer0.add(javaSource11);
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNull(javaSource8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection3 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection3);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.loadJavaFiles("Filtered");
        javaSourceContainer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            javaSourceContainer0.loadJavaFiles("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.lang.Class<?> wildcardClass11 = filterContainer0.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection3 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection3);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection3 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("SnapshotEscalator");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection3);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNull(javaSource8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.warn("} catch (Exception e) {");
        org.apache.maven.plugin.logging.Log log12 = null;
        logProvider0.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        logProvider0.setLog(log14);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        java.lang.Class<?> wildcardClass9 = filterContainer0.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("binding.put(\"current\", current);");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection9 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        javaSourceContainer0.add(javaSource10);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.debug("");
        logProvider0.info("");
        java.lang.Throwable throwable18 = null;
        logProvider0.error("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());", throwable18);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.warn("Snapshot");
        logProvider0.warn("try {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        logProvider0.info("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.debug("binding.put(\"current\", current);");
        logProvider0.debug("");
        java.lang.Class<?> wildcardClass11 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection9 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection10 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection9);
        org.junit.Assert.assertNotNull(javaSourceCollection10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        logProvider0.warn("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        org.apache.maven.plugin.logging.Log log14 = null;
        logProvider0.setLog(log14);
        java.lang.Throwable throwable17 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable17);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Filtered");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Snapshot");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        java.lang.Throwable throwable10 = null;
        logProvider0.error("hi!", throwable10);
        logProvider0.warn("List<Script> scripts = this.scripting.activeScripts();");
        logProvider0.debug("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.warn("} catch (Exception e) {");
        logProvider0.warn("binding.put(\"current\", current);");
        logProvider0.warn("hi!");
        logProvider0.debug("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        logProvider0.warn("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        logProvider0.info("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.debug("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.lang.Throwable throwable14 = null;
        logProvider0.error("binding.put(\"previous\", recent);", throwable14);
        logProvider0.warn("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        javaSourceContainer0.add(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = javaSourceContainer0.getJavaSourceByName("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
        org.junit.Assert.assertNull(javaSource10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        javaSourceContainer0.add(javaSource6);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection8 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNotNull(javaSourceCollection8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.warn("} catch (Exception e) {");
        org.apache.maven.plugin.logging.Log log12 = null;
        logProvider0.setLog(log12);
        logProvider0.info("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.lang.Class<?> wildcardClass4 = filterContainer0.getClass();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.warn("} catch (Exception e) {");
        logProvider0.warn("binding.put(\"current\", current);");
        logProvider0.warn("hi!");
        org.apache.maven.plugin.logging.Log log16 = null;
        logProvider0.setLog(log16);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.warn("");
        java.lang.Class<?> wildcardClass7 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        java.lang.Throwable throwable4 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable4);
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log8 = null;
        logProvider0.setLog(log8);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.warn("} catch (Exception e) {");
        logProvider0.warn("binding.put(\"current\", current);");
        logProvider0.info("long start = System.currentTimeMillis();");
        logProvider0.warn("My test sourcecode");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Filtered");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = javaSourceContainer0.getJavaSourceByName("My test sourcecode");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNull(javaSource5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        boolean boolean3 = filterContainer0.isOk(javaSource2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("List<Script> scripts = this.scripting.activeScripts();");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection9 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        javaSourceContainer0.add(javaSource10);
        // The following exception was thrown during execution in test generation
        try {
            javaSourceContainer0.loadJavaFiles("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource8);
        org.junit.Assert.assertNotNull(javaSourceCollection9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        javaSourceContainer0.add(javaSource5);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        java.lang.Throwable throwable4 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable4);
        logProvider0.warn("List<Script> scripts = this.scripting.activeScripts();");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.debug("");
        logProvider0.warn("SnapshotEscalator");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        java.lang.Throwable throwable6 = null;
        logProvider0.error("ToDo", throwable6);
        logProvider0.warn("SnapshotEscalator");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.loadJavaFiles("long start = System.currentTimeMillis();");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNull(javaSource10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.debug("");
        logProvider0.debug("Snapshot");
        logProvider0.warn("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        java.lang.Throwable throwable11 = null;
        logProvider0.error("public void onEscalationBrowserRequest(@Observes Escalation escalation) {", throwable11);
        java.lang.Throwable throwable14 = null;
        logProvider0.error("List<Script> scripts = this.scripting.activeScripts();", throwable14);
        java.lang.Class<?> wildcardClass16 = logProvider0.getClass();
        org.junit.Assert.assertNotNull(logProvider0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        java.lang.Throwable throwable10 = null;
        logProvider0.error("List<Script> scripts = this.scripting.activeScripts();", throwable10);
        java.lang.Throwable throwable13 = null;
        logProvider0.error("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());", throwable13);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        logProvider0.warn("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.warn("BrowserWindow");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.info("List<Script> scripts = this.scripting.activeScripts();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.loadJavaFiles("Filtered");
        javaSourceContainer0.clear();
        java.lang.Class<?> wildcardClass10 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        logProvider0.info("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.debug("binding.put(\"current\", current);");
        logProvider0.debug("");
        logProvider0.debug("SnapshotEscalator");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        javaSourceContainer0.add(javaSource4);
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("List<Script> scripts = this.scripting.activeScripts();");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        javaSourceContainer0.add(javaSource9);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.debug("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.info("binding.put(\"current\", current);");
        java.lang.Throwable throwable15 = null;
        logProvider0.error("Bindings binding = this.scriptEngine.createBindings();", throwable15);
        logProvider0.warn("List<Script> scripts = this.scripting.activeScripts();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        org.apache.maven.plugin.logging.Log log12 = null;
        logProvider0.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        logProvider0.setLog(log14);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = javaSourceContainer0.getJavaSourceByName("ToDo");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
        org.junit.Assert.assertNull(javaSource9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.debug("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.debug("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.info("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("binding.put(\"current\", current);");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNull(javaSource8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.loadJavaFiles("Filtered");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection9 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("binding.put(\"current\", current);");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = javaSourceContainer0.getJavaSourceByName("My test sourcecode");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
        org.junit.Assert.assertNull(javaSource9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        java.lang.Class<?> wildcardClass6 = javaSourceCollection5.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("SnapshotEscalator");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection3 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        javaSourceContainer0.add(javaSource5);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.loadJavaFiles("hi!");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("hi!");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Filtered");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        logProvider0.setLog(log3);
        java.lang.Throwable throwable6 = null;
        logProvider0.error("ToDo", throwable6);
        logProvider0.info("hi!");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        javaSourceContainer0.add(javaSource4);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.loadJavaFiles("Filtered");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNull(javaSource10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        java.lang.Throwable throwable10 = null;
        logProvider0.error("List<Script> scripts = this.scripting.activeScripts();", throwable10);
        org.apache.maven.plugin.logging.Log log12 = null;
        logProvider0.setLog(log12);
        logProvider0.warn("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        java.lang.Throwable throwable17 = null;
        logProvider0.error("}", throwable17);
        logProvider0.info("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        javaSourceContainer0.add(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = javaSourceContainer0.getJavaSourceByName("try {");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection11 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource10);
        org.junit.Assert.assertNotNull(javaSourceCollection11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("List<Script> scripts = this.scripting.activeScripts();");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection9 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        javaSourceContainer0.add(javaSource10);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.debug("");
        logProvider0.info("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.apache.maven.plugin.logging.Log log17 = null;
        logProvider0.setLog(log17);
        logProvider0.debug("binding.put(\"previous\", recent);");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Filtered");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        java.lang.Class<?> wildcardClass6 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.debug("}");
        java.lang.Throwable throwable13 = null;
        logProvider0.error("hi!", throwable13);
        logProvider0.debug("try {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("BrowserWindow");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = javaSourceContainer0.getJavaSourceByName("ToDo");
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection9 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNull(javaSource7);
        org.junit.Assert.assertNotNull(javaSourceCollection9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection3 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNotNull(javaSourceCollection3);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.loadJavaFiles("Filtered");
        javaSourceContainer0.loadJavaFiles("BrowserWindow");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        javaSourceContainer0.add(javaSource8);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection10 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
        org.junit.Assert.assertNotNull(javaSourceCollection10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        java.lang.Throwable throwable11 = null;
        logProvider0.error("Filtered", throwable11);
        java.lang.Throwable throwable14 = null;
        logProvider0.error("because of", throwable14);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        javaSourceContainer0.add(javaSource2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("binding.put(\"current\", current);");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNull(javaSource5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.loadJavaFiles("Filtered");
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        javaSourceContainer0.add(javaSource10);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        javaSourceContainer0.add(javaSource12);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection14 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.debug("");
        logProvider0.debug("BrowserWindow");
        logProvider0.debug("ToDo");
        logProvider0.warn("List<Script> scripts = this.scripting.activeScripts();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        javaSourceContainer0.add(javaSource6);
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.warn("try {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        java.lang.Throwable throwable4 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable4);
        logProvider0.warn("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        javaSourceContainer0.loadJavaFiles("Filtered");
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        javaSourceContainer0.add(javaSource10);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.lang.Class<?> wildcardClass14 = javaSourceContainer0.getClass();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNull(javaSource13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.info("");
        logProvider0.info("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        org.apache.maven.plugin.logging.Log log5 = null;
        logProvider0.setLog(log5);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        javaSourceContainer0.add(javaSource4);
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        javaSourceContainer0.add(javaSource7);
        javaSourceContainer0.loadJavaFiles("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = javaSourceContainer0.getJavaSourceByName("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        org.apache.maven.plugin.logging.Log log7 = null;
        logProvider0.setLog(log7);
        logProvider0.warn("Snapshot");
        logProvider0.debug("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.info("My test sourcecode");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.info("");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        logProvider0.debug("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.info("binding.put(\"previous\", recent);");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = javaSourceContainer0.getJavaSourceByName("ToDo");
        javaSourceContainer0.clear();
        // The following exception was thrown during execution in test generation
        try {
            javaSourceContainer0.loadJavaFiles("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNull(javaSource7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("public void onToDoChange(@Observes(during = TransactionPhase.AFTER_SUCCESS) @ChangeEvent(ChangeEvent.Type.CREATION) ToDo todo) throws EncodeException {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("BrowserWindow");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection7 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        javaSourceContainer0.add(javaSource8);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceCollection7);
        org.junit.Assert.assertNull(javaSource11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.setEncoding("BrowserWindow");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("}", throwable8);
        logProvider0.warn("} catch (Exception e) {");
        logProvider0.warn("Filtered");
        logProvider0.warn("SnapshotEscalator");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        javaSourceContainer0.add(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        javaSourceContainer0.add(javaSource8);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.debug("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.lang.Throwable throwable14 = null;
        logProvider0.error("Filtered", throwable14);
        org.apache.maven.plugin.logging.Log log16 = null;
        logProvider0.setLog(log16);
        logProvider0.warn("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        javaSourceContainer0.add(javaSource4);
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        javaSourceContainer0.clear();
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.info("ToDo");
        logProvider0.warn("} catch (Exception e) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        logProvider0.warn("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        logProvider0.warn("} catch (Exception e) {");
        logProvider0.debug("Snapshot recent = this.recentSnapshots.get(current.getInstanceName());");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = null;
        javaSourceContainer0.add(javaSource2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = javaSourceContainer0.getJavaSourceByName("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        javaSourceContainer0.add(javaSource6);
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNull(javaSource5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.info("SnapshotEscalator");
        logProvider0.warn("} catch (Exception e) {");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.debug("Snapshot");
        logProvider0.info("");
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("");
        logProvider0.debug("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        java.lang.Throwable throwable14 = null;
        logProvider0.error("hi!", throwable14);
        org.apache.maven.plugin.logging.Log log16 = null;
        logProvider0.setLog(log16);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("SnapshotEscalator");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.debug("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.info("binding.put(\"current\", current);");
        java.lang.Throwable throwable15 = null;
        logProvider0.error("Bindings binding = this.scriptEngine.createBindings();", throwable15);
        logProvider0.warn("Bindings binding = this.scriptEngine.createBindings();");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        javaSourceContainer0.add(javaSource3);
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection6 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        org.apache.maven.plugin.logging.Log log1 = null;
        logProvider0.setLog(log1);
        logProvider0.warn("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.warn("BrowserWindow");
        java.lang.Throwable throwable8 = null;
        logProvider0.error("public void escalate(@Observes @Severity(Severity.Level.HEARTBEAT) Snapshot current) {", throwable8);
        logProvider0.info("Bindings binding = this.scriptEngine.createBindings();");
        logProvider0.debug("My test sourcecode");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        logProvider0.info("long start = System.currentTimeMillis();");
        org.apache.maven.plugin.logging.Log log11 = null;
        logProvider0.setLog(log11);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(during=BEFORE_COMPLETION) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        javaSourceContainer0.loadJavaFiles("public void escalate(@Observes(notifyObserver=IF_EXISTS) @Severity(Severity.Level.HEARTBEAT) Snapshot current) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("List<Script> scripts = this.scripting.activeScripts();");
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection9 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection10 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection11 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNull(javaSource8);
        org.junit.Assert.assertNotNull(javaSourceCollection9);
        org.junit.Assert.assertNotNull(javaSourceCollection10);
        org.junit.Assert.assertNotNull(javaSourceCollection11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.info("");
        logProvider0.debug("List<Script> scripts = this.scripting.activeScripts();");
        java.lang.Throwable throwable6 = null;
        logProvider0.error("try {", throwable6);
        logProvider0.debug("binding.put(\"current\", current);");
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource2 = javaSourceContainer0.getJavaSourceByName("try {");
        javaSourceContainer0.clear();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection4 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection5 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection6 = javaSourceContainer0.getJavaSources();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource2);
        org.junit.Assert.assertNotNull(javaSourceCollection4);
        org.junit.Assert.assertNotNull(javaSourceCollection5);
        org.junit.Assert.assertNotNull(javaSourceCollection6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection1 = javaSourceContainer0.getJavaSources();
        java.util.Collection<de.strullerbaumann.visualee.source.entity.JavaSource> javaSourceCollection2 = javaSourceContainer0.getJavaSources();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("public void onEscalationBrowserRequest(@Observes Escalation escalation) {");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = javaSourceContainer0.getJavaSourceByName("Snapshot");
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNotNull(javaSourceCollection1);
        org.junit.Assert.assertNotNull(javaSourceCollection2);
        org.junit.Assert.assertNull(javaSource4);
        org.junit.Assert.assertNull(javaSource6);
        org.junit.Assert.assertNull(javaSource8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        de.strullerbaumann.visualee.logging.LogProvider logProvider0 = de.strullerbaumann.visualee.logging.LogProvider.getInstance();
        logProvider0.warn("BrowserWindow");
        logProvider0.info("My test sourcecode");
        logProvider0.debug("My test sourcecode");
        logProvider0.debug("throw new IllegalStateException(\"Exception during script evaluation: \" + e, e);");
        java.lang.Throwable throwable10 = null;
        logProvider0.error("List<Script> scripts = this.scripting.activeScripts();", throwable10);
        java.lang.Throwable throwable13 = null;
        logProvider0.error("", throwable13);
        org.junit.Assert.assertNotNull(logProvider0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        de.strullerbaumann.visualee.source.boundary.JavaSourceContainer javaSourceContainer0 = de.strullerbaumann.visualee.source.boundary.JavaSourceContainer.getInstance();
        javaSourceContainer0.loadJavaFiles("hi!");
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = javaSourceContainer0.getJavaSourceByName("hi!");
        javaSourceContainer0.clear();
        org.junit.Assert.assertNotNull(javaSourceContainer0);
        org.junit.Assert.assertNull(javaSource4);
    }
}