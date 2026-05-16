package FibonacciSeriesPrint;

import java.util.Scanner;

public class FibonacciSeriesProgram {

    public static void FibonacciPrint(int num) {
        int n1 = 0;
        int n2 = 1;

        System.out.println("The Fibonacci series up to " + num + " terms:");
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < num; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(); // newline at the end
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int num = scan.nextInt();
        scan.close();
        FibonacciPrint(num);
    }
}
