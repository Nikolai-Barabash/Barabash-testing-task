package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NameCase {

    private static final String CONTROL_NAME = "Вячеслав";

    public String inputName() {
        try {
            System.out.println("Введите имя:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            return name;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите правильное значение");
            return inputName();
        }
    }

    public void checkName(String name) {
        if (name.equals(CONTROL_NAME)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
