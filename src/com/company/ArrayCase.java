package com.company;

import java.util.Scanner;

public class ArrayCase {

    private static final int DIVISOR = 3;

    public void findMultiple(String[] array) {
        System.out.println("Элементы массива кратные 3: ");
        try {
            for (int i = 0; i < array.length; i++) {
                int arrayInt = Integer.parseInt(array[i]);
                if (arrayInt % DIVISOR == 0) {
                    System.out.print(arrayInt + " ");
                }
                continue;
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Введите правильные значения");
            findMultiple(inputArray());
        }
    }

    public String[] inputArray() {
        System.out.println("Для формирования массива введите числа через пробел:");
        Scanner scanner = new Scanner(System.in);
        String arrayLine = scanner.nextLine();
        String[] array = arrayLine.split(" ");
        return array;
    }
}



