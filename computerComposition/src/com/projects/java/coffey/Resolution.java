//The resolution class is part of a monitor - this is composition

package com.projects.java.coffey;

public class Resolution {

    //field variables
    private int width;
    private int height;


    //constructor
    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }


    //getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}


