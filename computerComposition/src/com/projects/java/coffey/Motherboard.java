package com.projects.java.coffey;

public class Motherboard {


    //local instance variables
    private String Model;
    private String Manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;



    //constructor initializing object and create initial state
    //-- this -- keyword refers to the field(s) or variables of the class
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        Model = model;
        Manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;

    }

    //method with String parameter
    public void loadProgram(String programName) {
        System.out.println("Please wait while " + programName + " loads");
    }




    //getter methods - allow us to return the data placed in the fields while still adhering to encapsulation.
    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
