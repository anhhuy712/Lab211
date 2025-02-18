package week1;

import java.util.Scanner;

public class CalculateEquation {

    private static final Scanner sc = new Scanner(System.in);

    public static double checkInputDouble() {
        // Loop until the user enters a valid double
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Must be a valid double.");
                System.out.print("Enter again: ");
            }
        }
    }

    // Check if a number is odd
    public static boolean checkOdd(double n) {
        return ((int) n) % 2 != 0;
    }

    // Check if a number is even
    public static boolean checkEven(double n) {
        return ((int) n) % 2 == 0;
    }

    // Check if a number is a perfect square
    public static boolean checkSquareNumber(double n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == (int) n;
    }

    // Solve the superlative equation ax + b = 0
    public static void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();

        System.out.print("Enter B: ");
        double b = checkInputDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions (0 = 0).");
            } else {
                System.out.println("No solution (contradiction).");
            }
            return;
        }

        double x = -b / a;
        System.out.println("Solution: x = " + x);

        // Check and display properties of numbers
        System.out.print("Odd numbers: ");
        if (checkOdd(a)) System.out.print(a + " ");
        if (checkOdd(b)) System.out.print(b + " ");
        if (checkOdd(x)) System.out.print(x + " ");
        System.out.println();

        System.out.print("Even numbers: ");
        if (checkEven(a)) System.out.print(a + " ");
        if (checkEven(b)) System.out.print(b + " ");
        if (checkEven(x)) System.out.print(x + " ");
        System.out.println();

        System.out.print("Perfect squares: ");
        if (checkSquareNumber(a)) System.out.print(a + " ");
        if (checkSquareNumber(b)) System.out.print(b + " ");
        if (checkSquareNumber(x)) System.out.print(x + " ");
        System.out.println();
    }

    
}
