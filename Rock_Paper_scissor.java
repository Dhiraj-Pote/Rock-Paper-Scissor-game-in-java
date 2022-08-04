package com.java.Projects;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_scissor {
    public static void main(String[] args) {

        System.out.println("Rock Paper Scissor Game...");      //welcome screen
        System.out.println("_________________");
        System.out.println("Enter 1 for Rock \uD83E\uDEA8");   //instructions
        System.out.println("Enter 2 for Paper \uD83E\uDDFB");
        System.out.println("Enter 3 for Scissor ✂");
        System.out.println("_________________");

        Scanner inp = new Scanner(System.in);            
        int userInput = inp.nextInt();                  // taking user input

        String uI = ""; 
        switch (userInput) {                           // showing user input
            case 1 -> uI = "Rock \uD83E\uDEA8";
            case 2 -> uI = "Paper \uD83E\uDDFB";
            case 3 -> uI = "Scissor ✂";
            default -> {
                System.out.println("Wrong Input ... Try again");
                System.exit(0);
            }
        }
        System.out.print("User's Choice: " + uI);

        Random random = new Random();
        int computerInput = random.nextInt(3) + 1;             // taking any random number: 1 / 2 / 3 

        String cI  = "";
        switch (computerInput) {                              // showing random number
            case 1 -> cI = "Rock \uD83E\uDEA8";
            case 2 -> cI = "Paper \uD83E\uDDFB";
            case 3 -> cI = "Scissor ✂";
        }
        System.out.println("  |  Computer's Choice: " + cI);
        System.out.println();

        if (userInput == computerInput)                     // Gaming Condition
            System.out.println("        Game is Draw.....");
        else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 1 || userInput == 3 && computerInput == 2)
            System.out.println("          Hurray ... You Won");
        else
            System.out.println("          Sorry You lost ... Better luck next time");
    }
}
