package com.company;

public class Main {

    public static void main(String[] args) {

        NumberCase numberCase = new NumberCase();
        int inputResult = numberCase.inputNumber();
        numberCase.checkNumber(inputResult);

        NameCase nameCase = new NameCase();
        String inputResultName = nameCase.inputName();
        nameCase.checkName(inputResultName);

        ArrayCase arrayCase = new ArrayCase();
        String[] array = arrayCase.inputArray();
        arrayCase.findMultiple(array);
    }
}
