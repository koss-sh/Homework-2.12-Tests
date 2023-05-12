package com.example.homework_calculator_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.homework_calculator_tests.CalculatorServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorService();
    @Test
    public void shouldReturnCorrectWelcome() {
        String result = out.showWelcome();
        assertEquals(WELCOME, result);
    }
    @Test
    public void shouldReturnCorrectSum1() {
        int result = out.sumNumbers(NUM1, NUM2);
        assertEquals(6, result);
    }
    @Test
    public void shouldReturnCorrectSum2() {
        int result = out.sumNumbers(NUM3, NUM4);
        assertEquals(8, result);
    }
    @Test
    public void shouldReturnCorrectDifference1() {
        int result = out.subtractNumbers(NUM1, NUM2);
        assertEquals(4, result);
    }
    @Test
    public void shouldReturnCorrectDifference2() {
        int result = out.subtractNumbers(NUM3, NUM4);
        assertEquals(12, result);
    }
    @Test
    public void shouldReturnCorrectProduct1() {
        int result = out.multiplyNumbers(NUM1, NUM2);
        assertEquals(5, result);
    }
    @Test
    public void shouldReturnCorrectProduct2() {
        int result = out.multiplyNumbers(NUM3, NUM4);
        assertEquals(-20, result);
    }
    @Test
    public void shouldReturnCorrectQuotient1() {
        int result = (int) out.divideNumbers(NUM1, NUM2);
        assertEquals(5, result);
    }
    @Test
    public void shouldReturnCorrectQuotient2() {
        int result = (int) out.divideNumbers(NUM3, NUM4);
        assertEquals(-5, result);
    }
    @Test
    public void shouldThrowIllegalArgumentException() {
       assertThrows(IllegalArgumentException.class, () -> out.divideNumbers(NUM1, 0));
    }
}
