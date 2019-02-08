package com.projects.java.coffey;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,20,5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27in WideScreen", "Samsung", 27, new Resolution(2540,1440));

        Motherboard themotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");



        //Create a constructor for the PC which is composed of all these
        PC thePC = new PC(theCase, theMonitor, themotherboard);
        thePC.powerUp();

    }
}
