package com.example.fluganzeigetafel.Tests;

import com.example.fluganzeigetafel.Flights.Utility.UtilityMethods;
import org.junit.Test;
import org.junit.*;


public class UtilityTests {

    @Test
    public void testGetAirlineCode_OneChar_OneDigit_OneSpace() {
        String result = UtilityMethods.getAirlineCode("X3 45");
        Assert.assertEquals("X3", result);
    }

    @Test
    public void testGetAirlineCodeSecondTest_TwoChars_OneSpace() {
        String result = UtilityMethods.getAirlineCode("LH 23");
        Assert.assertEquals("LH", result);
    }

    @Test
    public void testGetAirlineCodeThirdTest_ThreeChars_NoSpace() {
        String result = UtilityMethods.getAirlineCode("SRR4114");
        Assert.assertEquals("SRR", result);
    }

    @Test
    public void testGetAirlineCodeFourthTest_OnlyDigits() {
        String result = UtilityMethods.getAirlineCode("4567887");
        Assert.assertEquals("456", result);
    }

    @Test
    public void testLeaveOneWhiteSpace_OneChar_OneDigit_TwoSpaces() {
        String firstTest = UtilityMethods.leaveOneWhiteSpace("X3  45");
        Assert.assertEquals("X3 45", firstTest);
    }

}
