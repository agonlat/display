package com.example.fluganzeigetafel.Tests;

import com.example.fluganzeigetafel.Suborders.Suborder;
import org.junit.Test;
import org.junit.*;

public class SubordersTest {


        @Test
        public void testETTBE () {
            Suborder suborder = new Suborder();
            suborder.setETTBE("ETTBEABC");
            Assert.assertEquals("ETTBEABC", suborder.getETTBE());
        }

        @Test
        public void testETTEN () {
            Suborder suborder = new Suborder();
            suborder.setETTEN("ETTEN123");
            Assert.assertEquals("ETTEN123", suborder.getETTEN());
        }

        @Test
        public void testATTBE () {
            Suborder suborder = new Suborder();
            suborder.setATTBE("ATTBE456");
            Assert.assertEquals("ATTBE456", suborder.getATTBE());
        }

        @Test
        public void testATTEN () {
            Suborder suborder = new Suborder();
            suborder.setATTEN("ATTEN789");
            Assert.assertEquals("ATTEN789", suborder.getATTEN());
        }





        @Test
        public void testLUPDN () {
            Suborder suborder = new Suborder();
            suborder.setLUPDN("LUPDNABC");
            Assert.assertEquals("LUPDNABC", suborder.getLUPDN());
        }

        @Test
        public void testLUPDT () {
            Suborder suborder = new Suborder();
            suborder.setLUPDT("LUPDT123");
            Assert.assertEquals("LUPDT123", suborder.getLUPDT());
        }

        @Test
        public void testLUPDV () {
            Suborder suborder = new Suborder();
            suborder.setLUPDV("LUPDV456");
            Assert.assertEquals("LUPDV456", suborder.getLUPDV());
        }

        @Test
        public void testLZUAU () {
            Suborder suborder = new Suborder();
            suborder.setLZUAU("LZUAU789");
            Assert.assertEquals("LZUAU789", suborder.getLZUAU());
        }

        @Test
        public void testMENGE () {
            Suborder suborder = new Suborder();
            suborder.setMENGE("MENGEABC");
            Assert.assertEquals("MENGEABC", suborder.getMENGE());
        }

        @Test
        public void testSTTBE () {
            Suborder suborder = new Suborder();
            suborder.setSTTBE("STTBE123");
            Assert.assertEquals("STTBE123", suborder.getSTTBE());
        }

        @Test
        public void testSTTEN () {
            Suborder suborder = new Suborder();
            suborder.setSTTEN("STTEN456");
            Assert.assertEquals("STTEN456", suborder.getSTTEN());
        }

        @Test
        public void testUAKEY () {
            Suborder suborder = new Suborder();
            suborder.setUAKEY("UAKEY789");
            Assert.assertEquals("UAKEY789", suborder.getUAKEY());
        }

        @Test
        public void testUAPIR () {
            Suborder suborder = new Suborder();
            suborder.setUAPIR("UAPIRABC");
            Assert.assertEquals("UAPIRABC", suborder.getUAPIR());
        }

        @Test
        public void testUASAA () {
            Suborder suborder = new Suborder();
            suborder.setUASAA("UASAA123");
            Assert.assertEquals("UASAA123", suborder.getUASAA());
        }

        @Test
        public void testUASAU () {
            Suborder suborder = new Suborder();
            suborder.setUASAU("UASAU456");
            Assert.assertEquals("UASAU456", suborder.getUASAU());
        }

        @Test
        public void testXUA () {
            Suborder suborder = new Suborder();
            suborder.setXUA("XUA789");
            Assert.assertEquals("XUA789", suborder.getXUA());
        }

        @Test
        public void testZINFO () {
            Suborder suborder = new Suborder();
            suborder.setZINFO("ZINFOABC");
            Assert.assertEquals("ZINFOABC", suborder.getZINFO());
        }

        @Test
        public void testDFKEY () {
            Suborder suborder = new Suborder();
            suborder.setDFKEY("DFKEY123");
            Assert.assertEquals("DFKEY123", suborder.getDFKEY());
        }

        @Test
        public void testORTFR () {
            Suborder suborder = new Suborder();
            suborder.setORTFR("ORTFR456");
            Assert.assertEquals("ORTFR456", suborder.getORTFR());
        }

        @Test
        public void testORTTO () {
            Suborder suborder = new Suborder();
            suborder.setORTTO("ORTTO789");
            Assert.assertEquals("ORTTO789", suborder.getORTTO());
        }

        @Test
        public void testUAART () {
            Suborder suborder = new Suborder();
            suborder.setUAART("UAARTABC");
            Assert.assertEquals("UAARTABC", suborder.getUAART());
        }

        @Test
        public void testUAREE () {
            Suborder suborder = new Suborder();
            suborder.setUAREE("UAREE123");
            Assert.assertEquals("UAREE123", suborder.getUAREE());
        }

        @Test
        public void testFGKEY () {
            Suborder suborder = new Suborder();
            suborder.setFGKEY("FGKEY456");
            Assert.assertEquals("FGKEY456", suborder.getFGKEY());
        }

        @Test
        public void testUAABF () {
            Suborder suborder = new Suborder();
            suborder.setUAABF("UAABF789");
            Assert.assertEquals("UAABF789", suborder.getUAABF());
        }

        @Test
        public void testREKEY () {
            Suborder suborder = new Suborder();
            suborder.setREKEY("REKEYABC");
            Assert.assertEquals("REKEYABC", suborder.getREKEY());
        }

        @Test
        public void testSPREK () {
            Suborder suborder = new Suborder();
            suborder.setSPREK("SPREK123");
            Assert.assertEquals("SPREK123", suborder.getSPREK());
        }

        @Test
        public void testATT30 () {
            Suborder suborder = new Suborder();
            suborder.setATT30("ATT30123");
            Assert.assertEquals("ATT30123", suborder.getATT30());
        }

        @Test
        public void testATT50 () {
            Suborder suborder = new Suborder();
            suborder.setATT50("ATT50456");
            Assert.assertEquals("ATT50456", suborder.getATT50());
        }

        @Test
        public void testATT55 () {
            Suborder suborder = new Suborder();
            suborder.setATT55("ATT55456");
            Assert.assertEquals("ATT55456", suborder.getATT55());
        }

        @Test
        public void testATT60 () {
            Suborder suborder = new Suborder();
            suborder.setATT60("ATT60567");
            Assert.assertEquals("ATT60567", suborder.getATT60());
        }

        @Test
        public void testATT70 () {
            Suborder suborder = new Suborder();
            suborder.setATT70("ATT70890");
            Assert.assertEquals("ATT70890", suborder.getATT70());
        }

        @Test
        public void testATT75 () {
            Suborder suborder = new Suborder();
            suborder.setATT75("ATT75901");
            Assert.assertEquals("ATT75901", suborder.getATT75());
        }

        @Test
        public void testATTER () {
            Suborder suborder = new Suborder();
            suborder.setATTER("ATTER234");
            Assert.assertEquals("ATTER234", suborder.getATTER());
        }

        @Test
        public void testUAAGE () {
            Suborder suborder = new Suborder();
            suborder.setUAAGE("UAAGE567");
            Assert.assertEquals("UAAGE567", suborder.getUAAGE());
        }

        @Test
        public void testEINHE () {
            Suborder suborder = new Suborder();
            suborder.setEINHE("EINHE678");
            Assert.assertEquals("EINHE678", suborder.getEINHE());
        }




        @Test
        public void testATT20 () {
            Suborder suborder = new Suborder();
            suborder.setATT20("ATT20987");
            Assert.assertEquals("ATT20987", suborder.getATT20());
        }

        @Test
        public void testQKB () {
            Suborder suborder = new Suborder();
            suborder.setQKB("QKB345");
            Assert.assertEquals("QKB345", suborder.getQKB());
        }

        @Test
        public void testSAA20 () {
            Suborder suborder = new Suborder();
            suborder.setSAA20("SAA20987");
            Assert.assertEquals("SAA20987", suborder.getSAA20());
        }

        @Test
        public void testSAAOF () {
            Suborder suborder = new Suborder();
            suborder.setSAAOF("SAAOF567");
            Assert.assertEquals("SAAOF567", suborder.getSAAOF());
        }

        @Test
        public void testSKA () {
            Suborder suborder = new Suborder();
            suborder.setSKA("SKA678");
            Assert.assertEquals("SKA678", suborder.getSKA());
        }

        @Test
        public void testSTT20 () {
            Suborder suborder = new Suborder();
            suborder.setSTT20("STT20987");
            Assert.assertEquals("STT20987", suborder.getSTT20());
        }

        @Test
        public void testURK () {
            Suborder suborder = new Suborder();
            suborder.setURK("URK567");
            Assert.assertEquals("URK567", suborder.getURK());
        }

        @Test
        public void testRELFK () {
            Suborder suborder = new Suborder();
            suborder.setRELFK("RELFK678");
            Assert.assertEquals("RELFK678", suborder.getRELFK());
        }

        @Test
        public void testUAINF () {
            Suborder suborder = new Suborder();
            suborder.setUAINF("UAINF345");
            Assert.assertEquals("UAINF345", suborder.getUAINF());
        }

        @Test
        public void testETT30 () {
            Suborder suborder = new Suborder();
            suborder.setETT30("ETT30987");
            Assert.assertEquals("ETT30987", suborder.getETT30());
        }

        @Test
        public void testUAKSL () {
            Suborder suborder = new Suborder();
            suborder.setUAKSL("UAKSL567");
            Assert.assertEquals("UAKSL567", suborder.getUAKSL());
        }

        @Test
        public void testSPKEY () {
            Suborder suborder = new Suborder();
            suborder.setSPKEY("SPKEY678");
            Assert.assertEquals("SPKEY678", suborder.getSPKEY());
        }

        @Test
        public void testMENG2 () {
            Suborder suborder = new Suborder();
            suborder.setMENG2("MENG234");
            Assert.assertEquals("MENG234", suborder.getMENG2());
        }

        @Test
        public void testCINFO () {
            Suborder suborder = new Suborder();
            suborder.setCINFO("CINFO567");
            Assert.assertEquals("CINFO567", suborder.getCINFO());
        }

        @Test
        public void testATT40 () {
            Suborder suborder = new Suborder();
            suborder.setATT40("ATT40567");
            Assert.assertEquals("ATT40567", suborder.getATT40());
        }

        @Test
        public void testSTLIK () {
            Suborder suborder = new Suborder();
            suborder.setSTLIK("STLIK234");
            Assert.assertEquals("STLIK234", suborder.getSTLIK());
        }

        @Test
        public void testOKEYN () {
            Suborder suborder = new Suborder();
            suborder.setOKEYN("OKEYN567");
            Assert.assertEquals("OKEYN567", suborder.getOKEYN());
        }

        @Test
        public void testABI () {
            Suborder suborder = new Suborder();
            suborder.setABI("ABI234");
            Assert.assertEquals("ABI234", suborder.getABI());
        }

        @Test
        public void testEBI () {
            Suborder suborder = new Suborder();
            suborder.setEBI("EBI567");
            Assert.assertEquals("EBI567", suborder.getEBI());
        }

        @Test
        public void testSBI () {
            Suborder suborder = new Suborder();
            suborder.setSBI("SBI234");
            Assert.assertEquals("SBI234", suborder.getSBI());
        }

        @Test
        public void testTOURK () {
            Suborder suborder = new Suborder();
            suborder.setTOURK("TOURK567");
            Assert.assertEquals("TOURK567", suborder.getTOURK());
        }

        @Test
        public void testEINH2 () {
            Suborder suborder = new Suborder();
            suborder.setEINH2("EINH2567");
            Assert.assertEquals("EINH2567", suborder.getEINH2());
        }

        @Test
        public void testEINH3 () {
            Suborder suborder = new Suborder();
            suborder.setEINH3("EINH3567");
            Assert.assertEquals("EINH3567", suborder.getEINH3());
        }

        @Test
        public void testEINH4 () {
            Suborder suborder = new Suborder();
            suborder.setEINH4("EINH4567");
            Assert.assertEquals("EINH4567", suborder.getEINH4());
        }

        @Test
        public void testMENG3 () {
            Suborder suborder = new Suborder();
            suborder.setMENG3("MENG3567");
            Assert.assertEquals("MENG3567", suborder.getMENG3());
        }

        @Test
        public void testMENG4 () {
            Suborder suborder = new Suborder();
            suborder.setMENG4("MENG4567");
            Assert.assertEquals("MENG4567", suborder.getMENG4());
        }

        @Test
        public void testXCABA() {
            Suborder suborder = new Suborder();
            suborder.setXCABA("XCABA567");
            Assert.assertEquals("XCABA567", suborder.getXCABA());
        }

    }

