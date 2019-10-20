package com.company;

public class MainOOP {

    public static void main(String [] args) {

        Girl girl0 = new Girl("Ira", 23);
        Girl girl1 = new Girl("Inna", 24);

        girl0.goToCinema();
        girl1.goToCinema();
        System.out.println(girl0.countSum(5, 6, 7, 8));
        System.out.println(girl0.goToRest("Mac"));
        System.out.println(girl1.goToRest("Kulinichi"));

        System.out.println(girl0);
        System.out.println(girl1);


    }
}
