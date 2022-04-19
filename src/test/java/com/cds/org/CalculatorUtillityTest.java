package com.cds.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorUtillityTest {

    @Test
    void add() {

        CalculatorUtillity calcUtil = new CalculatorUtillity();
        int expectedResult =5;
        assertEquals(expectedResult,calcUtil.add(2,3));

    }

    @Test
    public void  testComputeCirclArea()
    {
       CalculatorUtillity calculatorUtillity = new CalculatorUtillity();
       assertEquals(314.1592653589793,calculatorUtillity.computeCircleArea(10),"should return circle Area");

    }


    @Test
    void testSubtract() {
    }

    @Test
    void testMultiply() {
    }

    @Test
    void testDivide() {
        CalculatorUtillity calculatorUtillity = new CalculatorUtillity();
         assertEquals(10, calculatorUtillity.divide(100,10),"this shows division of 2 numbers");

    }

    @Test
    void testDivideThrowsExeception() {
        CalculatorUtillity calculatorUtillity = new CalculatorUtillity();
        assertThrows(ArithmeticException.class,()-> calculatorUtillity.divide(10,0),"Divide by zero should throw Arithmatic Exception");

    }
}