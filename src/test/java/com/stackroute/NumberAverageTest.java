package com.stackroute;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stackroute.NumberAverage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumberAverageTest
{
    private static NumberAverage numberAverage;
    @BeforeAll
    public static void  setup(){
     numberAverage = new NumberAverage();
    }
    @AfterAll
    public static void tearDown(){
        numberAverage = null;
    }

    @Test
    public void givenRandomIntegerArrayThenReturnAStringResult()
    {
        int [] inputArray = {12,2,10};
        assertEquals("The average value is: 8",numberAverage.findAverage(inputArray),"Check the logic and foreach loop of method findAverage");
    }
    @Test
    public void givenConsecutiveIntegerArrayThenReturnAStringResult()
    {
        int [] inputArray = {12,13,14,15,16};
        assertEquals("The average value is: 14",numberAverage.findAverage(inputArray),"Check the logic and foreach loop of method findAverage");
    }
    @Test
    public void givenNegativeIntegerArrayThenReturnAStringError()
    {
        int [] inputArray = {-10,13,-41};
        assertEquals("Give proper positive integer values",numberAverage.findAverage(inputArray),"Write a condition to check whether the value is negative");
    }
    @Test
    public void givenEmptyArrayThenReturnAStringError()
    {
        int [] inputArray = {};
        assertEquals("Empty array",numberAverage.findAverage(inputArray),"Write a condition to check whether the input array is empty");
    }
}
