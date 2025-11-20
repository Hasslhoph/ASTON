import java.util.Scanner;

public class Lesson_2 {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    } // 1 задание

    public static void checkSumSign() {

        Scanner write = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = write.nextInt();

        System.out.print("Введите значение b: ");
        int b = write.nextInt();

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {

            System.out.println("Сумма отрицательная");
        }
    }    // 2 задание

    public static void printColor() {

        Scanner write = new Scanner(System.in);

        System.out.print("Введите значение value: ");
        int value = write.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");

        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }      // 3 задание

    public static void compareNumbers() {

        Scanner write = new Scanner(System.in);

        System.out.print("Введите переменную a: ");
        int a = write.nextInt();
        System.out.print("Введите переменную b: ");
        int b = write.nextInt();

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }  // 4 задание

    public static void booleanInt() {
        Scanner write = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = write.nextInt();
        System.out.print("Введите второе число: ");
        int b = write.nextInt();
        int c = a + b;

        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }      // 5 задание

    public static void plusOrMinus() {

        Scanner write = new Scanner(System.in);

        System.out.print("Введите положительное или отрицательно число: ");
        int a = write.nextInt();

        if (a >= 0) {
            System.out.println(a + " положительно число");
        } else {
            System.out.println(a + " отрицательно число");
        }

    }     // 6 задание

    public static void plusOrMinusBoolean() {

        Scanner write = new Scanner(System.in);

        System.out.print("Введите положительное или отрицательно число: ");
        int a = write.nextInt();

        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    } // 7 задание

    public static void stringInt() {

        Scanner write = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String name = write.next();
        System.out.print("Введите число: ");
        int age = write.nextInt();

        for (int i = 0; i < age; i++) {

            System.out.println(name);
        }

    }       // 8 задание

    public static void yearsV() {

        Scanner age = new Scanner(System.in);

        System.out.print("Введите год для проверки: ");
        int year = age.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap);

    }          // 9 задание

    public static void Array() {

        int[] array = {1, 1, 0 ,0, 1, 0, 1, 1, 1, 0, 0};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(" ");
        System.out.println("Преобразованный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(" ");
    }           // 10 задание

    public static void emptyArray() {

        int[] array = new int[100];

        System.out.println("Значения массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + ", ");
        }
        System.out.println(" ");
    }      // 11 задание

    public static void arrayLess() {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println(" ");
        System.out.println("Новый массив: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println(" ");
    }       // 12 задание

    public static void diagonalArray() {

        Scanner write = new Scanner(System.in);
        System.out.print("Введите размер квадратного массива: ");
        int size = write.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;

        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }   // 13 задание

    public static void arrayCreator() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int len = scanner.nextInt();
        System.out.print("Введите значение для заполнения: ");
        int initialValue = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Итоговый массив: ");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + ", ");
        }


    }    // 14 задание

}
