package com.company;

class Student{

    // class fields
    private String name;
    private String rollNumber;

    // getters and setters
    public void setName(final String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setRollNumber(final String rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getRollNumber(){
        return this.rollNumber;
    }
}

public class Main {

    public static void main(String[] args) {

        Student stud = new Student();

        // checking all fields and getters/setters
        stud.setName("Tawona");
        stud.setRollNumber("R204712J");
        System.out.println("Student Name: " + stud.getName());
        System.out.println("Student Roll Number: " + stud.getRollNumber());
    }
}
