//Created by Abigail Stalker

import java.util.Scanner;

public class ZodiacSigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//establishing concept to user 
		System.out.println("What is your zodiac? Enter your birthday --");
		System.out.println("Month followed by day as numbers.");
		Scanner keyboard = new Scanner(System.in);
//getting user information
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		String sign = null;
		
//checking for correct month and day
		if(month > 12 || month <1) {
			System.out.println("Invalid month!");
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day <1 || day>30) {
				System.out.println("Invalid day!");
			}
		} 
		else if(month == 2) {
			if(day<1 || day>29) {
				System.out.println("Invalid day!");
			}
		}
		else if (month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month ==12) {
			if(day<1 || day>30) {
		
			System.out.println("Invalid day!");
		}
		
		else {
			if(month == 1) {
				if(day<20) {
					sign = "Capriocorn";
				}
				else {
					sign = "Aquarius";	
				}
			}
			else if(month == 2) {
				if(day<19) {
					sign = "Aquarius";
				}
				else {
					sign = "Pisces";
				}
			}
			else if(month == 3) {
				if(day<21) {
					sign = "Pisces";
				}
				else {
					sign = "Aires";
				}
			}
			else if(month == 4) {
				if(day<20) {
					sign = "Aires";
				}
				else {
					sign = "Taurus";
				}
			}
			else if(month == 5) {
				if(day<21) {
					sign = "Taurus";				
				}
				else {
					sign = "Gemini";
				}
			}
			else if (month == 6) {
				if(day<21) {
					sign = "Gemini";
				}
				else {
					sign = "Cancer";
				}
			}
			else if (month == 7) {
				if(day<23) {
					sign = "Cancer";
				}
				else {
					sign = "Leo";
				}
			}
			else if (month == 8) {
				if(day<23) {
					sign = "Leo";
				}
				else {
					sign = "Virgo";
				}
			}
			else if (month == 9) {
				if(day<23) {
					sign = "Virgo";
				}
				else {
					sign = "Libra";
				}
			}
			else if (month == 10) {
				if(day<23) {
					sign = "Libra";
				}
				else {
					sign = "Scorpio";
				}
			}
			else if (month == 11) {
				if(day<22) {
					sign = "Scorpio";
				}
				else {
					sign = "Sagittarius";
				}
			}
			else if (month == 12) {
				if(day<22) {
					sign = "Sagittarius";
				}
				else {
					sign = "Capricorn";
				}
			}
			System.out.println("You are a " + sign + "!");
		}
		}
	}
}
		
//telling the user their zodiac
