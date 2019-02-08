package com.learnJava.projects;

public class Main {

    static int gcd(int a, int b) {

        int c;
        while(b!=0){
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }



    public static void main(String[] args) {
	// Euclid's Algorithm

        System.out.println("The greatest common denominator is " + gcd(100_005));

    }
}



