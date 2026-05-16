/*9. Palindrome Number

Write a program to check whether a number is palindrome or not.

Example:
Input: 121
Output: Palindrome*/
package Palindrome;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static void PalindromeCheck(int number) {
		int original = number;
	
		int rev=0;
		while(number!=0) {
		    rev = rev*10 + number%10;
		    number /= 10;
		}
		

		if( rev == original) {
			System.out.println("The Entered number " + original +  " is Palindrome"); 
		}else {
			System.out.println("The Enetered number " + original + " is not a Palindrome");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		PalindromeCheck(num);

	}

}
