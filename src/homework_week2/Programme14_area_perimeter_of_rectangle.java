package homework_week2;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Programme14_area_perimeter_of_rectangle {
    //static variable
    static float width, height, perimeter, area1;


    public static void areaofrectangle() {
        // the area of a rectangle
        area1 = width * height;

        System.out.println("The area of rectangle is:" + area1);
    }

    public static void perimeterofrectangle() {
        // the area of a rectangle
        perimeter = 2 * (height + width);

        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of rectangle: ");
        height = scanner.nextFloat();
        System.out.println("Enter the width of rectangle: ");
        width = scanner.nextFloat();

        System.out.println("Enter the height of area of rectangle: ");
        height = scanner.nextFloat();
        System.out.println("Enter the width of area of rectangle: ");
        width = scanner.nextFloat();

        perimeterofrectangle();
        areaofrectangle();
    }
}
