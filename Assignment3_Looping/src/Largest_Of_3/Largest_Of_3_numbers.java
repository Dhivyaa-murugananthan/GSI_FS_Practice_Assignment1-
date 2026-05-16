
/*2. Largest of Three Numbers

Write a program to find the largest among three numbers using nested if-else.

Example:
Input: 10 25 15
Output: 25 is largest*/


package Largest_Of_3;

import java.util.Scanner;

public class Largest_Of_3_numbers {
	
	public static void LargestOf3(int a, int b, int c) {
		if (a>b) {
			if (a>c) {
				System.out.println("A = " +a + " is Largest");
			}
			else {
				System.out.println("C = " + c + " is Largest");
			}
		}
		else {
			if (b>c) {
				System.out.println("B = " + b +" is Largest");
			}
			else {
				System.out.println("C = " + c  +" is Largest");
			}
		}
	}
	

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 0, b = 0, c = 0;
        System.out.println("Enter three numbers:");
        for (int i = 1; i <= 3; i++) {
            int num = scan.nextInt();
            if (i == 1) a = num;
            else if (i == 2) b = num;
            else c = num;
        }
        scan.close();

       
        LargestOf3(a, b, c);

	}

}
