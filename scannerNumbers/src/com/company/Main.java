package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        System.out.println("Enter a whole number between -2,147,483,646 -- and --  2,147,483,647");

      Scanner sc = new Scanner(System.in);

        int userNumber = sc.nextInt();

        System.out.println(userNumber);


    }
}
