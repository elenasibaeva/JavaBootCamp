package sef.finaltask.activity.SecondTask;

import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

    private SecondActivity theCalculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        theCalculator = new SecondActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testSumPositiveValue() {
        assertEquals(15, (theCalculator.sum(5,10)));
        assertEquals(15,(theCalculator.sum(10,5)));
    }

    public void testSumNegativeValue(){
        assertEquals(20, (theCalculator.sum(5,10)));
        assertEquals(5, (theCalculator.sum(10,20)));
    }

    public void testSubtractPositive(){
        assertEquals(5,(theCalculator.subtract(15,10)));
        assertEquals(15,(theCalculator.subtract(20,5)));
    }

    public void testSubtractNegative(){
        assertEquals(-15,(theCalculator.subtract(-5,10)));
        assertEquals(-15,(theCalculator.subtract(-10,5)));
    }

    public void testDividePositiveValue(){
        assertEquals(5, (theCalculator.divide((15,3))));
        assertEquals(4,(theCalculator.divide(20,5)));
    }

    public void testDivideNegativeValue(){
        assertEquals(-5,(theCalculator.divide(-15,3)));
        assertEquals(-5,(theCalculator.divide(15,3)));
    }

    public void testDivineNull(){
        assertEquals(0,(theCalculator.divide(0,5)));
        assertEquals(Double.POSITIVE_INFINITY, theCalculator.divide(5,0), );
    }

    public void testMultiplyPositiveValue(){
        assertEquals(15,(theCalculator.multiply(5,3)));
        assertEquals(20,(theCalculator.multiply(4,5)));
    }

    public void testMultiplyNegativeValue(){
        assertEquals(-45,(theCalculator.multiply(-15,3)));
        assertEquals(-12,(theCalculator.multiply(4,-3)));
    }

    public void testMultiplyNull(){
        assertEquals(0,(theCalculator.multiply(0,5)));
        assertEquals(0,(theCalculator.multiply(5,0)));
    }
}
