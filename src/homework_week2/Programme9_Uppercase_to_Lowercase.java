package homework_week2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme9_Uppercase_to_Lowercase {
    static String lowercase;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Uppercase string: ");
        lowercase = scanner.nextLine();
        upperlowercase();

    }

    //STATIC METHOD
    public static void upperlowercase() {
        lowercase = lowercase.toLowerCase();
        System.out.println(lowercase);
    }
}
