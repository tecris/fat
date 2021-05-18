package org.playground.calculator;

public class RunCalculator {
    public static void main(String[] Matei){
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(16,5));

        int s = calculator.subtraction(17, 18);
        System.out.println(s);

        int addition = calculator.addition(3, 6);
        System.out.println(addition);

        int multiplication = calculator.multiplication(15, 6);
        System.out.println(multiplication);

        int division = calculator.division(14, 8);
        System.out.println(division);

    }

}
