/*3. Leap Year Program

Write a program to check whether a year is a leap year or not.

Hint:
A leap year is divisible by 4 but not by 100 unless divisible by 400.*/

package Find_Leap_Year;

import java.util.Scanner;

public class LeapYearProgram {
	
	public static void LeapYear_Find(int year) {
		if ((year%4==0  && year%100!=0) || (year%400==0)) {
			System.out.println("The year "+ year + " is a leap year");
		}else {
			System.out.println("The year " + year +" is not a leap year");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year in number");
		int year = scan.nextInt();
		scan.close();
		LeapYear_Find(year);

	}

}
