package com.example.homework_calculator_tests;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }


    public int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }


    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }


    public double divideNumbers(int num1, int num2) {
        if (num2 == 0) throw  new IllegalArgumentException("Делить на 0 нельзя!");
        return num1 / num2;
    }
}
