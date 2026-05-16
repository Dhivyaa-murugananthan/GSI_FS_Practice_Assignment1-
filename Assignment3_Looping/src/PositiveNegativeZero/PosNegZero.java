/*4. Positive, Negative, or Zero

Write a program to check whether a number is positive, negative, or zero.*/

package PositiveNegativeZero;

import java.util.Scanner;

public class PosNegZero {
	
	protected static void posNegZeroProgram(int number) {
		if (number == 0) {
			System.out.println("The Entered number is Zero which is neither positive nor negative");
		}
		else if (number > 0) {
			System.out.println("The Entered number "+ number +" is Positive");
		}else {
			System.out.println("The Entered number "+ number + " is Negative");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		scan.close();
		posNegZeroProgram(num);

	}

}
