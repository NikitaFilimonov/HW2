package ru.geekbrains.lesson_one;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //1 Задание
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(arr));
        System.out.print(" меняем 1 на 0 и 0 на 1: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));


        //2 задание
        int[] arr2 = new int[8];
        int j = 0;
        for (int i = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));

        //3 задание
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));


        //4 задание
        int n = 5;
        int[][] arr4 = new int[n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if ((x == y) || (x == n - 1 - y)) {
                    arr4[x][y] = 1;
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(arr4[x][y] + " ");
            }
            System.out.println();
        }

        //5 задание
        int[] arr5 = new int[10];
        int min = arr5[0];
        int max = arr5[0];
        System.out.print("В массиве: ");
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = ((int) (Math.random() * 201) - 100);
           }
        for (int i : arr5) {
            System.out.print(i + " ");
        }


        for (int i = 0; i < arr5.length; i++) {
            min = (min < arr5[i]) ? min : arr5[i];
            max = (max > arr5[i]) ? max : arr5[i];
        }
        System.out.println("\nМинимальное значение: " + min + "\nМаксимальное значение: " + max);

    }


}
