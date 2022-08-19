package com.jap;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseDigitTest {

    ReverseDigit reverseDigit;

    @BeforeEach
    public void setUp() {
        reverseDigit = new ReverseDigit();
    }

    @AfterEach
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
        Assertions.assertEquals(expected, actualResult);

    }
}
