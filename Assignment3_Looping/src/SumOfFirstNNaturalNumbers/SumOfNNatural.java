/*6. Sum of First N Natural Numbers

Write a program using a while loop to calculate the sum of first N natural numbers.

Example:
Input: 5
Output: 15*/

package SumOfFirstNNaturalNumbers;

import java.util.Scanner;

public class SumOfNNatural {
	
	public static void sumOfN(int n) {
		int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int num = scan.nextInt();
		scan.close();
		sumOfN(num);
	}

}
