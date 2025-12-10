package com.homework;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Успешная обработка массива 4x4");
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(correctArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());
        }

        System.out.println("\n" + "-".repeat(50) + "\n");

        System.out.println("2. Обработка MyArraySizeException (3x4)");
        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            ArrayProcessor.processArray(wrongSizeArray);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Непредвиденная ошибка данных: " + e.getMessage());
        }

        System.out.println("\n" + "-".repeat(50) + "\n");

        System.out.println("3. Обработка MyArrayDataException (не число в [2][1])");
        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "TEXT", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            ArrayProcessor.processArray(wrongDataArray);
        } catch (MyArraySizeException e) {
            System.err.println("Непредвиденная ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("ОШИБКА ДАННЫХ: " + e.getMessage());
            // Вывод детализации
            System.err.println("Неверные данные найдены в: Строка " + e.getRow() + ", Столбец " + e.getCol());
        }

        System.out.println("\n" + "-".repeat(50) + "\n");

        System.out.println("4. Генерация и поимка ArrayIndexOutOfBoundsException");
        int[] demoArray = {10, 20, 30};

        try {
            System.out.println("Попытка доступа к элементу с индексом 3...");
            int value = demoArray[3];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("УСПЕШНО ПОЙМАНО ArrayIndexOutOfBoundsException!");
            System.err.println("Причина: " + e.getMessage());
            System.err.println("Это исключение возникает, когда программа пытается обратиться по недопустимому индексу.");
        }
    }
}