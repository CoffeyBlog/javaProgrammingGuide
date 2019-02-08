package com.projects.java.coffey;

public class LivingRoom {
    private int fireplace;
    private int couch;
    private int Television;



    //constructors
    public LivingRoom(int fireplace, int couch) {
        this.fireplace = fireplace;
        this.couch = couch;
    }


    public void watchTV(){
        System.out.println("Its TV time");
    }




    //getters
    public int getFireplace() {
        return fireplace;
    }

    public int getCouch() {
        return couch;
    }

    public int getTelevision() {
        return Television;
    }
}
