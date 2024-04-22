package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables
 */

public class Programme15_swap_two_variables {
    static int x, y, z;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for a: ");
        x = scanner.nextInt();
        System.out.println("Enter the number for b: ");
        y = scanner.nextInt();
        swap();
    }

    public static void swap() {
        z = x;
        x = y;
        y = z;
        System.out.println("Swapped values are: " + x + " and " + y);

    }

}
