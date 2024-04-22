package homework_week2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme7_Fahrenheit_to_Celsius {
    static float Fahrenheit, Celsius;

    public static void temperature() {
        //Fahrenheit and convert to degree Celsius
        Celsius = ((Fahrenheit - 32) * 5 / 9);
        System.out.println("Temperature value in celsius is:" + Celsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature value in Fahrenheit: ");
        Fahrenheit = scanner.nextFloat();
        temperature();
    }
}
