package com.learnJava.projects;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] myIntArray = new int[25];
        printArray(myIntArray);
    }





    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = i*10;
        }
        for (int i=0; i<array.length; i++){
            System.out.println("Element " + i + " , value is " + array[i]);
        }

    }

}
