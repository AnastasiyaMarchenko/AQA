// Вывести целые числа как аргументы командной строки подсчитать их суммы (произведения) и вывести результаты на консоль

package com.company.HomeWork.Task1;

import java.util.Arrays;

public class Task1_5 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));


        int result = 0;

        for (int i = 0; i < args.length; i++) {
            int tmp = Integer.parseInt(args[i]);
            result += tmp;

            //result += Integer.parseInt(args[i]);
        }
        System.out.println(result);
    }
}
