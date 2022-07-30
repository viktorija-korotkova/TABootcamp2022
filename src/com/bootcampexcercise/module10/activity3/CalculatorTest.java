package com.bootcampexcercise.module10.activity3;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest extends TestCase {

    public static void main(String[] args) throws Exception {
        new Calculator().multiply(10.0, 1.0);
    }

    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // 4 test cases for add()
    public void testAddMethodPositive() {
        assertEquals(10, calculator.add(6, 4));
    }

    public void testAddMethodNegative() {
        assertEquals(4, calculator.add(6, -2));
    }

    public void testAddMethodDoublePositive() {
        assertEquals(10.5, calculator.add(6.0, 4.5));
    }

    public void testAddMethodDoubleNegative() {
        assertEquals(1.5, calculator.add(6.0, -4.5));
    }


    // 2 test cases for subtract()
    public void testSubtractPositive() {
        assertEquals(1.5, calculator.subtract(6.0, 4.5));
    }

    public void testSubtractNegative() {
        assertEquals(10.5, calculator.subtract(6.0, -4.5));
    }


    // 2 test cases for divide()
    public void testDividePositive() {
        assertEquals(5.0, calculator.divide(10.0, 2.0));
    }

    public void testDivideNegative() {
        assertEquals(-5.0, calculator.divide(10.0, -2.0));
    }

    // 2 test cases for multiply()
    public void testMultiplyExceptionThrown() throws PointlessMultiplicationException {
        Assertions.assertThrows(PointlessMultiplicationException.class, () -> calculator.multiply(10.0, 1.0));
    }

    public void testMultiplyExceptionNotThrown() throws PointlessMultiplicationException {
        Assertions.assertDoesNotThrow(() -> calculator.multiply(10.0, 2));
    }

    public void testMultiplyPositive() throws PointlessMultiplicationException {
        assertEquals(20.0, calculator.multiply(10.0, 2.0));
    }

    public void testMultiplyNegative() throws PointlessMultiplicationException {
        assertEquals(-20.0, calculator.multiply(10, -2));
    }

}
