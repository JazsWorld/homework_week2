package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data: Input first number: 125
 * Input second number: 24
 * Expected Output : 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Programme18_remainder_of_twonumbers {
    int x;
    int y;

    // addition
    public static void addition(int x, int y) {
        int add1 = x + y;
        System.out.println("The addition of two number is:" + add1);
    }

    //subtraction
    public static void subtraction(int x, int y) {
        int sub1 = x - y;
        System.out.println("The subtraction of two number is:" + sub1);
    }

    //multiplication
    public void multiplication(int x, int y) {
        int mul1 = x * y;
        System.out.println("The multiplication of two number is:" + mul1);
    }

    //division
    public void division(int x, int y) {
        int div1 = x / y;
        System.out.println("The division of two number is:" + div1);
    }

    //mod
    public void modulo(int x, int y) {
        int mod1 = x % y;
        System.out.println("The division of two number is:" + mod1);
    }

    public static void main(String[] args) {
        //scanner method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Number: ");
        int x = scanner.nextInt();
        System.out.println("Enter your Second Number: ");
        int y = scanner.nextInt();

        // two instance and two static method
        addition(x, y);
        subtraction(x, y);
        Programme18_remainder_of_twonumbers obj6 = new Programme18_remainder_of_twonumbers();
        obj6.multiplication(x, y);
        obj6.division(x, y);
        obj6.modulo(x, y);


    }
}
