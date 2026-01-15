package com.gmail.muha.task3;

public class Main {
    public static void main(String[] args) {
        //Объединение и сортировка двух массивов
        //Даны два отсортированных по возрастанию массива целых чисел A длиной N и B
        //длиной M. Объедините эти массивы в один отсортированный по возрастанию массив
        //C длиной N + M.

        int[] array1 = {3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int[] arrayMerge = merge(array1, array2);

        for (int i = 0; i < arrayMerge.length; i++) {
            System.out.print(arrayMerge[i] + " ");
        }
    }


    public static int[] merge(int[] array1, int[] array2) {

        if (!isSortedAscendingOrder(array1) || !isSortedAscendingOrder(array2)) {
            System.out.println("Массив или массивы не отсортированы");
            return new int[0];
        }

        int[] mergeArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergeArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergeArray[array1.length + i] = array2[i];
        }

        mergeArray = sortAscendingOrder(mergeArray);
        return mergeArray;
    }

    public static boolean isSortedAscendingOrder(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] sortAscendingOrder(int[] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int max = 0;
                if (array[j] > array[j + 1]) {
                    max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                }
            }
        }
        return array;
    }
}
