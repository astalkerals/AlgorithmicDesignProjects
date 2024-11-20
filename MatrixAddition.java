//Created by Abigail Stalker

package labs;

import java.util.Scanner;

public class MatrixAddition {

	public static void Prompt(int index)
	{
		System.out.println("Enter value at index " + index);
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("Please enter the length and width of the first matrix");
		
		//sets the matrix dimensions to user-defined numbers
		int length = k.nextInt();
		int width = k.nextInt();
		int [] [] matrix = new int [length] [width];
		int[] [] matrix3 = new int [length][width];

		//checks to see if dimensions are 2x2
		if(length >2 || width> 2) {
			System.out.println("Invalid dimensions, these cannot be added.");
		}
		else {

			//assigns values to the first matrix
			for(int i=0; i<width; i++) {
				Prompt(0);
				matrix [0] [i] = k.nextInt();
			}
			for(int i =0; i<width; i++) {
				Prompt(1);
				matrix [1] [i] = k.nextInt();
			}

		}

		System.out.print("Please enter the length and width of the second matrix");
		int length2 = k.nextInt();
		int width2 = k.nextInt();
		int [] [] matrix2 = new int [length2] [width2];

		if(length2 >2 || width2> 2) {
			System.out.println("Invalid dimensions, these cannot be added.");
		}
		else {
			
			//assigns values to the second matrix
			for(int i=0; i<width2; i++) {
				Prompt(0);
				matrix2 [0] [i] = k.nextInt();
				//sets the third matrix's values to be the addition of the first two
				matrix3 [0] [i] = matrix[0] [i] + matrix2 [0] [i];
			}
			for(int i =0; i<width2; i++) {
				Prompt(1);
				matrix2 [1] [i] = k.nextInt();
				matrix3 [1] [i] = matrix[1] [i] + matrix2 [1] [i];

			}



			//prints the first matrix
			for(int i = 0; i < matrix.length; i++) {
				System.out.print("\n");

				for(int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + " ");

				}
			}	

			System.out.println("\n +");

			//prints the second matrix
			for(int s = 0; s < matrix2.length; s++) {
				System.out.println("");

				for(int j = 0; j < matrix2.length; j++) {
					System.out.print(matrix2[s][j] + " ");

				}
			}
			for(int e = 0; e < matrix2.length; e++) {
				System.out.println("");
				for(int j = 0; j < matrix2.length; j++) {
				}
			}
			System.out.println(" = ");

			
			//prints the combined third matrix
			for(int i = 0; i < matrix3.length; i++) {
				System.out.print("\n");

				for(int j = 0; j < matrix3.length; j++) {
					System.out.print(matrix3[i][j] + " ");

				}
			}	
		}





	}

}

