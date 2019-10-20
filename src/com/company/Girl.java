package com.company;

public class Girl {

    String name;
    int age;

    public Girl(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Girl() {
        System.out.println("Hi i am new girl");
        this.name = "Ket";
        this.age = 22;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void goToCinema(){
        System.out.println("Go to the cinema " + name);
    }

    String goToRest(String nameOfRest){
        if ("Mac".equals(nameOfRest)) {
            return "No said " + name;
        } else {
            return "Yes said " + name;
        }
    }

    public int countSum(int ... i) { // метод принимает любое кол-во интов
        int sum = 0;
        for (int num : i) {
            sum += num;
        }
        return sum;
    }
}
