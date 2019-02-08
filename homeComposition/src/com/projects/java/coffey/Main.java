package com.projects.java.coffey;

public class Main {


    public static void main(String[] args) {
	// write your code here


        MasterBedroom masterBedroom = new MasterBedroom(1,4);

        MasterBathroom masterBathroom = new MasterBathroom(1,1);

        LivingRoom livingRoom = new LivingRoom(1,1);

        Television television = new Television("Vizio", "xT-500");





        House theHouse = new House (masterBedroom, masterBathroom, livingRoom, television);
        masterBathroom.flushToilet();

        television.seinfeld();

        television.turnOn();

        livingRoom.watchTV();

        masterBedroom.getInBed();


    }
}
