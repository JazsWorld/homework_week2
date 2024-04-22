package homework_week2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programme8_Area_of_triangle {
    //static variable
    static double base, height, area;

    public static void areaoftriangle() {
        // the area of a triangle
        area = (base * height) / 2;
        System.out.println("The area of triangle is:" + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        base = scanner.nextDouble();
        System.out.println("Enter the height of triangle: ");
        height = scanner.nextDouble();
        areaoftriangle();
    }
}
