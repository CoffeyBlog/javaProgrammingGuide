package com.learnJava.projects;

public class Main {

    public static void main(String[] args) {
        // do while loop

        System.out.println("Print 25 copies for the kids in class... ");

        int totalCopies = 0;


        do {
            System.out.println("Printing copy number " + totalCopies);
            totalCopies++;
        } while (totalCopies < 25);

        System.out.println("Total copies made = " + totalCopies);



        // A do while loop says:  "Do ____x____ until ____y____ is achieved."




        // while loop

        int copies = 0;

        while (copies < 25) {
            copies++;
            System.out.println("Printing copy number " + copies);
        }

        System.out.println("Total copies made = " + copies);

        // A while loop says: While ____x____ is true -- do ___y____

    }

}





