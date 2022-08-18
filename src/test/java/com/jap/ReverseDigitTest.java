package com.jap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseDigitTest {

    ReverseDigit reverseDigit;

    @Before
    public void setUp() {
        reverseDigit = new ReverseDigit();
    }

    @After
    public void tearDown() {

    }

    /**
     * It checks if the number is negative or not.
     */
    @Test
    public void givenInputNegativeNumberReverseTheDigit() {
        int number = -1;
        String expectedResult = "Number Should Not Be Negative Number";
        String actualResult = String.valueOf(reverseDigit.getReverse(number));
    }

    @Test
    // Checking if the number is positive or not.
    public void givenInputPositiveNumberReverseTheDigit() {
        //arrange
        int number = 12345;
        int expected = 54321;
        //act
        int actualResult = reverseDigit.getReverse(number);
        Assert.assertEquals(expected, actualResult);

    }
}
