/*  
    Name:   Mark Johnson
    Student ID: 637989 
    Email: mjohnson32@una.edu 
    Course Information: <CIS 315-01>
    Program Source File Name:  GuessingGame.java
    Programming Assignment:  #3 
    Program Description: Random number guessing game.
    References: RollDice.java
    Due Date: 05/03/2021 
 
   In keeping with the honor code policies of the University of University of North Alabama, the School of Business, and the Department of Computer Science and Information Systems, I affirm that I have neither given nor received on this programming assignment. This assignment
represents my individual, original effort.
 ... My Signature is on File.
         
*/ 
import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        int next_num = 0;
        int num_tries = 0;
        int random_num = 0;
        Scanner keyboard = new Scanner(System.in);
 
        System.out.println("Welcome to the Guessing Game\n"+
                           "----------------------------");
        
        while (next_num != -1){
            Random rand = new Random();
            random_num = rand.nextInt(20) + 1;

            System.out.println("\nI’m thinking of a number between 1 and 20. " +
                                   "Enter -1 if you would like to quit.");
        
            System.out.print("\nWhat is your guess? ");
            
            while (random_num != next_num){
                if (num_tries > 0){
                    System.out.println("Guess again: ");
                }

                next_num = keyboard.nextInt();

                if (next_num == -1){
                    break;
                }

                num_tries++;

                if (random_num > next_num){
                    System.out.println("This is too low!");

                } else if (random_num < next_num){
                    System.out.println("This is too high!");

                }
            }
            if (next_num == -1){
                System.out.println("\nThe number was: " + random_num);
                System.out.println("The number of tries: " + num_tries);
                System.out.println("Okay, Game Over.\nHave a great day!");
                break;
            }
            System.out.println("\nCongrats! You nailed it.");
            System.out.println("The number of tries: " + num_tries);
            System.out.println("Okay, Game Over.\nHave a great day!");
            num_tries = 0;
        }
    }
}
