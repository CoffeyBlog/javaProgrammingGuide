package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Please write your first name in the console");


                Scanner sc = new Scanner(System.in);


                //This code below -v- looks for the next thing written in the console ...
                String userInput = sc.next();


                //This changes whatever the user wrote in the console -- to all uppercase for a more
                String uppercased = userInput.toUpperCase();



                //This prints the original user input into the console
                System.out.println(userInput);


                //This prints the data stored in the variable -- named uppercased
                System.out.println(uppercased);



                //This should print the first letter of the users name
                char firstCharacter = userInput.charAt(0);
                 System.out.println(firstCharacter);



    }
}
