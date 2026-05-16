/*12. Prime Number Check

Write a program to check whether a number is prime or not using loops and if condition.

Example:
Input: 11
Output: Prime*/

package PrimeNumberCheck;

import java.util.Scanner;

public class PrimeNumberProgram {

    public static void PrimeNumber(int num) {
        if (num <= 1) {
            System.out.println(num + " is not Prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? num + " is Prime" : num + " is not Prime");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        scan.close();
        PrimeNumber(num);
    }
}
