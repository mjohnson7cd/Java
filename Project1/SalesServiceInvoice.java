/*
    Name: Mark Johnson 
    Student ID: 637989
    Email: mjohnson32@una.edu
    Course Information: CIS 315-01
    Program Source File Name: SalesServiceInvoice.java
    Programming Assignment: #1
    Program Description: Creates an invoice with calculated amounts.
    References: No outside resouces used.
    Due Date: 02/08/21

    In keeping with the honor code policies of the University of University of North Alabama, the 
    School of Business, and the Department of Computer Science, I affirm that I have neither 
    given nor received on this programming assignment. This assignment
    represents my individual, original effort.

    Mark Johnson

*/
import java.util.Scanner;

public class SalesServiceInvoice{
    public static void main(String[] args) {
        final double SERVICE_FEE = 1500.00;// applied every month
        final double TAX_RATE = 7.0; // entered as percentage 
        
        //entered my customer
        String CustomerName;
        String CustomerAddress;
        String ModeOfPayment;
        double CostOfSerivice;
        //calculated
        double TaxAmount;
        double TotalPayment;

        Scanner keyboard = new Scanner (System.in);
        //prompts
        System.out.print("Enter Customer Name: ");
        CustomerName = keyboard.nextLine();
        System.out.print("Enter Customer Address: ");
        CustomerAddress = keyboard.nextLine();
        System.out.print("Enter Mode of Payment: ");
        ModeOfPayment = keyboard.nextLine();
        System.out.print("Enter cost of services: $");
        CostOfSerivice = keyboard.nextDouble();
        
        //processing
        TaxAmount = (CostOfSerivice + SERVICE_FEE) * (TAX_RATE / 100);
        TotalPayment = CostOfSerivice + SERVICE_FEE + TaxAmount;

        //output
        System.out.println("\nAcr-zSalesSales As A Service -INVOICE\n"
                        +  "_____________________________________\n");

        System.out.println("Customer Name:            " + CustomerName);
        System.out.println("Customer Address:         " + CustomerAddress);
        System.out.println("Mode of Payment:          " + ModeOfPayment);
        System.out.printf("\nCost for Sales Service:  $%7.2f", CostOfSerivice);
        System.out.printf("\nService Fee:             $%7.2f", SERVICE_FEE);
        System.out.println("\nTax Rate: " + TAX_RATE +"%");
        System.out.printf("Tax Amount:              $%7.2f", TaxAmount);
        System.out.println("\n                         ________");
        System.out.printf("\nTotal Payment:           $%7.2f\n\n", TotalPayment);




    }
}