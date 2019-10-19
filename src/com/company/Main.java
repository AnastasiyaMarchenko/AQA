package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

        public class Main {
            public static void main(String [] args) {


            }
        }
   /* int a[] = {6,7,11,43,4,9}; //bubble sorting
    int d []= {4,7,1,9,10,6} ;
       sortArr(a);
       sortArr(d);
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(d));
    }
    private static void sortArr(int[] a) {
        for ( int i =a.length-1; i >=0; i--) {
             for (int j = 0; j < i; j++) {
                 if (a[j]>a[j+1]) {
                     int temp = a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                 }
             }
        }
    }
}
    /*int [] a = {1,2,3,4,5};
       for  (int i = 0; i < a.length/2; i++) {
       int tmp = a[i] ;
       a[i]=a[a.length-1-i];
       a[a.length-1-i]=tmp;}
       System.out.println(Arrays.toString(a)); //выводит масиив на экран через
    /* public static void main(String[] args) throws IOException {

        /*System.out.println(new StringBuilder( "gfhdoughoaiuhrgy").reverse());



       /* int a4 [] [] = {{1,2,3},{4,5,6,},{7,8,9}};
        int a5 [] [] = {{1,1,3},{4,5,5,},{7,8,7}};
        arraysPrint(a4);
    }

    private static void arraysPrint(int[][] a4) {
        for (int[] ints : a4) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }*/

/*int a= 1;
        int[] a1 = {1,2,3,4,5,6,7,8};
        int sum=0;
        for (int i :a1){
            if (i%2 == 0)
                sum+=i;
        }
        System.out.println("i = " + sum );*/
      /* for (int i : a1) {
            System.out.println("i = " + i);*/

   /* int [] [] a3 = new int[3][5];
        System.out.println(a1[3]);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for (int i = 0; i < a1.length; i++) {//массив на экран
            System.out.println(a1[i]);
        }
        for (int i = a1.length - 1; i >= 0; i--) {
            System.out.println(a1[i]);

        }

        int a4 [] [] = {{1,2,3},{4,5,6,},{7,8,9}};// все элементы массива каждая строка с новой строки
        for (int[] ints : a4) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        int a4 [] [] = {{1,2,3},{4,5,6,},{7,8,9}}; все элементы построчно потом сумма по каждой строке, в конце общая сумма
        int sum=0;
        for (int i = 0; i < a4.length; i++) {
            int sum1=0;
            for (int j = 0; j < a4[i].length ; j++) {
                sum+=a4[i][j];
                sum1+=a4[i][j];
                System.out.print(a4[i][j]+" ");
            }
            System.out.println();

            System.out.println(sum1);
        }
        System.out.println(sum);

    */

    /*byte b1 = 50, b2 = 99;
byte k = (byte) (b1 + b2);
        System.out.println("k=" + k);
         System.out.println("hi"=="hi");
        String a = "hi";
        String b = "hi";
        System.out.println(a == b);
        String a1 = new String("hi");
        String b2 = "hi";
        System.out.println(a1==b2);

         for (int j = 0; j < 100; j++) {
            if (j % 2 == 0)
                System.out.println(j);
        }
for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
 /* String a = "11";
        String b = "11.1";
        System.out.println(Integer.parseInt(a) + 3);
        System.out.println(a + 3);
        System.out.println(Double.parseDouble(b) + 3);
        System.out.println(b + 3);


int a = 6;


        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Work day");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
        }

         int a = 160;
int i = a<150?120:10;
        System.out.println(i);
int age = 7;
        if (age<6 && age>2) {
            System.out.println("Kindergarten");
        } else if (age>7 && age<=17){
            System.out.println("School"); }
        else if (age>17 && age<=22){
            System.out.println("University");}
        else if (age>22 && age<=65){
            System.out.println("Work");}
        else if (age>65 && age<=90){
            System.out.println("Pension");}
            else {
            System.out.println("You are infant, dude ");
        }

System.out.println("4/2=" + 4/2 == "4/2=2");
       /*System.out.println(("iugiuodfigu".trim().split("i").length)
        );*/
        /*char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1 + c2 + c3);*/
            /*Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        System.out.println("next = " + next);

        System.out.println(.1+.2);
       System.out.println(Arrays.toString("awsd".getBytes()));
        new String(new byte[] {97, 119, 54, 115, 100});
        System.out.println();
        }*/
