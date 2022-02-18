package com.company;

// laptop class
class Laptop {

    public String name;

    // default constructor
    public Laptop(){

    }

    // parameterized constructor
    public Laptop(String name){
        this.name = name;
    }

    // getName method
    public String getName(){
        return this.name;
    }
}

class Dell extends Laptop {

    // default constructor
    public Dell() {

    }

    // dell class parameterized constructor
    public Dell(String name) {
        this.name = name;
    }

    // implementing getDetails method
    public String getDetails() {
        return getName();
    }
}

public class Main {

    public static void main(String[] args) {

        // laptop name being pass through the parameterized constructor
        Dell dell = new Dell("Dell Inspiron");
        System.out.println(dell.getName());
    }
}
