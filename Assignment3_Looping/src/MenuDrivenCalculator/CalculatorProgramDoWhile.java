package MenuDrivenCalculator;

import java.util.Scanner;

public class CalculatorProgramDoWhile {
	


	public static void main(String[] args) {
		
		int choice;
		Scanner scan = new Scanner(System.in);
		
		
		
		
		do {
			System.out.println("**********CALCULATOR MENU**********");
			
			System.out.println("1- Addition");
			System.out.println("2- Subtraction");
			System.out.println("3- Multiplication");
			System.out.println("4- Division");
			System.out.println("5- Exit");
			
			System.out.println("Enter your Choice of operation");
			choice = scan.nextInt();
			
			if (choice>=1 && choice <=4) {
				System.out.println("Enter two numbers to perform operation");
				double a = scan.nextDouble();
				double b = scan.nextDouble();
				
				switch(choice) {
				case 1:
					System.out.println("Addition of two numbers is: " + (a+b));
					break;
					
				case 2:
					System.out.println("Subtraction of two numbers is: "+(a-b));
					break;
					
				case 3:
					System.out.println("Multiplication of two numbers is: "+(a*b));
					break;
					
				case 4:
					System.out.println("Division of two numbers is: "+(a/b));
					break;
					
				default:
					System.out.println("Your input is invalid");
				scan.close();
				}
			}
			
		} while(choice!=5);
	}


	}


