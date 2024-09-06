package com.alanasr.alanasrspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiseInterface{
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение переменной";
        }
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String subtraction(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение переменной";
        }
        int difference = num1 - num2;
        return num1 + " - " + num2 + " = " + difference;
    }

    public String multiplication(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение переменной";
        }
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }

    public String division(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            if (num2 == 0) {
                return "На ноль делить нельзя!";
            }
        } else {
            return "Введите значение переменной";
        }
        int divi = num1 / num2;
        return num1 + " / " + num2 + " = " + divi;
    }
}
