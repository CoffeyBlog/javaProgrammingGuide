package com.projects.java.coffey;

public class MasterBathroom {

    private int sink;
    private int shower;


    //constructor
    public MasterBathroom(int sink, int shower) {
        this.sink = sink;
        this.shower = shower;
    }

    public void flushToilet(){
        System.out.println("Swooooosh");
    }




    //getters
    public int getSink() {
        return sink;
    }

    public int getShower() {
        return shower;
    }
}
