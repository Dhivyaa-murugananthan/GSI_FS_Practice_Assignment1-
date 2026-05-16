/*8. Reverse a Number

Write a program using a while loop to reverse a number.

Example:
Input: 1234
Output: 4321*/


package ReverseNumber;

import java.util.Scanner;

public class ReverseNumberProgram {
	
	public static void ReverseNumbers(int number) {
		int sign= (number<0)? -1:1;
		number = Math.abs(number); 
		int rev=0;
		while(number!=0) {
		    rev = rev*10 + number%10;
		    number /= 10;
		}
		
		rev = rev * sign;
		System.out.println("The reversed number is: " + rev);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		ReverseNumbers(num);
	}

}
