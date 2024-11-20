//Created by Abigail Stalker

package homework;

import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("Enter a four-bit binary number");

		int[] binary = new int[4];

		int sum1 = 0;
		
		//Puts numbers in an array

		for(int i=3; i>=0; i--) {
			binary[i] = k.nextInt();
		}
		
		//Converts each number to its corresponding binary value
		for(int e = 3; e >= 0; e--) {
			sum1 += binary[e] * Math.pow(2,3-e);
		}
		
		System.out.println("Enter another four-bit binary number");
		
		int[] binary2 = new int[4];
		
		int sum2 = 0;

		//Puts new numbers in a different array
		for(int i=3; i>=0; i--) {
			binary2[i] = k.nextInt();

		}
		
		//Converts the new numbers to their corresponding binary values
		for(int e = 3; e >= 0; e--) {
			sum2 += binary2[e] * Math.pow(2,3-e);
		}
		
		int total = sum1 + sum2;
		
		//Prints values to the console
		System.out.println("The first number is " + sum1);
		System.out.println("The second number is " + sum2);
		System.out.println("Added together is " + total);
	}
	

}
