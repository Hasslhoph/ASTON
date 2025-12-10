package com.homework;

public class ArrayProcessor {

    private static final int REQUIRED_SIZE = 4;

    public static int processArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        if (array.length != REQUIRED_SIZE) {
            throw new MyArraySizeException(
                    String.format("Неверное количество строк: %d. Ожидается: %d.",
                            array.length, REQUIRED_SIZE));
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != REQUIRED_SIZE) {
                throw new MyArraySizeException(
                        String.format("Неверное количество столбцов в строке %d: %d. Ожидается: %d.",
                                i, array[i].length, REQUIRED_SIZE));
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Ошибка преобразования данных. Ожидалось число",
                            i, j);
                }
            }
        }

        return sum;
    }
}