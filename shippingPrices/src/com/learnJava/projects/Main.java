package com.learnJava.projects;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {


        double totalSale = 0;


        Scanner in = new Scanner (System.in);
        System.out.println("Enter the total amount of the sale");
        totalSale = in.nextDouble();


        if (totalSale < 25) {
       totalSale = totalSale + 15;
       } else if (totalSale < 50){
       totalSale = totalSale + 10;
     } else if (totalSale <= 75) {
           totalSale = totalSale + 5;
     }

        System.out.println("The total cost of your sale is: " + totalSale);

    }
}
