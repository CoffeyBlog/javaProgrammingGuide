package com.projects.java.coffey;

public class Television {

    private String Make;
    private String Model;


    //constructor
    public Television(String make, String model) {
        Make = make;
        Model = model;
    }



    public void turnOn(){
        System.out.println("powering up");
    }


    public void seinfeld(){
        System.out.println("Watch Seinfeld");
    }




    //Getters
    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }
}
