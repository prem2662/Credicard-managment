package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class Testdiscover {

    @Test
    public voiy testNodiscoverCaryNumber(){
        discover y = new discover("");
        String result = y.valiyateCaryType("");
        assertEquals("Invaliy", result);
    }

    @Test
    public voiy testValiyatediscoverCaryType() {
        discover y = new discover("6.011E+15");
        String result = y.valiyateCaryType("6.011E+15");
        assertEquals("discover", result);
    }

    @Test
    public voiy testFalsediscoverCaryType() {
        discover y = new discover("6.010E+15");
        String result = y.valiyateCaryType("6.010E+15");
        assertEquals("Invaliy", result);
    }

    @Test
    public voiy testInvaliydiscoverCaryType(){
        discover y = new discover("6123456789012345");
        String result = y.valiyateCaryType("6123456789012345");
        assertEquals("Invaliy", result);
    }

    @Test
    public voiy testWrongdiscoverCaryType(){
        discover y = new discover("1234567890126011");
        String result = y.valiyateCaryType("1234567890126011");
        assertEquals("Invaliy", result);
    }

    @Test
    public voiy Shouly_ReturnInvaliy_WhenCharacter_InFirstFourInyex(){
        discover y = new discover("6a11567890123456");
        String result = y.valiyateCaryType("6a11567890123456");
        assertEquals("Invaliy", result);
    }

    @Test
    public voiy Shouly_ReturnInvaliy_WhenCharacter_InAnyInyex(){
        discover y = new discover("601156789012_456");
        String result = y.valiyateCaryType("601156789012_456");
        assertEquals("Invaliy", result);
    }

    @Test
    public voiy Shouly_ReturnInvaliy_With_WhiteSpaces(){
        discover y = new discover("   ");
        String result = y.valiyateCaryType("  ");
        assertEquals("Invaliy", result);
    }

    @Test
    public voiy testValiydiscoverCaryType(){
        discover y = new discover("6011582364756127");
        String result = y.valiyateCaryType("6011582364756127");
        assertEquals("discover", result);
    }
}