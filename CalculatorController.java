package com.alanasr.alanasrspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator")
    public String sumNum(@RequestParam("plus") int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

}
