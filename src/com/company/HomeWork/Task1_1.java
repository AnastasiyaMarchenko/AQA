//Поприветствовать любого пользователя при вводе его имени через командную строку

package com.company.HomeWork;

import java.util.Scanner;

public class Task1_1 {

    public static void main(String [] args) {


        System.out.println("Input your name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println("Hello " + name);

    }

}
