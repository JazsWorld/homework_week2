package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input
 * and prints its multiplication table up to 10. Test Data: Input a number: 8
 * Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
 */

public class Programme10_Multiplication_table {
    static int j1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        j1 = scanner.nextInt();
        table();
    }

    public static void table() {
        for (int i = 0; i < 10; i++) {
            System.out.println(j1 + " x " + (i + 1) + " = " + (j1 * (i + 1)));
        }
    }

}
