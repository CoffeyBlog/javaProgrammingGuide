package com.projects.java.coffey;

public class MasterBedroom {

    //instance variables - fields
    private int bed;
    private int windows;


    //constructor to initialize MasterBedroom objects
    public MasterBedroom(int bed, int windows) {
        this.bed = bed;
        this.windows = windows;
    }


    public void getInBed(){
        System.out.println("ZZZzzzzz");
    }




    //Getters
    public int getBed() {
        return bed;
    }

    public int getWindows() {
        return windows;
    }
}
