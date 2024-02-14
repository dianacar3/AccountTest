/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounttest;

/**
 *
 * @author diana
 */
//////////  Account Test ///////
// AccountTest.java
// Inputting and outputting floating-point 
//numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
   	// main method begins execution of Java application
   public static void main( String[] args ) 
   {
      	// create Account objects
Account account1 = new Account( 50.00 ); 
      Account account2 = new Account( -7.53 ); 

      	// display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
      
      	// create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double depositAmount; 	// deposit amount from user

      System.out.print( "Enter deposit for account1: " ); 
      depositAmount = input.nextDouble(); 	// user input
      System.out.printf( "\nAdding %.2f to account1 balance\n\n",depositAmount );
      account1.credit( depositAmount );	 // add to account1 balance

      	// display balances
      System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

      System.out.print( "Enter deposit amount for account2: " ); 
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nAdding %.2f to account2 balance\n\n",depositAmount );
      account2.credit( depositAmount ); // add to account2 balance

      	// display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );
      
        //withdraw
      System.out.print("Enter a withdraw amount for account1: ");
         double debit = input.nextDouble();
         account1.debit(debit);
      System.out.printf("account1 balance: %.2f\n\n",account1.getBalance());
              
      System.out.print("Enter a withdraw amount for account2: ");
        debit = input.nextDouble();
        account2.debit(debit);
      System.out.printf("account2 balance: %.2f\n", account2.getBalance());     
   } // end main
} // end class AccountTest

