package com.company;

// calculator class
class Calculator {

    //parameterized constructor
    Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // private fields
    private final double num1;
    private final double num2;

    // addition of two numbers
    public double add(){
        double plus;
        plus = num1 + num2;
        return plus;
    }

    //subtraction of num1 from num2
    public double subtract(){
        double minus ;
        minus = num2 - num1;
        return minus;
    }

    //multiplication of two numbers
    public double multiply(){
        double multi;
        multi = num1 * num2;
        return multi;
    }

    //divide of num2 by num1
    public double divide(){
        double div;
        div = num2 / num1;
        return div;
    }
}

public class Main {

    public static void main(String[] args) {

        // instantiating object
        Calculator obj = new Calculator(10,94);

        // accessing methods through obj object
        System.out.println("addition: " + obj.add());
        System.out.println("subtraction: " + obj.subtract());
        System.out.println("multiplication: " + obj.multiply());
        System.out.println("division: " + obj.divide());

    }
}
