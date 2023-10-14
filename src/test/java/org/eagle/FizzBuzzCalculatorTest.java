package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzCalculatorTest {
    @Test
    void givenIntNumber_whenDivisible3And5_thenReturnFizzBuzz(){
        int number = 15;
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String expected = "FizzBuzz";
        String actual = fizzBuzzCalculator.giveFizzBuzz(number);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenIntNumber_whenDivisible3_thenReturnFizz(){
        int number = 6;
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String expected = "Fizz";
        String actual = fizzBuzzCalculator.giveFizzBuzz(number);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenIntNumber_whenDivisible5_thenReturnBuzz(){
        int number = 10;
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String expected = "Buzz";
        String actual = fizzBuzzCalculator.giveFizzBuzz(number);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void givenIntNumber_whenNoDivisible3Or5_thenReturnNumber(){
        int number = 2;
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        String expected = "2";
        String actual = fizzBuzzCalculator.giveFizzBuzz(number);
        Assertions.assertEquals(expected,actual);
    }
}