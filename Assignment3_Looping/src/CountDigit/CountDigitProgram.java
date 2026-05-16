/*10. Count Digits in a Number

Write a program using a while loop to count the number of digits in an integer.

Example:
Input: 98765
Output: 5*/
package CountDigit;

import java.util.Scanner;

public class CountDigitProgram {
	
	public static void CountDigits(int num) {
		int original = num;
		int digit = 0;
		while(num!=0) {
			num = num/10;
			digit++;
			
		}
		System.out.println("The number of digits in the number "+ original + " is " + digit);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		scan.close();
		CountDigits(num);

	}

}
