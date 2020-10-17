package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberCase {

    private static final int CONTROL_NUMBER = 7;

    public int inputNumber() {
        try {
            System.out.println("Введите число:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите правильное значение");
            return inputNumber();
        }
    }

    public void checkNumber(int number) {
        if (number > CONTROL_NUMBER) {
            System.out.println("Привет");
        }
    }
}
