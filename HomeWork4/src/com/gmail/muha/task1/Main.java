package com.gmail.muha.task1;

public class Main {

    public static void main(String[] args) {
        //Циклический сдвиг элементов массива
        //Дан одномерный целочисленный массив A длиной N и число K. Реализуйте алгоритм
        //циклического сдвига элементов массива на K позиций вправо. Элементы, выходящие
        //за пределы массива, должны перемещаться в начало.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        rotateRight(array, 201);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rotateRight(int[] array, int distance) {

        if (array.length < 2 || array == null) {
            System.out.println("Неверные данные");
            return;
        }
        for (int i = 0; i < distance; i++) {
            reversOne(array);
        }
    }

    public static void reversOne(int[] array) {
        int tempEnd = array[array.length - 1];
        array[array.length - 1] = array[array.length - 2];

        int temp1 = array[0];
        int temp2 = array[1];

        for (int i = 0; i < array.length - 2; i++) {

            array[i + 1] = temp1;

            temp1 = temp2;
            temp2 = array[i + 2];
        }
        array[0] = tempEnd;
    }
}
