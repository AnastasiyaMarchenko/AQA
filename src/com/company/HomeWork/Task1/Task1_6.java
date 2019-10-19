// Ввести с консоли n целых чисел, на консоль вывести

package com.company.HomeWork.Task1;

import java.util.Scanner;

public class Task1_6 {

    public static void main(String[] args) {

/*        Scanner n = new Scanner(System.in);
        // int array[] = {333, 657, 777, 666, 565};
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = n.nextInt();
        }*/

/*   //Четные и нечетные числа

        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println("Число четное  " + i);
            } else {
                System.out.println("Число не четное  " + i);
            }
        }*/


/*   //Наибольшее и наименьшее число

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение  " + max + "  Минимальное значение  " + min);
    }*/

/*   //Числа которые делятся на 3 или на 9

        for (int i : array) {
            if (i % 3 == 0) {
                System.out.println("Число кратно 3м  " + i);
            } else if (i % 9 == 0) {
                System.out.println("Число кратно 9ти  " + i);
            } else {
                System.out.println("Число не кратно 3м или 9ти  " + i);
            }
        }*/


/*   //Числа которые делятся на 5 и на 7

        for (int i : array) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("Число делится на 5 и на 7  " + i);
            } else {
                System.out.println("Число не делится на 5 и на 7  " + i);
            }
    }*/

/*// Все трехзначные числа в записи которых нет одинаковых цифр

        for (int i = 0; i < array.length; i++) {
            String tmp = String.valueOf(array[i]);
            int itemLength = tmp.length();
            if (itemLength == 3) {
                char firstChar = tmp.charAt(0);
                char secondChar = tmp.charAt(1);
                char thirdChar = tmp.charAt(2);

                if (firstChar != secondChar && firstChar != thirdChar && secondChar != thirdChar) {
                    System.out.println(tmp);
                }
            }
        }*/

/*    //"Счастливые"числа

        for (int i = 0; i < array.length; i++) {
            String tmp = String.valueOf(array[i]);
            int itemLength = tmp.length();
            if (itemLength == 4) {
                char firstChar = tmp.charAt(0);
                char secondChar = tmp.charAt(1);
                char thirdChar = tmp.charAt(2);
                char fourthChar = tmp.charAt(3);

                if (firstChar + secondChar == thirdChar + fourthChar) {
                    System.out.println(tmp);
                }
            }
        }*/

    }
}