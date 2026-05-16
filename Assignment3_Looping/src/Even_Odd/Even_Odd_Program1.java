/*1. Even or Odd Number

Write a program to check whether a number is even or odd using if-else.

Example:
Input: 7
Output: Odd*/

package Even_Odd;

import java.util.Scanner;
public class Even_Odd_Program1 {

	public static void Even_Odd_Check(int num) {
		if (num == 0) {
			System.out.println("Entered number is neither Odd nor Even");
		} else if(num%2==0) {
			System.out.println("Entered number is an Even number");
		}else {
			System.out.println("Entered number is an Odd number");
		}
	
}




	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();
		Even_Odd_Check(input);

	}

}
