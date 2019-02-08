//the resolution field is an example of composition.


package com.projects.java.coffey;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;


    //constructor - initializes object
    //this refers to fields
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }


    //method with 3 parameters
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + " , " + y + " coordinates. In color " + color);
    }


    //getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}



