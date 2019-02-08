package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        double coffey = 165d;

        double pounds = 1.0d;
        double kilos = 0.45359237d;

        double coffey_weight = (coffey * pounds);

        double total_kilo_weight = (coffey_weight * kilos);

        System.out.println("Lucas Coffey weighs " + total_kilo_weight);

    }
}


