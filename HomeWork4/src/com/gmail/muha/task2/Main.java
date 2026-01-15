package com.gmail.muha.task2;

public class Main {
    public static void main(String[] args) {
        //Проверка массива на палиндром
        //Дан массив символов A длиной N. Определите, является ли этот массив палиндромом
        //(читается одинаково слева направо и справа налево).

        char[] array1 = {'1', '0', '1'};

        System.out.println(isPalindrome(array1));

        char[] array2 = {'1', '0', '0', '1'};
        System.out.println(isPalindrome(array2));

        char[] array3 = {'1', '0', '0', '1', '9'};
        System.out.println(isPalindrome(array3));

    }

    public static boolean isPalindrome(char[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            if(array[i] != array[array.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
