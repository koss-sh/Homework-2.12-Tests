package com.example.homework_calculator_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.homework_calculator_tests.CalculatorServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParametrizedTest {

    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForAdditionTests")
    public void shouldGenerateCorrectSums(int num1, int num2, int expected) {
        assertEquals(expected, out.sumNumbers(num1, num2));
    }
    public static Stream<Arguments> provideParamsForAdditionTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, 6),
                Arguments.of(NUM3, NUM4, 8)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTests")
    public void shouldGenerateCorrectDifferences(int num1, int num2, int expected) {
        assertEquals(expected, out.subtractNumbers(num1, num2));
    }
    public static Stream<Arguments> provideParamsForSubtractionTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, 4),
                Arguments.of(NUM3, NUM4, 12)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiplicationTests")
    public void shouldGenerateCorrectProducts(int num1, int num2, int expected) {
        assertEquals(expected, out.multiplyNumbers(num1, num2));
    }
    public static Stream<Arguments> provideParamsForMultiplicationTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, 5),
                Arguments.of(NUM3, NUM4, -20)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    public void shouldGenerateCorrectQuotients(int num1, int num2, int expected) {
        assertEquals(expected, out.divideNumbers(num1, num2));
    }
    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, 5),
                Arguments.of(NUM3, NUM4, -5)
        );
    }


}
