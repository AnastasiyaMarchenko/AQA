//Вывести заданное кол-во случайных чисел с переходом и без перехода на новую строку

package com.company.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_3 {

    public static void main(String[] args) {

        System.out.println("Input 5 numbers");

        Scanner n = new Scanner(System.in);
        int array[] = {333, 6575, 777, 9866, 545};
/*        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt();
        }*/
        System.out.println(Arrays.toString(array)); //.replaceAll("([|])", " "));

        for (int i : array) {
            System.out.println(i + " ");
        }

    }
}

