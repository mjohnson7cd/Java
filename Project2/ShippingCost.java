/*  
    Name:  Mark Johnson 
    Student ID: 637989 
    Email: mjohnson32@una.edu
    Course Information: CIS 315-01
    Program Source File Name:  Weight_calculator.java
    Programming Assignment:  #2 
    Program Description: Calculates shipping cost based on weight
    References: Textbook
    Due Date:  	 03/30/2021	 	 
 
   In keeping with the honor code policies of the University of University of North Alabama, the School of Business, and the Department of Computer Science, I affirm that I have neither given nor received on this programming assignment. This assignment
represents my individual, original effort.
 ... My Signature is on File.
         
*/ 

import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        float weight = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the shipping weight or -1 to EXIT: ");
        weight = keyboard.nextFloat();

        while (weight != -1){// will run until user inputs -1
            if (weight > 0 && weight <= 1){// 0 < weight <= 1
                System.out.println("The shipping cost for package weighing " + 
                weight +" pounds is 3.50 dollars.");

            } else if (weight > 1 && weight <= 3){// 1< weight <= 3 
                System.out.println("The shipping cost for package weighing " + 
                weight +" pounds is 5.50 dollars.");

            } else if (weight > 3 && weight <= 10){// 3 < weight <= 10 
                System.out.println("The shipping cost for package weighing " + 
                weight +" pounds is 8.50 dollars.");

            } else if (weight > 10 && weight <= 20){//10 < weight <= 20
                System.out.println("The shipping cost for package weighing " + 
                weight +" pounds is 10.50 dollars.");

            } else {
                System.out.println("The package cannot be shipped.");
            } 

            System.out.print("Enter the shipping weight or -1 to EXIT: ");
            weight = keyboard.nextFloat();// asks for next input
        }
        keyboard.close();
    }
}