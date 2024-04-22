package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

public class Programme13_average_of_numbers {
    static int a, b, c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Number: ");
        a = scanner.nextInt();
        System.out.println("Enter your Second Number: ");
        b = scanner.nextInt();
        System.out.println("Enter your Third Number: ");
        c = scanner.nextInt();
        average();
    }

    public static void average() {

        System.out.println("Average of three numbers is:" + (a + b + c) / 3);
    }
}
