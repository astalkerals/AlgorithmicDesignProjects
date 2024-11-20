//created by Abigail Stalker

package labs;

import java.util.Scanner;

public class BelowAverage {
	public static void main(String[] args) {
		//Ask the user for numbers for the array
		//use for loop to average the arrays
		//use for loop to determine which are below average
		
		float[] temperatures = new float[10];
		Scanner k = new Scanner(System.in);
		float average = 0;
		
		System.out.println("Welcome to the below average temperature tester program.");
		
		for(int i = 0; i < 10; i++) {
			int day = i+1;
			System.out.println("Please enter the temperature for day " + day);
			temperatures[i] = k.nextFloat();
			average = average + temperatures[i];
			
		}
		
		average = average /= 10;
		System.out.println("The average temperature was " + average);
		System.out.println("The days that were below average were:");
		
		for(int i = 0; i <10; i++) {
			int day = i+1;
			if(temperatures[i]< average) {
				System.out.println("Day " + day + " with " + temperatures[i]);
			}
			
		}
		
		
	}

	
}
