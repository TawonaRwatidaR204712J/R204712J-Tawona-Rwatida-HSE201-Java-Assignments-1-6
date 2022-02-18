package com.company;

class Car {

    // implementation of car class
    int id;
    String model;
    String color;

    public void carFeatures(){
        System.out.println("Id: " + id);
        System.out.println("model: " + model);
        System.out.println("color: " + color);
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
}
class Toyota extends Car {

    // showing composition
    private ToyotaEngine eObj = new ToyotaEngine();

    public void setStart(){
        eObj.start();
    }
    public void setStop(){
        eObj.stop();
    }
}

class ToyotaEngine {

    void start(){
        System.out.println("The engine has started");
    }
    void stop(){
        System.out.println("The engine has stopped");
    }
}

public class Main {

    public static void main(String[] args) {
	    Toyota toy = new Toyota();

        // implementation
        toy.id = 1;
        toy.model = "Corolla";
        toy.color = "White";
        toy.setStart();
        toy.carFeatures();
    }
}
