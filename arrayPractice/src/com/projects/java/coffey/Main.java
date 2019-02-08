package com.projects.java.coffey;

public class Main {

    public static void main(String[] args) {
        // array Practice

        //creating an array of 10 elements
        int[] myIntArray = new int[10];

        //storing the number 50 ... in element 5

        myIntArray[0] = 0;
        myIntArray[1] = 10;
        myIntArray[2] = 20;
        myIntArray[3] = 30;
        myIntArray[4] = 40;
        myIntArray[5] = 50;

        //print out an element from the array
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[5]);








        //Second way of initializing an array -- this way is better for when:

        // 1. You have lots of numbers
        // 2. You know before hand the numbers that you will need to input into the array
        int[] mySecondIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(mySecondIntArray[3]);
        System.out.println(mySecondIntArray[8]);


        //Third way of initializing an array -- using a for loop.
        int[] myThirdIntArray = new int[25];
        for (int i = 0; i < myThirdIntArray.length; i++) {
            myThirdIntArray[i] = i * 100;
        }

        printArray(myIntArray);

        printArray(mySecondIntArray);

        printArray(myThirdIntArray);

    }





        public static void printArray(int[] array) {

            for (int i = 0; i < array.length; i++){
                System.out.println("Element " + i + " , value is " + array[i]);
            }

        }
}

