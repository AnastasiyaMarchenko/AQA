// Упорядочить и вывести числа в порядке возрастания (убывания) их длинны

package com.company.HomeWork.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_2 {

    public static void main(String[] args) {

        System.out.println("Input 5 values");
        Scanner n = new Scanner(System.in);
      //  int array[] = {33853, 65554447, 777, 44, 4};
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt();
        }

        bubbleSortingIncrease(array);
        System.out.println(Arrays.toString(array));

        bubbleSortingDecrease(array);
        System.out.println(Arrays.toString(array));

    }

    private static int[] getArray() {
        Scanner n = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt();
        }
        return array;
    }

    private static void bubbleSortingIncrease(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortingDecrease(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}