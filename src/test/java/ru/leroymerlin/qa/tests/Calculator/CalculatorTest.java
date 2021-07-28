package ru.leroymerlin.qa.tests.Calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    //@Parameterized

    @Test
    public void testCalc(){
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testNotNull(){
        Calculator calculator = new Calculator();
        int result = calculator.add(5,5);
        assertNotNull(result);
    }

}