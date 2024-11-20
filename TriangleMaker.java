//Created by Abigail Stalker

import java.util.Scanner;

public class TriangleMaker {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle:");
		int triangleLength = k.nextInt();
		int i = 0;
		int i2 = 0;
		String astericks = "*";
		
		while(i < triangleLength) {
			System.out.println(astericks);
			i++;
			astericks = astericks + "*";
		}
		
		while(i > 0) {
			astericks = "*";
			i--;
			i2 = i;
			
			while(i2 > 0) {
				System.out.print(astericks);
				i2--;
			}
			System.out.print("\n");
		}
		
		System.out.println("DONE!");

	}

}
