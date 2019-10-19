// Вывести пароль из командной строки и сравнить его со строкой образцом

package com.company.HomeWork;

import java.util.Scanner;

public class Task1_4 {

    public static void main(String[] args) {

        String password = "test";

        System.out.println("Input your password");
        Scanner s = new Scanner(System.in);
        String userPassword = s.nextLine();


        if (password.equals(userPassword)){
            System.out.println("You are logged in");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
