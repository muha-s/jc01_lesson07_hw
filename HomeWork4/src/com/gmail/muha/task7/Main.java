package com.gmail.muha.task7;

public class Main {
    static void main() {
        //Реверсирование подмассива
        //Дан массив целых чисел A длиной N и два индекса L и R, где 0 ≤ L ≤ R < N. Разверните
        //элементы массива между индексами L и R включительно, оставив остальные
        //элементы без изменений.
        int[] array = {7, 77, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 88};


        reversOne(array, 2, 11);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reversOne(int[] array, int l, int r) {

        int iter = (r - l) / 2 + 1;

        for (int i = 0; i < iter; i++) {
            int start = array[l];
            int end = array[r];
            array[l] = end;
            array[r] = start;
            r--;
            l++;
        }
    }
}
