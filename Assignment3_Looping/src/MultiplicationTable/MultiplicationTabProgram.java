/*7. Multiplication Table

Write a program to print the multiplication table of a number using a for loop.

Example:
Input: 4
Output:

4 x 1 = 4
4 x 2 = 8
...
4 x 10 = 40*/

package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTabProgram {
	
	public static void multiplicationTable(int inputNumber) {
		
		for (int i = 1; i<=10; i++ ) {
			int result = i * inputNumber;
			
			System.out.println(inputNumber + " X " +  i  + "=" + " " + result );
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int num = scan.nextInt();
		scan.close();
		multiplicationTable(num);
		

	}

}
