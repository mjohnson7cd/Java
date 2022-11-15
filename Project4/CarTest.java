/*  
    Name:   
    Student ID: 637989
    Email: mjohnson32@una.edu
    Course Information: <CIS 315-01>
    Program Source File Name:  CarTest.java
    Programming Assignment:  #4 
    Program Description: Test program for Car class
    References: Textbook
    Due Date:  05/03/2021
 
   In keeping with the honor code policies of the University of University of North Alabama, the School of Business, and the Department of Computer Science and Information Systems, I affirm that I have neither given nor received on this programming assignment. This assignment
represents my individual, original effort.
 ... My Signature is on File.
         
*/ 
import java.util.Scanner;

/**
   This program runs a simple test
   of the Car class. Complete the missisng statements in the code. 
*/

public class CarTest
{
   public static void main(String[] args)
   {
      String testMak;   // To hold the make
      String testMod;   // To hold a model number
      int testYear;     // To hold the year of manufacture
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the make of the car.
      System.out.printf("%-28s","Enter the make of the car: ");
      testMak = keyboard.nextLine();

      // Get the model number.
      System.out.printf("%-28s","Enter the model number: ");
      testMod = keyboard.nextLine();
      
      // Get the year.
      System.out.printf("%-28s","Enter the year: ");
      testYear = keyboard.nextInt();
      
      // Create an instance of the Car class,
      // passing the data that was entered as arguments
      // to the constructor.
      Car car = new Car(testMak,testMod,testYear);

      // Get the data from the car and display it.
      // Use the methods in the Car class for this. 
      System.out.println();
      System.out.println("Here is the data that you provided:");
	  // Display the make
      System.out.printf("%-15s %7s\n", "Make:", car.getMake());

	  // Display the model of car 
	   System.out.printf("%-15s %7s\n", "Model number:", car.getModel());
	  
	  // Display the year of manuafacture
      System.out.printf("%-15s %7d\n", "Year:", car.getYear());
	  
   }
}