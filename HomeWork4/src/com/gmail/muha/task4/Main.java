package com.gmail.muha.task4;

public class Main {
    public static void main(String[] args) {
        //Поиск второго максимального элемента
        //Дан массив целых чисел A длиной N. Найдите второй по величине элемент массива
        //без использования встроенных функций сортировки.


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 1, 3, 5, 9, 0, 11};

        System.out.println(findSecondMax(array));
    }

    public static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
        }
        return secondMax;
    }
}
