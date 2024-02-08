package com.example.fluganzeigetafel.Tests;

import com.example.fluganzeigetafel.Orders.Order;
import org.junit.Test;
import org.junit.*;

public class OrderTest {
    @Test
    public void testAUKEY() {
        Order order = new Order();
        order.setAUKEY("AUKEY123");
        Assert.assertEquals("AUKEY123", order.getAUKEY());
    }

    @Test
    public void testDISPO() {
        Order order = new Order();
        order.setDISPO("DISPO456");
        Assert.assertEquals("DISPO456", order.getDISPO());
    }

    @Test
    public void testDIB() {
        Order order = new Order();
        order.setDIB("DIB789");
        Assert.assertEquals("DIB789", order.getDIB());
    }

    @Test
    public void testJTP() {
        Order order = new Order();
        order.setJTP("JTPABC");
        Assert.assertEquals("JTPABC", order.getJTP());
    }

    @Test
    public void testAUSAA() {
        Order order = new Order();
        order.setAUSAA("AUSAA123");
        Assert.assertEquals("AUSAA123", order.getAUSAA());
    }

    @Test
    public void testAUSAU() {
        Order order = new Order();
        order.setAUSAU("AUSAU456");
        Assert.assertEquals("AUSAU456", order.getAUSAU());
    }

    @Test
    public void testAUKNL() {
        Order order = new Order();
        order.setAUKNL("AUKNL789");
        Assert.assertEquals("AUKNL789", order.getAUKNL());
    }

    @Test
    public void testAUKNS() {
        Order order = new Order();
        order.setAUKNS("AUKNSABC");
        Assert.assertEquals("AUKNSABC", order.getAUKNS());
    }

    @Test
    public void testFGKEY() {
        Order order = new Order();
        order.setFGKEY("FGKEY123");
        Assert.assertEquals("FGKEY123", order.getFGKEY());
    }

    @Test
    public void testPLKEY() {
        Order order = new Order();
        order.setPLKEY("PLKEY456");
        Assert.assertEquals("PLKEY456", order.getPLKEY());
    }

    @Test
    public void testORTFR() {
        Order order = new Order();
        order.setORTFR("ORTFR789");
        Assert.assertEquals("ORTFR789", order.getORTFR());
    }

    @Test
    public void testORTTO() {
        Order order = new Order();
        order.setORTTO("ORTTOABC");
        Assert.assertEquals("ORTTOABC", order.getORTTO());
    }

    @Test
    public void testMENGE() {
        Order order = new Order();
        order.setMENGE("MENGE123");
        Assert.assertEquals("MENGE123", order.getMENGE());
    }

    @Test
    public void testEINHE() {
        Order order = new Order();
        order.setEINHE("EINHE456");
        Assert.assertEquals("EINHE456", order.getEINHE());
    }

    @Test
    public void testMENG2() {
        Order order = new Order();
        order.setMENG2("MENG2123");
        Assert.assertEquals("MENG2123", order.getMENG2());
    }

    @Test
    public void testEINH2() {
        Order order = new Order();
        order.setEINH2("EINH2456");
        Assert.assertEquals("EINH2456", order.getEINH2());
    }

    @Test
    public void testMENG3() {
        Order order = new Order();
        order.setMENG3("MENG3789");
        Assert.assertEquals("MENG3789", order.getMENG3());
    }

    @Test
    public void testEINH3() {
        Order order = new Order();
        order.setEINH3("EINH3ABC");
        Assert.assertEquals("EINH3ABC", order.getEINH3());
    }

    @Test
    public void testMENG4() {
        Order order = new Order();
        order.setMENG4("MENG4123");
        Assert.assertEquals("MENG4123", order.getMENG4());
    }

    @Test
    public void testEINH4() {
        Order order = new Order();
        order.setEINH4("EINH4456");
        Assert.assertEquals("EINH4456", order.getEINH4());
    }

    @Test
    public void testUAZPL() {
        Order order = new Order();
        order.setUAZPL("UAZPL789");
        Assert.assertEquals("UAZPL789", order.getUAZPL());
    }

    @Test
    public void testUAZAK() {
        Order order = new Order();
        order.setUAZAK("UAZAKABC");
        Assert.assertEquals("UAZAKABC", order.getUAZAK());
    }

    @Test
    public void testAUAGE() {
        Order order = new Order();
        order.setAUAGE("AUAGE123");
        Assert.assertEquals("AUAGE123", order.getAUAGE());
    }

    @Test
    public void testSTTBE() {
        Order order = new Order();
        order.setSTTBE("STTBE456");
        Assert.assertEquals("STTBE456", order.getSTTBE());
    }

    @Test
    public void testSTTEN() {
        Order order = new Order();
        order.setSTTEN("STTEN789");
        Assert.assertEquals("STTEN789", order.getSTTEN());
    }

    @Test
    public void testETTBE() {
        Order order = new Order();
        order.setETTBE("ETTBEABC");
        Assert.assertEquals("ETTBEABC", order.getETTBE());
    }

    @Test
    public void testETTEN() {
        Order order = new Order();
        order.setETTEN("ETTEN123");
        Assert.assertEquals("ETTEN123", order.getETTEN());
    }

    @Test
    public void testATTBE() {
        Order order = new Order();
        order.setATTBE("ATTBE456");
        Assert.assertEquals("ATTBE456", order.getATTBE());
    }

    @Test
    public void testATTEN() {
        Order order = new Order();
        order.setATTEN("ATTEN789");
        Assert.assertEquals("ATTEN789", order.getATTEN());
    }

    @Test
    public void testATT20() {
        Order order = new Order();
        order.setATT20("ATT20123");
        Assert.assertEquals("ATT20123", order.getATT20());
    }

    @Test
    public void testAUPIR() {
        Order order = new Order();
        order.setAUPIR("AUPIR456");
        Assert.assertEquals("AUPIR456", order.getAUPIR());
    }

    @Test
    public void testZINFO() {
        Order order = new Order();
        order.setZINFO("ZINFO789");
        Assert.assertEquals("ZINFO789", order.getZINFO());
    }

    @Test
    public void testLUPDN() {
        Order order = new Order();
        order.setLUPDN("LUPDNABC");
        Assert.assertEquals("LUPDNABC", order.getLUPDN());
    }

    @Test
    public void testLUPDT() {
        Order order = new Order();
        order.setLUPDT("LUPDT123");
        Assert.assertEquals("LUPDT123", order.getLUPDT());
    }

    @Test
    public void testLUPDV() {
        Order order = new Order();
        order.setLUPDV("LUPDV456");
        Assert.assertEquals("LUPDV456", order.getLUPDV());
    }

    @Test
    public void testKEYLK() {
        Order order = new Order();
        order.setKEYLK("KEYLK789");
        Assert.assertEquals("KEYLK789", order.getKEYLK());
    }

    @Test
    public void testKEYLE() {
        Order order = new Order();
        order.setKEYLE("KEYLEABC");
        Assert.assertEquals("KEYLEABC", order.getKEYLE());
    }

    @Test
    public void testKEYLF() {
        Order order = new Order();
        order.setKEYLF("KEYLF123");
        Assert.assertEquals("KEYLF123", order.getKEYLF());
    }

    @Test
    public void testXAU() {
        Order order = new Order();
        order.setXAU("XAU456");
        Assert.assertEquals("XAU456", order.getXAU());
    }

    @Test
    public void testAUDAT() {
        Order order = new Order();
        order.setAUDAT("AUDAT789");
        Assert.assertEquals("AUDAT789", order.getAUDAT());
    }

    @Test
    public void testAUABF() {
        Order order = new Order();
        order.setAUABF("AUABFABC");
        Assert.assertEquals("AUABFABC", order.getAUABF());
    }

    @Test
    public void testMITAR() {
        Order order = new Order();
        order.setMITAR("MITAR123");
        Assert.assertEquals("MITAR123", order.getMITAR());
    }

    @Test
    public void testFDAEN() {
        Order order = new Order();
        order.setFDAEN("FDAEN456");
        Assert.assertEquals("FDAEN456", order.getFDAEN());
    }

    @Test
    public void testFLAGS() {
        Order order = new Order();
        order.setFLAGS("FLAGS789");
        Assert.assertEquals("FLAGS789", order.getFLAGS());
    }

    @Test
    public void testCINFO() {
        Order order = new Order();
        order.setCINFO("CINFOABC");
        Assert.assertEquals("CINFOABC", order.getCINFO());
    }

    @Test
    public void testMAD() {
        Order order = new Order();
        order.setMAD("MAD123");
        Assert.assertEquals("MAD123", order.getMAD());
    }

    @Test
    public void testSTLIK() {
        Order order = new Order();
        order.setSTLIK("STLIK456");
        Assert.assertEquals("STLIK456", order.getSTLIK());
    }

    @Test
    public void testPKART() {
        Order order = new Order();
        order.setPKART("PKART789");
        Assert.assertEquals("PKART789", order.getPKART());
    }

}

