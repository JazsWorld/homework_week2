package homework_week2;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme6_radiusofcircle {
    //static variable
    static int radius;

    //static method
    public static void circle() {
        //Formula of Area of cicle
        double area = (radius * radius) * Math.PI;
        System.out.println("The Area of the circle is: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        radius = scanner.nextInt();
        circle();

    }
}
