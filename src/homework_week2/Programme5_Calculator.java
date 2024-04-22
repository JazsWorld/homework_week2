package homework_week2;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction,
 * multiplication and division methods all with parameters and use string
 * concatenation methods.(Note: Two static and Two instance methods.)
 */

public class Programme5_Calculator {
    int a = 10;
    int b = 20;

    // addition
    public static void addition(int a, int b) {
        int add1 = a + b;
        System.out.println("The addition of two number is:" + add1);
    }

    //subtraction
    public static void subtraction(int a, int b) {
        int sub1 = a - b;
        System.out.println("The subtraction of two number is:" + sub1);
    }

    //multiplication
    public void multiplication(int a, int b) {
        int mul1 = a * b;
        System.out.println("The multiplication of two number is:" + mul1);
    }

    //division
    public void division(int a, int b) {
        int div1 = a / b;
        System.out.println("The division of two number is:" + div1);
    }

    public static void main(String[] args) {
        //scanner method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your Second Number: ");
        int b = scanner.nextInt();

        // two instance and two static method
        addition(a, b);
        subtraction(a, b);
        Programme5_Calculator obj5 = new Programme5_Calculator();
        obj5.multiplication(a, b);
        obj5.division(a, b);


    }
}
