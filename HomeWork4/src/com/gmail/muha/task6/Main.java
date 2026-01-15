package com.gmail.muha.task6;


public class Main {

    public static void main(String[] args) {

        //Удаление повторяющихся элементов
        //Дан массив целых чисел A длиной N. Создайте новый массив B, содержащий все
        //уникальные элементы массива A в порядке их первого вхождения.

        int[] array = {123, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 11, 34, 46, 333};

        array = getArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] getArray(int[] array) {

        int[] newArray = new int[0];

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {

                newArray = add(newArray, array[i]);

            }
        }
        return newArray;
    }

    public static int[] add(int[] array, int value) {

        int[] newArray = new int[array.length + 1];


        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = value;

        return newArray;
    }

}
