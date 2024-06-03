package net.sf.marineapi.ais.event;

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
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.GL;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GL + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.GL));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = net.sf.marineapi.nmea.sentence.Sentence.TERMINATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.ZQ;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.ZQ + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.ZQ));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.CX;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CX + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.CX));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.CD;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CD + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.CD));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.YD;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YD + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.YD));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("GSA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("Constructor with %s parameter not found");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.DM;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.DM + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.DM));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.VM;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VM + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.VM));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.ZA;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.ZA + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.ZA));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        char char0 = net.sf.marineapi.nmea.sentence.Sentence.FIELD_DELIMITER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ',' + "'", char0 == ',');
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        char char0 = net.sf.marineapi.nmea.sentence.Sentence.ALTERNATIVE_BEGIN_CHAR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '!' + "'", char0 == '!');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.YR;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YR + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.YR));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        char char0 = net.sf.marineapi.nmea.sentence.Sentence.CHECKSUM_DELIMITER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '*' + "'", char0 == '*');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.DF;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.DF + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.DF));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.GQ;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GQ + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.GQ));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.LA;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LA + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.LA));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.ER;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.ER + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.ER));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.HC;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.HC + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.HC));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.ZC;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.ZC + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.ZC));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.GA;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GA + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.GA));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.YL;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YL + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.YL));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.RA;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.RA + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.RA));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.TR;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.TR + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.TR));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.AR;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AR + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.AR));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.IR;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.IR + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.IR));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.CT;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, sentenceId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CT + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.CT));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("VHW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("DTM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.YT;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YT + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.YT));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence2 = sentenceFactory0.createParser("HTD");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.GN;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GN + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.GN));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.AP;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AP + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.AP));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.SD;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.SD + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.SD));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.BD;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.BD + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.BD));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "");
            org.junit.Assert.fail("Expected exception of type net.sf.marineapi.nmea.parser.UnsupportedSentenceException; message: Parser for type '' not found");
        } catch (net.sf.marineapi.nmea.parser.UnsupportedSentenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.YC;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YC + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.YC));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        char char0 = net.sf.marineapi.nmea.sentence.Sentence.BEGIN_CHAR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '$' + "'", char0 == '$');
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        int int0 = net.sf.marineapi.nmea.sentence.Sentence.MAX_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 82 + "'", int0 == 82);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser("ROT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        java.lang.String str2 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA" + "'", str2, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.ST;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.ST + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.ST));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.AN;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence3 = sentenceFactory0.createParser(talkerId1, "ALK");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unable to invoke parser constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + talkerId1 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AN + "'", talkerId1.equals(net.sf.marineapi.nmea.sentence.TalkerId.AN));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.TI;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence3 = sentenceFactory0.createParser(talkerId1, sentenceId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + talkerId1 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.TI + "'", talkerId1.equals(net.sf.marineapi.nmea.sentence.TalkerId.TI));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.AT;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, sentenceId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AT + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.AT));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.GP;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GP + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.GP));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("Cannot resolve generic type <T>, use constructor with Class<T> param.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.IN;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.IN + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.IN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.String str2 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str2, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("MWV");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.WI;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.WI + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.WI));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.YX;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, sentenceId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YX + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.YX));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.AS;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AS + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.AS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("Unable to register parser due security violation");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("HTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.CP;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CP + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.CP));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.QZ;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.QZ + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.QZ));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("exception not thrown, resolved to");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.YV;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, sentenceId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YV + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.YV));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        boolean boolean7 = sentenceFactory0.hasParser("VWR");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.YF;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, sentenceId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YF + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.YF));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.EP;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.EP + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.EP));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("Unable to invoke parser constructor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("XTE");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.HN;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.HN + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.HN));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("VWR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("GLL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sentence6.toSentence((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("!AIVDM,2,2,3,B,1@0000000000000,2*55");
        org.junit.Assert.assertTrue("'" + talkerId1 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AI + "'", talkerId1.equals(net.sf.marineapi.nmea.sentence.TalkerId.AI));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isProprietary();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        char char10 = sentence6.getBeginChar();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.CV;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, sentenceId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CV + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.CV));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.GI;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GI + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.GI));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.SN;
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.SN + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.SN));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        java.lang.Class<?> wildcardClass7 = sentence6.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory6 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean8 = sentenceFactory6.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId9 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence11 = sentenceFactory6.createParser(talkerId9, "MWV");
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence13 = sentenceFactory0.createParser(talkerId9, sentenceId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sentenceFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + talkerId9 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId9.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.lang.Class<?> wildcardClass1 = sentenceFactory0.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId7 = net.sf.marineapi.nmea.sentence.TalkerId.RC;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence9 = sentenceFactory0.createParser(talkerId7, sentenceId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + talkerId7 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.RC + "'", talkerId7.equals(net.sf.marineapi.nmea.sentence.TalkerId.RC));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        java.lang.String str10 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("RSA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        java.lang.String str3 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str3, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("DBT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.YP;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "CUR");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser("VBW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YP + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.YP));
        org.junit.Assert.assertNotNull(sentence8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser("BOD");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser("RPM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.AG;
        sentence6.setTalkerId(talkerId10);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AG + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.AG));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        char char10 = sentence6.getBeginChar();
        java.lang.Class<?> wildcardClass11 = sentence6.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException7 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException5.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException15 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException13.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException21 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray22 = unsupportedSentenceException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = unsupportedSentenceException21.getSuppressed();
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException21);
        java.lang.Throwable throwable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsupportedSentenceException3.addSuppressed(throwable25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        java.lang.String str5 = unsupportedSentenceException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA" + "'", str5, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        char char10 = sentence6.getBeginChar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sentence6.toSentence((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence9 = sentenceFactory0.createParser("HDT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("Unable to register parser due security violation");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId7 = net.sf.marineapi.nmea.sentence.TalkerId.DE;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence9 = sentenceFactory0.createParser(talkerId7, sentenceId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + talkerId7 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.DE + "'", talkerId7.equals(net.sf.marineapi.nmea.sentence.TalkerId.DE));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "MWV");
        java.lang.String str6 = sentence5.toSentence();
        boolean boolean7 = sentence5.isAISSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$GBMWV,,,,,V*33" + "'", str6, "$GBMWV,,,,,V*33");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sentence6.toSentence((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.AX;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AX + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.AX));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        java.lang.String str7 = sentence6.toString();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$VDXDR,,,,*5C" + "'", str7, "$VDXDR,,,,*5C");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("MHU");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        java.lang.String str11 = sentence6.toString();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId12 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + talkerId12 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId12.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        boolean boolean4 = sentenceFactory0.hasParser("Unable to access parser");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory5 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList6 = sentenceFactory5.listParsers();
        boolean boolean8 = sentenceFactory5.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId9 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence11 = sentenceFactory5.createParser(talkerId9, "XDR");
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence13 = sentenceFactory0.createParser(talkerId9, sentenceId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sentenceFactory5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + talkerId9 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId9.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        char char10 = sentence6.getBeginChar();
        boolean boolean11 = sentence6.isProprietary();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        java.lang.String str13 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$VDXDR,,,,*5C" + "'", str13, "$VDXDR,,,,*5C");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence9 = sentenceFactory0.createParser("GST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "GNS");
        int int6 = sentence5.getFieldCount();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isValid();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sentence6.toSentence((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RMB");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        java.lang.String str11 = sentence6.toString();
        sentence6.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId13 = net.sf.marineapi.nmea.sentence.TalkerId.LA;
        sentence6.setTalkerId(talkerId13);
        char char15 = sentence6.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + talkerId13 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LA + "'", talkerId13.equals(net.sf.marineapi.nmea.sentence.TalkerId.LA));
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '$' + "'", char15 == '$');
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("Unable to register parser due security violation");
        java.lang.String str2 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: Unable to register parser due security violation" + "'", str2, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: Unable to register parser due security violation");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("hi!");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        int int13 = sentence6.getFieldCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = sentence6.toSentence(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        sentence6.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sentence6.toSentence((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isValid();
        java.lang.String str12 = sentence6.toSentence();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        char char9 = sentence6.getBeginChar();
        sentence6.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sentence6.toSentence((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.toString();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$VDXDR,,,,*5C" + "'", str9, "$VDXDR,,,,*5C");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException7 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException5.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException15 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException13.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        java.lang.Throwable[] throwableArray20 = unsupportedSentenceException3.getSuppressed();
        java.lang.Throwable[] throwableArray21 = unsupportedSentenceException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException7 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException5.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException15 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException13.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        java.lang.String str20 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA" + "'", str20, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        char char13 = sentence6.getBeginChar();
        boolean boolean14 = sentence6.isAISSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '$' + "'", char13 == '$');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser("VDM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.OM;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "TXT");
        boolean boolean9 = sentence8.isValid();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sentence8.toSentence(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.YP;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "CUR");
        java.lang.String str9 = sentence8.toString();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YP + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.YP));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$YPCUR,,,,,,T,,,,T,B*23" + "'", str9, "$YPCUR,,,,,,T,,,,T,B*23");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("MHU");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("DTM");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        java.lang.String str3 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: DTM" + "'", str3, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: DTM");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        java.lang.String str11 = sentence6.toString();
        java.lang.String str12 = sentence6.toString();
        java.lang.Class<?> wildcardClass13 = sentence6.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.YP;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "CUR");
        boolean boolean10 = sentenceFactory0.hasParser("exception not thrown, resolved to");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence13 = sentenceFactory0.createParser(talkerId11, sentenceId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YP + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.YP));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("VDM");
        java.lang.String str2 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: VDM" + "'", str2, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: VDM");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        java.lang.Throwable[] throwableArray5 = unsupportedSentenceException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId13 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + talkerId13 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId13.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "MWV");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        java.lang.Class<?> wildcardClass5 = unsupportedSentenceException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        int int13 = sentence6.getFieldCount();
        boolean boolean14 = sentence6.isValid();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId15 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + talkerId15 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId15.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        sentence6.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId9 = net.sf.marineapi.nmea.sentence.TalkerId.II;
        sentence6.setTalkerId(talkerId9);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + talkerId9 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.II + "'", talkerId9.equals(net.sf.marineapi.nmea.sentence.TalkerId.II));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId0 = net.sf.marineapi.nmea.sentence.TalkerId.CC;
        java.lang.Class<?> wildcardClass1 = talkerId0.getClass();
        org.junit.Assert.assertTrue("'" + talkerId0 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CC + "'", talkerId0.equals(net.sf.marineapi.nmea.sentence.TalkerId.CC));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        boolean boolean8 = sentence6.isAISSentence();
        boolean boolean9 = sentence6.isValid();
        java.lang.String str10 = sentence6.toString();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        sentence6.reset();
        java.lang.String str11 = sentence6.toSentence();
        sentence6.reset();
        java.lang.Class<?> wildcardClass13 = sentence6.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        sentence6.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException9 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("MHU");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException9);
        java.lang.String str11 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str11, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("MHU");
        java.lang.String str2 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: MHU" + "'", str2, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: MHU");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.getSentenceId();
        boolean boolean9 = sentence6.isAISSentence();
        boolean boolean10 = sentence6.isValid();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "XDR" + "'", str8, "XDR");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        boolean boolean11 = sentence6.isProprietary();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("DTM");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException4 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException6 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException8 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException10 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException8.addSuppressed((java.lang.Throwable) unsupportedSentenceException10);
        unsupportedSentenceException6.addSuppressed((java.lang.Throwable) unsupportedSentenceException10);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException14 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException16 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException18 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException16.addSuppressed((java.lang.Throwable) unsupportedSentenceException18);
        unsupportedSentenceException14.addSuppressed((java.lang.Throwable) unsupportedSentenceException18);
        unsupportedSentenceException6.addSuppressed((java.lang.Throwable) unsupportedSentenceException18);
        unsupportedSentenceException4.addSuppressed((java.lang.Throwable) unsupportedSentenceException6);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException24 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray25 = unsupportedSentenceException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = unsupportedSentenceException24.getSuppressed();
        unsupportedSentenceException6.addSuppressed((java.lang.Throwable) unsupportedSentenceException24);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException6);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "GNS");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory7 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean9 = sentenceFactory7.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory7.createParser(talkerId10, "MWV");
        boolean boolean14 = sentenceFactory7.hasParser("Parser for type '%s' not found");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId15 = net.sf.marineapi.nmea.sentence.TalkerId.CM;
        net.sf.marineapi.nmea.sentence.Sentence sentence17 = sentenceFactory7.createParser(talkerId15, "VDM");
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence19 = sentenceFactory0.createParser(talkerId15, sentenceId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(sentenceFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + talkerId15 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CM + "'", talkerId15.equals(net.sf.marineapi.nmea.sentence.TalkerId.CM));
        org.junit.Assert.assertNotNull(sentence17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("MHU");
        java.lang.Class<?> wildcardClass2 = unsupportedSentenceException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isAISSentence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sentence6.toSentence((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.RC;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "VHW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        sentence10.setTalkerId(talkerId11);
        sentence10.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.RC + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.RC));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        sentence6.reset();
        java.lang.String str11 = sentence6.toString();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        sentence6.reset();
        java.lang.String str11 = sentence6.toSentence();
        java.lang.String str12 = sentence6.getSentenceId();
        boolean boolean13 = sentence6.isValid();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "XDR" + "'", str12, "XDR");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        boolean boolean4 = sentenceFactory0.hasParser("Unable to access parser");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = unsupportedSentenceException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = unsupportedSentenceException1.getSuppressed();
        java.lang.String str5 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str5, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.P;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, sentenceId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.P + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.P));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        java.lang.String str11 = sentence6.toSentence();
        java.lang.String str12 = sentence6.toString();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "GNS");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory7 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean9 = sentenceFactory7.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory7.createParser(talkerId10, "MWV");
        net.sf.marineapi.nmea.sentence.Sentence sentence14 = sentenceFactory0.createParser(talkerId10, "RTE");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(sentenceFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence12);
        org.junit.Assert.assertNotNull(sentence14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isProprietary();
        char char10 = sentence6.getBeginChar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = sentence6.toSentence((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException9 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException9.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        java.lang.Throwable[] throwableArray17 = unsupportedSentenceException1.getSuppressed();
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException19 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException21 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException19.addSuppressed((java.lang.Throwable) unsupportedSentenceException21);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException21);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException25 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException27 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException29 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException27.addSuppressed((java.lang.Throwable) unsupportedSentenceException29);
        unsupportedSentenceException25.addSuppressed((java.lang.Throwable) unsupportedSentenceException29);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException33 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException35 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException37 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException35.addSuppressed((java.lang.Throwable) unsupportedSentenceException37);
        unsupportedSentenceException33.addSuppressed((java.lang.Throwable) unsupportedSentenceException37);
        unsupportedSentenceException25.addSuppressed((java.lang.Throwable) unsupportedSentenceException37);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException25);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.ZV;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, sentenceId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.ZV + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.ZV));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.YP;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "CUR");
        boolean boolean10 = sentenceFactory0.hasParser("ZDA");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YP + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.YP));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("MMB");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        int int13 = sentence6.getFieldCount();
        boolean boolean14 = sentence6.isValid();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId15 = net.sf.marineapi.nmea.sentence.TalkerId.AS;
        sentence6.setTalkerId(talkerId15);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + talkerId15 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AS + "'", talkerId15.equals(net.sf.marineapi.nmea.sentence.TalkerId.AS));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.RC;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "VHW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.BS;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence13 = sentenceFactory0.createParser(talkerId11, "Unable to register parser due security violation");
            org.junit.Assert.fail("Expected exception of type net.sf.marineapi.nmea.parser.UnsupportedSentenceException; message: Parser for type 'Unable to register parser due security violation' not found");
        } catch (net.sf.marineapi.nmea.parser.UnsupportedSentenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.RC + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.RC));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.BS + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.BS));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isValid();
        java.lang.String str8 = sentence6.toString();
        java.lang.Class<?> wildcardClass9 = sentence6.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isValid();
        java.lang.String str12 = sentence6.toSentence();
        java.lang.String str13 = sentence6.getSentenceId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "XDR" + "'", str13, "XDR");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        java.lang.Class<?> wildcardClass3 = sentenceFactory0.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory7 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean9 = sentenceFactory7.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory7.createParser(talkerId10, "MWV");
        net.sf.marineapi.nmea.sentence.Sentence sentence14 = sentenceFactory0.createParser(talkerId10, "CUR");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(sentenceFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence12);
        org.junit.Assert.assertNotNull(sentence14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException9 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException9.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        java.lang.Throwable[] throwableArray17 = unsupportedSentenceException1.getSuppressed();
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException19 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException21 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException23 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException25 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException23.addSuppressed((java.lang.Throwable) unsupportedSentenceException25);
        unsupportedSentenceException21.addSuppressed((java.lang.Throwable) unsupportedSentenceException25);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException29 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException31 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException33 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException31.addSuppressed((java.lang.Throwable) unsupportedSentenceException33);
        unsupportedSentenceException29.addSuppressed((java.lang.Throwable) unsupportedSentenceException33);
        unsupportedSentenceException21.addSuppressed((java.lang.Throwable) unsupportedSentenceException33);
        unsupportedSentenceException19.addSuppressed((java.lang.Throwable) unsupportedSentenceException21);
        java.lang.Throwable[] throwableArray38 = unsupportedSentenceException21.getSuppressed();
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException21);
        java.lang.Throwable[] throwableArray40 = unsupportedSentenceException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = unsupportedSentenceException1.getSuppressed();
        java.lang.String str4 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str4, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        java.lang.String str10 = sentence6.toString();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = sentence6.getTalkerId();
        boolean boolean12 = sentence6.isValid();
        int int13 = sentence6.getFieldCount();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isProprietary();
        java.lang.String str10 = sentence6.toSentence();
        java.lang.Class<?> wildcardClass11 = sentence6.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.II;
        sentence6.setTalkerId(talkerId11);
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.II + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.II));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isProprietary();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        char char9 = sentence6.getBeginChar();
        java.lang.String str10 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sentence6.toSentence((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Sentence max length exceeded -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException7 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException5.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException15 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException13.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        java.lang.Throwable[] throwableArray20 = unsupportedSentenceException3.getSuppressed();
        java.lang.String str21 = unsupportedSentenceException3.toString();
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str21, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        sentence6.reset();
        java.lang.String str11 = sentence6.toSentence();
        int int12 = sentence6.getFieldCount();
        int int13 = sentence6.getFieldCount();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isProprietary();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        int int11 = sentence6.getFieldCount();
        java.lang.String str12 = sentence6.toSentence();
        sentence6.setBeginChar('!');
        char char15 = sentence6.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '!' + "'", char15 == '!');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        char char9 = sentence6.getBeginChar();
        sentence6.reset();
        java.lang.String str11 = sentence6.toSentence();
        int int12 = sentence6.getFieldCount();
        java.lang.String str13 = sentence6.getSentenceId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "XDR" + "'", str13, "XDR");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("Unable to register parser due security violation");
        boolean boolean8 = sentenceFactory0.hasParser("MHU");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId9 = net.sf.marineapi.nmea.sentence.TalkerId.CS;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence11 = sentenceFactory0.createParser(talkerId9, sentenceId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + talkerId9 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CS + "'", talkerId9.equals(net.sf.marineapi.nmea.sentence.TalkerId.CS));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        boolean boolean8 = sentence6.isAISSentence();
        boolean boolean9 = sentence6.isValid();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        char char11 = sentence6.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        java.lang.String str3 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        char char10 = sentence6.getBeginChar();
        java.lang.String str11 = sentence6.getSentenceId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "XDR" + "'", str11, "XDR");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.MP;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "GBS");
        java.lang.String str11 = sentence10.toSentence();
        char char12 = sentence10.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.MP + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.MP));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$MPGBS,,,,,,,,*4B" + "'", str11, "$MPGBS,,,,,,,,*4B");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '$' + "'", char12 == '$');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        int int13 = sentence6.getFieldCount();
        boolean boolean14 = sentence6.isValid();
        sentence6.reset();
        boolean boolean16 = sentence6.isProprietary();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.Sentence sentence9 = sentenceFactory0.createParser("$YPCUR,,,,,,T,,,,T,B*23");
        java.lang.Class<?> wildcardClass10 = sentenceFactory0.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertNotNull(sentence9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        boolean boolean8 = sentence6.isAISSentence();
        boolean boolean9 = sentence6.isValid();
        boolean boolean10 = sentence6.isAISSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException9 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException9.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        java.lang.Class<?> wildcardClass17 = unsupportedSentenceException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "MWV");
        java.lang.String str6 = sentence5.toSentence();
        boolean boolean7 = sentence5.isProprietary();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$GBMWV,,,,,V*33" + "'", str6, "$GBMWV,,,,,V*33");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        boolean boolean8 = sentence6.isAISSentence();
        int int9 = sentence6.getFieldCount();
        char char10 = sentence6.getBeginChar();
        sentence6.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        sentence6.reset();
        java.lang.String str11 = sentence6.toSentence();
        java.lang.String str12 = sentence6.getSentenceId();
        int int13 = sentence6.getFieldCount();
        java.lang.String str14 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "XDR" + "'", str12, "XDR");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$VDXDR,,,,*5C" + "'", str14, "$VDXDR,,,,*5C");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException9 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException9.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException18 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException18);
        java.lang.Throwable[] throwableArray20 = unsupportedSentenceException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        java.lang.String str10 = sentence6.toString();
        java.lang.String str11 = sentence6.toString();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isProprietary();
        char char10 = sentence6.getBeginChar();
        char char11 = sentence6.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.VW;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "RPM");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VW + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.VW));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "GNS");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory7 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList8 = sentenceFactory7.listParsers();
        boolean boolean10 = sentenceFactory7.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence13 = sentenceFactory7.createParser(talkerId11, "XDR");
        boolean boolean14 = sentence13.isAISSentence();
        java.lang.String str15 = sentence13.toString();
        char char16 = sentence13.getBeginChar();
        sentence13.reset();
        java.lang.String str18 = sentence13.getSentenceId();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId19 = sentence13.getTalkerId();
        net.sf.marineapi.nmea.sentence.Sentence sentence21 = sentenceFactory0.createParser(talkerId19, "GSV");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(sentenceFactory7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$VDXDR,,,,*5C" + "'", str15, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '$' + "'", char16 == '$');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "XDR" + "'", str18, "XDR");
        org.junit.Assert.assertTrue("'" + talkerId19 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId19.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence21);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("Unable to register parser due security violation");
        java.lang.Throwable[] throwableArray2 = unsupportedSentenceException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        boolean boolean7 = sentenceFactory0.hasParser("VWR");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser("GSA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.RC;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "VHW");
        java.lang.String str11 = sentence10.toSentence();
        java.lang.String str12 = sentence10.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.RC + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.RC));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$RCVHW,,T,,M,,N,,K*44" + "'", str11, "$RCVHW,,T,,M,,N,,K*44");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$RCVHW,,T,,M,,N,,K*44" + "'", str12, "$RCVHW,,T,,M,,N,,K*44");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("HDT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isValid();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        boolean boolean7 = sentenceFactory0.hasParser("VWR");
        boolean boolean9 = sentenceFactory0.hasParser("TTM");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.HE;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory0.createParser(talkerId10, sentenceId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.HE + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.HE));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.getSentenceId();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId9 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "XDR" + "'", str8, "XDR");
        org.junit.Assert.assertTrue("'" + talkerId9 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId9.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException9 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException9.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        java.lang.Throwable[] throwableArray17 = unsupportedSentenceException1.getSuppressed();
        java.lang.String str18 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str18, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isAISSentence();
        boolean boolean12 = sentence6.isProprietary();
        boolean boolean13 = sentence6.isAISSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("Unable to register parser due security violation");
        boolean boolean8 = sentenceFactory0.hasParser("MHU");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId9 = net.sf.marineapi.nmea.sentence.TalkerId.TI;
        net.sf.marineapi.nmea.sentence.Sentence sentence11 = sentenceFactory0.createParser(talkerId9, "GGA");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + talkerId9 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.TI + "'", talkerId9.equals(net.sf.marineapi.nmea.sentence.TalkerId.TI));
        org.junit.Assert.assertNotNull(sentence11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.OC;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA");
            org.junit.Assert.fail("Expected exception of type net.sf.marineapi.nmea.parser.UnsupportedSentenceException; message: Parser for type 'net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA' not found");
        } catch (net.sf.marineapi.nmea.parser.UnsupportedSentenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OC + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.OC));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isValid();
        java.lang.String str12 = sentence6.toSentence();
        boolean boolean13 = sentence6.isProprietary();
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory14 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList15 = sentenceFactory14.listParsers();
        boolean boolean17 = sentenceFactory14.hasParser("\r\n");
        java.util.List<java.lang.String> strList18 = sentenceFactory14.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId19 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence21 = sentenceFactory14.createParser(talkerId19, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId22 = net.sf.marineapi.nmea.sentence.TalkerId.RC;
        net.sf.marineapi.nmea.sentence.Sentence sentence24 = sentenceFactory14.createParser(talkerId22, "VHW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId25 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        sentence24.setTalkerId(talkerId25);
        sentence6.setTalkerId(talkerId25);
        java.lang.String str29 = sentence6.toSentence((int) '*');
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sentenceFactory14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + talkerId19 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId19.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence21);
        org.junit.Assert.assertTrue("'" + talkerId22 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.RC + "'", talkerId22.equals(net.sf.marineapi.nmea.sentence.TalkerId.RC));
        org.junit.Assert.assertNotNull(sentence24);
        org.junit.Assert.assertTrue("'" + talkerId25 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId25.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "$LCXDR,,,,*41" + "'", str29, "$LCXDR,,,,*41");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$VDXDR,,,,*5C" + "'", str9, "$VDXDR,,,,*5C");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        sentence6.reset();
        sentence6.reset();
        char char13 = sentence6.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '$' + "'", char13 == '$');
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean8 = sentenceFactory0.hasParser("$GBMWV,,,,,V*33");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.AD;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory0.createParser(talkerId10, sentenceId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.AD));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("CUR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        boolean boolean8 = sentence6.isAISSentence();
        boolean boolean9 = sentence6.isValid();
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        int int11 = sentence6.getFieldCount();
        boolean boolean12 = sentence6.isValid();
        java.lang.String str13 = sentence6.getSentenceId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "XDR" + "'", str13, "XDR");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isProprietary();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isValid();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.OM;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "TXT");
        boolean boolean9 = sentence8.isValid();
        boolean boolean10 = sentence8.isValid();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.MP;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "GBS");
        sentence10.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.MP + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.MP));
        org.junit.Assert.assertNotNull(sentence10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        char char10 = sentence6.getBeginChar();
        boolean boolean11 = sentence6.isValid();
        char char12 = sentence6.getBeginChar();
        java.lang.String str13 = sentence6.getSentenceId();
        int int14 = sentence6.getFieldCount();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '$' + "'", char10 == '$');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '$' + "'", char12 == '$');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "XDR" + "'", str13, "XDR");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        java.lang.String str8 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str8, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.II;
        sentence6.setTalkerId(talkerId11);
        sentence6.reset();
        char char14 = sentence6.getBeginChar();
        boolean boolean15 = sentence6.isAISSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.II + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.II));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '$' + "'", char14 == '$');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isProprietary();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.OC;
        sentence6.setTalkerId(talkerId11);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OC + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.OC));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        boolean boolean7 = sentenceFactory0.hasParser("VWR");
        boolean boolean9 = sentenceFactory0.hasParser("TTM");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.AT;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory0.createParser(talkerId10, "");
            org.junit.Assert.fail("Expected exception of type net.sf.marineapi.nmea.parser.UnsupportedSentenceException; message: Parser for type '' not found");
        } catch (net.sf.marineapi.nmea.parser.UnsupportedSentenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AT + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.AT));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.YP;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "CUR");
        boolean boolean10 = sentenceFactory0.hasParser("exception not thrown, resolved to");
        java.lang.Class<?> wildcardClass11 = sentenceFactory0.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YP + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.YP));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "MWV");
        java.lang.String str6 = sentence5.toSentence();
        char char7 = sentence5.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$GBMWV,,,,,V*33" + "'", str6, "$GBMWV,,,,,V*33");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '$' + "'", char7 == '$');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = net.sf.marineapi.nmea.sentence.TalkerId.II;
        sentence6.setTalkerId(talkerId11);
        sentence6.reset();
        int int14 = sentence6.getFieldCount();
        java.lang.String str15 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.II + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.II));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$IIXDR,,,,*4E" + "'", str15, "$IIXDR,,,,*4E");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("DTM");
        java.lang.String str2 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: DTM" + "'", str2, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: DTM");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.YP;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "CUR");
        boolean boolean10 = sentenceFactory0.hasParser("exception not thrown, resolved to");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YP + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.YP));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        int int11 = sentence6.getFieldCount();
        java.lang.String str12 = sentence6.toSentence();
        sentence6.setBeginChar('!');
        java.lang.String str15 = sentence6.getSentenceId();
        java.lang.String str16 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "XDR" + "'", str15, "XDR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!VDXDR,,,,*5C" + "'", str16, "!VDXDR,,,,*5C");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.getSentenceId();
        char char9 = sentence6.getBeginChar();
        boolean boolean10 = sentence6.isProprietary();
        char char11 = sentence6.getBeginChar();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "XDR" + "'", str8, "XDR");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException6 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("\r\n");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException6);
        java.lang.String str8 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA" + "'", str8, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: RSA");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isValid();
        java.lang.String str12 = sentence6.toSentence();
        boolean boolean13 = sentence6.isProprietary();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId14 = sentence6.getTalkerId();
        int int15 = sentence6.getFieldCount();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + talkerId14 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId14.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        char char9 = sentence6.getBeginChar();
        sentence6.reset();
        java.lang.String str11 = sentence6.toSentence();
        java.lang.String str13 = sentence6.toSentence((int) (short) 100);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$VDXDR,,,,*5C" + "'", str13, "$VDXDR,,,,*5C");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.LC;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "GNS");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("GGA");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.LC + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.LC));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        char char13 = sentence6.getBeginChar();
        java.lang.String str14 = sentence6.toString();
        boolean boolean15 = sentence6.isProprietary();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '$' + "'", char13 == '$');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$VDXDR,,,,*5C" + "'", str14, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        int int13 = sentence6.getFieldCount();
        boolean boolean14 = sentence6.isValid();
        sentence6.reset();
        boolean boolean16 = sentence6.isValid();
        boolean boolean17 = sentence6.isValid();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException7 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException5.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException15 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException13.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException21 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray22 = unsupportedSentenceException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = unsupportedSentenceException21.getSuppressed();
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException21);
        java.lang.Throwable[] throwableArray25 = unsupportedSentenceException21.getSuppressed();
        java.lang.String str26 = unsupportedSentenceException21.toString();
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str26, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("Unable to register parser due security violation");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException7 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException5.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException7);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException15 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException13.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException15);
        java.lang.Throwable[] throwableArray19 = unsupportedSentenceException3.getSuppressed();
        java.lang.Throwable[] throwableArray20 = unsupportedSentenceException3.getSuppressed();
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        java.lang.Throwable[] throwableArray22 = unsupportedSentenceException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.getSentenceId();
        char char9 = sentence6.getBeginChar();
        boolean boolean10 = sentence6.isAISSentence();
        boolean boolean11 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId12 = net.sf.marineapi.nmea.sentence.TalkerId.SA;
        sentence6.setTalkerId(talkerId12);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "XDR" + "'", str8, "XDR");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '$' + "'", char9 == '$');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + talkerId12 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.SA + "'", talkerId12.equals(net.sf.marineapi.nmea.sentence.TalkerId.SA));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        java.lang.String str10 = sentence6.toString();
        boolean boolean11 = sentence6.isAISSentence();
        java.lang.String str12 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        sentenceFactory0.reset();
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory7 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList8 = sentenceFactory7.listParsers();
        boolean boolean10 = sentenceFactory7.hasParser("\r\n");
        boolean boolean12 = sentenceFactory7.hasParser("MWV");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId13 = net.sf.marineapi.nmea.sentence.TalkerId.OM;
        net.sf.marineapi.nmea.sentence.Sentence sentence15 = sentenceFactory7.createParser(talkerId13, "TXT");
        boolean boolean16 = sentence15.isValid();
        sentence15.reset();
        sentence15.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId19 = sentence15.getTalkerId();
        net.sf.marineapi.nmea.sentence.Sentence sentence21 = sentenceFactory0.createParser(talkerId19, "XDR");
        // The following exception was thrown during execution in test generation
        try {
            sentence21.setBeginChar(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sentenceFactory7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + talkerId13 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId13.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + talkerId19 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId19.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence21);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        sentence6.reset();
        java.lang.String str11 = sentence6.toSentence();
        int int12 = sentence6.getFieldCount();
        java.lang.String str13 = sentence6.toString();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$VDXDR,,,,*5C" + "'", str11, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$VDXDR,,,,*5C" + "'", str13, "$VDXDR,,,,*5C");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        int int13 = sentence6.getFieldCount();
        boolean boolean14 = sentence6.isValid();
        boolean boolean15 = sentence6.isProprietary();
        java.lang.String str16 = sentence6.getSentenceId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "XDR" + "'", str16, "XDR");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.RC;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "VHW");
        boolean boolean11 = sentence10.isValid();
        sentence10.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.RC + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.RC));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean8 = sentenceFactory0.hasParser("$GBMWV,,,,,V*33");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.AB;
        net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory0.createParser(talkerId10, "VHW");
        java.lang.Class<?> wildcardClass13 = sentenceFactory0.getClass();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AB + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.AB));
        org.junit.Assert.assertNotNull(sentence12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isValid();
        java.lang.String str12 = sentence6.toSentence();
        boolean boolean13 = sentence6.isProprietary();
        java.lang.String str14 = sentence6.toSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "$VDXDR,,,,*5C" + "'", str14, "$VDXDR,,,,*5C");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "MWV");
        boolean boolean7 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.CM;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "VDM");
        char char11 = sentence10.getBeginChar();
        boolean boolean12 = sentence10.isValid();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CM + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.CM));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '!' + "'", char11 == '!');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        int int11 = sentence6.getFieldCount();
        java.lang.String str12 = sentence6.toSentence();
        sentence6.setBeginChar('!');
        java.lang.String str16 = sentence6.toSentence((int) (byte) 100);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!VDXDR,,,,*5C" + "'", str16, "!VDXDR,,,,*5C");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.OM;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "TXT");
        java.lang.String str9 = sentence8.getSentenceId();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence8.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TXT" + "'", str9, "TXT");
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.MP;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "GBS");
        boolean boolean12 = sentenceFactory0.hasParser("$GBMWV,,,,,V*33");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.MP + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.MP));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        sentence6.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isProprietary();
        java.lang.String str10 = sentence6.toSentence();
        boolean boolean11 = sentence6.isProprietary();
        sentence6.setBeginChar('$');
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$VDXDR,,,,*5C" + "'", str10, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        java.lang.String str9 = sentence6.getSentenceId();
        java.lang.String str10 = sentence6.getSentenceId();
        boolean boolean11 = sentence6.isAISSentence();
        java.lang.String str12 = sentence6.getSentenceId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XDR" + "'", str9, "XDR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "XDR" + "'", str10, "XDR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "XDR" + "'", str12, "XDR");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.TalkerId talkerId1 = net.sf.marineapi.nmea.sentence.TalkerId.parse("VBW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean8 = sentenceFactory0.hasParser("$GBMWV,,,,,V*33");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.OM;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory0.createParser(talkerId10, sentenceId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "MWV");
        sentenceFactory0.reset();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser("VBW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.YP;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "CUR");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        boolean boolean11 = sentenceFactory0.hasParser("GGA");
        boolean boolean13 = sentenceFactory0.hasParser("ALK");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.YP + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.YP));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId5 = net.sf.marineapi.nmea.sentence.TalkerId.OS;
        net.sf.marineapi.nmea.sentence.Sentence sentence7 = sentenceFactory0.createParser(talkerId5, "VBW");
        net.sf.marineapi.nmea.sentence.Sentence sentence9 = sentenceFactory0.createParser("$YPCUR,,,,,,T,,,,T,B*23");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = net.sf.marineapi.nmea.sentence.TalkerId.EC;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence12 = sentenceFactory0.createParser(talkerId10, "$RCVHW,,T,,M,,N,,K*44");
            org.junit.Assert.fail("Expected exception of type net.sf.marineapi.nmea.parser.UnsupportedSentenceException; message: Parser for type '$RCVHW,,T,,M,,N,,K*44' not found");
        } catch (net.sf.marineapi.nmea.parser.UnsupportedSentenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + talkerId5 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OS + "'", talkerId5.equals(net.sf.marineapi.nmea.sentence.TalkerId.OS));
        org.junit.Assert.assertNotNull(sentence7);
        org.junit.Assert.assertNotNull(sentence9);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.EC + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.EC));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        boolean boolean5 = sentenceFactory0.hasParser("HDT");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.SS;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "unexpected exception thrown:");
            org.junit.Assert.fail("Expected exception of type net.sf.marineapi.nmea.parser.UnsupportedSentenceException; message: Parser for type 'unexpected exception thrown:' not found");
        } catch (net.sf.marineapi.nmea.parser.UnsupportedSentenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.SS + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.SS));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        boolean boolean4 = sentenceFactory0.hasParser("TTM");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        sentenceFactory0.reset();
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory7 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList8 = sentenceFactory7.listParsers();
        boolean boolean10 = sentenceFactory7.hasParser("\r\n");
        boolean boolean12 = sentenceFactory7.hasParser("MWV");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId13 = net.sf.marineapi.nmea.sentence.TalkerId.OM;
        net.sf.marineapi.nmea.sentence.Sentence sentence15 = sentenceFactory7.createParser(talkerId13, "TXT");
        boolean boolean16 = sentence15.isValid();
        sentence15.reset();
        sentence15.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId19 = sentence15.getTalkerId();
        net.sf.marineapi.nmea.sentence.Sentence sentence21 = sentenceFactory0.createParser(talkerId19, "XDR");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId22 = null;
        net.sf.marineapi.nmea.sentence.SentenceId sentenceId23 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence24 = sentenceFactory0.createParser(talkerId22, sentenceId23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sentenceFactory7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + talkerId13 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId13.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + talkerId19 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId19.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence21);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        boolean boolean5 = sentenceFactory0.hasParser("MWV");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId6 = net.sf.marineapi.nmea.sentence.TalkerId.OM;
        net.sf.marineapi.nmea.sentence.Sentence sentence8 = sentenceFactory0.createParser(talkerId6, "TXT");
        boolean boolean9 = sentence8.isValid();
        sentence8.reset();
        sentence8.reset();
        boolean boolean12 = sentence8.isProprietary();
        boolean boolean13 = sentence8.isAISSentence();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + talkerId6 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.OM + "'", talkerId6.equals(net.sf.marineapi.nmea.sentence.TalkerId.OM));
        org.junit.Assert.assertNotNull(sentence8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("\r\n");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray6 = unsupportedSentenceException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = unsupportedSentenceException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = unsupportedSentenceException5.getSuppressed();
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException3);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException12 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException14 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException16 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException18 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException16.addSuppressed((java.lang.Throwable) unsupportedSentenceException18);
        unsupportedSentenceException14.addSuppressed((java.lang.Throwable) unsupportedSentenceException18);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException22 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException24 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException26 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException24.addSuppressed((java.lang.Throwable) unsupportedSentenceException26);
        unsupportedSentenceException22.addSuppressed((java.lang.Throwable) unsupportedSentenceException26);
        unsupportedSentenceException14.addSuppressed((java.lang.Throwable) unsupportedSentenceException26);
        unsupportedSentenceException12.addSuppressed((java.lang.Throwable) unsupportedSentenceException14);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException32 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        java.lang.Throwable[] throwableArray33 = unsupportedSentenceException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = unsupportedSentenceException32.getSuppressed();
        unsupportedSentenceException14.addSuppressed((java.lang.Throwable) unsupportedSentenceException32);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException32);
        java.lang.Class<?> wildcardClass37 = unsupportedSentenceException32.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        int int11 = sentence6.getFieldCount();
        java.lang.String str12 = sentence6.toSentence();
        sentence6.setBeginChar('!');
        net.sf.marineapi.nmea.sentence.TalkerId talkerId15 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + talkerId15 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId15.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException1 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException3 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException5 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException3.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException5);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException9 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException11 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException13 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException11.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException9.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException13);
        net.sf.marineapi.nmea.parser.UnsupportedSentenceException unsupportedSentenceException18 = new net.sf.marineapi.nmea.parser.UnsupportedSentenceException("RSA");
        unsupportedSentenceException1.addSuppressed((java.lang.Throwable) unsupportedSentenceException18);
        java.lang.String str20 = unsupportedSentenceException1.toString();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: " + "'", str20, "net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isValid();
        java.lang.String str9 = sentence6.toSentence(82);
        boolean boolean10 = sentence6.isProprietary();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId11 = sentence6.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "$VDXDR,,,,*5C" + "'", str9, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + talkerId11 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId11.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId3 = net.sf.marineapi.nmea.sentence.TalkerId.GB;
        net.sf.marineapi.nmea.sentence.Sentence sentence5 = sentenceFactory0.createParser(talkerId3, "MWV");
        boolean boolean7 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId8 = net.sf.marineapi.nmea.sentence.TalkerId.CM;
        net.sf.marineapi.nmea.sentence.Sentence sentence10 = sentenceFactory0.createParser(talkerId8, "VDM");
        char char11 = sentence10.getBeginChar();
        boolean boolean12 = sentence10.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId13 = sentence10.getTalkerId();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + talkerId3 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.GB + "'", talkerId3.equals(net.sf.marineapi.nmea.sentence.TalkerId.GB));
        org.junit.Assert.assertNotNull(sentence5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + talkerId8 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CM + "'", talkerId8.equals(net.sf.marineapi.nmea.sentence.TalkerId.CM));
        org.junit.Assert.assertNotNull(sentence10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '!' + "'", char11 == '!');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + talkerId13 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.CM + "'", talkerId13.equals(net.sf.marineapi.nmea.sentence.TalkerId.CM));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        boolean boolean7 = sentence6.isAISSentence();
        java.lang.String str8 = sentence6.toString();
        boolean boolean9 = sentence6.isAISSentence();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId10 = sentence6.getTalkerId();
        int int11 = sentence6.getFieldCount();
        java.lang.String str12 = sentence6.toSentence();
        sentence6.setBeginChar('!');
        // The following exception was thrown during execution in test generation
        try {
            sentence6.setBeginChar('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid begin char; expected '$' or '!'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + talkerId10 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId10.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "$VDXDR,,,,*5C" + "'", str12, "$VDXDR,,,,*5C");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.marineapi.nmea.sentence.Sentence sentence2 = sentenceFactory0.createParser("net.sf.marineapi.nmea.parser.UnsupportedSentenceException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String is not a sentence");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sentenceFactory0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("\r\n");
        net.sf.marineapi.nmea.sentence.TalkerId talkerId4 = net.sf.marineapi.nmea.sentence.TalkerId.VD;
        net.sf.marineapi.nmea.sentence.Sentence sentence6 = sentenceFactory0.createParser(talkerId4, "XDR");
        int int7 = sentence6.getFieldCount();
        java.lang.String str8 = sentence6.toString();
        int int9 = sentence6.getFieldCount();
        boolean boolean10 = sentence6.isAISSentence();
        char char11 = sentence6.getBeginChar();
        boolean boolean12 = sentence6.isAISSentence();
        int int13 = sentence6.getFieldCount();
        boolean boolean14 = sentence6.isValid();
        sentence6.reset();
        net.sf.marineapi.nmea.sentence.TalkerId talkerId16 = net.sf.marineapi.nmea.sentence.TalkerId.AI;
        sentence6.setTalkerId(talkerId16);
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + talkerId4 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.VD + "'", talkerId4.equals(net.sf.marineapi.nmea.sentence.TalkerId.VD));
        org.junit.Assert.assertNotNull(sentence6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "$VDXDR,,,,*5C" + "'", str8, "$VDXDR,,,,*5C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '$' + "'", char11 == '$');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + talkerId16 + "' != '" + net.sf.marineapi.nmea.sentence.TalkerId.AI + "'", talkerId16.equals(net.sf.marineapi.nmea.sentence.TalkerId.AI));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("!AIVDM,1,1,,A,13aEOK?P00PD2wVMdLDRhgvL289?,0*26");
        sentenceFactory0.reset();
        boolean boolean5 = sentenceFactory0.hasParser("MMB");
        boolean boolean7 = sentenceFactory0.hasParser("VWR");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
    }
}

