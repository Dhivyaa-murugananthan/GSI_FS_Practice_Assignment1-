/*5. Print Numbers from 1 to N

Write a program using a for loop to print numbers from 1 to N.

Example:
Input: 5
Output: 1 2 3 4 5*/

package PrintNumbersFrom1toN;

import java.util.Scanner;

public class PrintNumbersProgram {
	
	public static void PrintNumbers(int numberRange) {
	
		for( int i = 1; i<=numberRange ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number Range to print: ");
		int num = scan.nextInt();
		scan.close();
		PrintNumbers(num);

	}

}
