/*11. Factorial of a Number

Write a program using a for loop to find factorial of a number.

Example:
Input: 5
Output: 120*/

package FactorialNumber;

import java.util.Scanner;

public class FactorialOfNum {
	
	public static void Factorial(int num) {
		double fact = 1;
		int i = 1;
		do {
			fact = fact*i;
			i++;
		} while(i<=num);
		
		System.out.println("The factorial of "+num+ " is " + fact);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		Factorial(num);

	}

}
