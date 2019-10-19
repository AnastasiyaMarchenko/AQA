// Найти самое короткое и самое длинное число. Вывести найденные числа и их длинну

package com.company.HomeWork.Task2;

import java.util.Scanner;

public class Task2_1 {

    public static void main(String[] args) {

        System.out.println("Input 5 values");
        Scanner n = new Scanner(System.in);
        // int array[] = {33853, 65554447, 777, 44, 4};
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt();
        }

        String max = String.valueOf(array[0]);
        String min = String.valueOf(array[0]);

        int valueMax = max.length();
        int valueMin = min.length();

        for (int i : array) {
            int lenght = String.valueOf(i).length();
            if (valueMin > lenght) {
                valueMin = lenght;
                min = String.valueOf(i);
            }
            if (valueMax < lenght) {
                valueMax = lenght;
                max = String.valueOf(i);
            }
        }
        System.out.println("Минимальное число " + min + ", c длинной " + valueMin);
        System.out.println("Минимальное число " + max + ", c длинной " + valueMax);

    }
}
