//-----------------------------------------------------------------------------------
// This program finds the multiple between two numbers
// Written by: Harinder Partap Singh
// For COMPUTER SCIENCE
//-----------------------------------------------------------------------------------

/*
 * This program outputs the multiples of 3 between two integers
 * Input:Two integers
 * Output:Multiples of 3
 */

import java.util.Scanner;


public class Question8 {
	//Main method
	public static void main(String[] args) {
		
		//Scanner object is created
		Scanner keyIn = new Scanner(System.in);
		
		System.out.print("Please enter two integers:");
		
		//Declaring and initializing the variables
		int num1 = keyIn.nextInt();
		int num2 = keyIn.nextInt();
		int greatest, smallest;
		int counter = 0;
		System.out.println("hello");
		//Checking the greatest and smallest integers 
		if (num1 > num2) {
			greatest = num1;
			smallest = num2;
		} else {
			greatest = num2;
			smallest = num1;
		}
		
		//While loop will execute from smallest to greatest
		
		while (smallest <= greatest) {
			if (smallest % 3 == 0) {
				System.out.print(smallest + " ");
				counter++;
				if (counter % 3 == 0) {
					counter = 0;
					
					//Output 
					System.out.println();
				}
			}
			//increment of smallest
			smallest++;
		}
		//Scanner is closed
		keyIn.close();
	}
} // End of class Question8
