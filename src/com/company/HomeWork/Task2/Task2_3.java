// Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

package com.company.HomeWork.Task2;

import java.util.Scanner;

public class Task2_3 {


    public static void main(String[] args) {

        System.out.println("Input 5 values");
        Scanner n = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt();
        }

        int average = findAverage(array);

        for (int items : array) {
            int length = String.valueOf(items).length() - 2;
            if (length < average) {
                System.out.println("Длинна меньше средней " + items);
            } else {
                System.out.println("Длинна больше средней " + items);
            }
        }
    }

    private static int findAverage(int[] array) {
        int allSum = 0;
        for (int l : array) {
            allSum += String.valueOf(l).length();
        }
        int i = allSum / array.length;
        return i;
    }
}

