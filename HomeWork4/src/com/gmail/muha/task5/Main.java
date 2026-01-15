package com.gmail.muha.task5;

public class Main {
    public static void main(String[] args) {
        //Подсчет частоты элементов
        //Дан массив целых чисел A длиной N, содержащий числа в диапазоне от 1 до K.
        //Создайте массив F длиной K, где каждый элемент F[i] содержит количество
        //вхождений числа i в массиве A.

        int[] array = { 1, 2, 2, 3, 6,6,6,6,6,6,3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 20};

        int[] newArray = getArray(array);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] getArray(int[] array) {
        int maxValue = findMax(array);

        int[] newArray = new int[maxValue];

        for (int i = 0; i < newArray.length; i++) {
            int value = getCount(array, i);
            newArray[i] = value;
        }
        return newArray;
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getCount(int[] array, int value) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }
}
