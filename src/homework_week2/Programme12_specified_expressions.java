package homework_week2;

/**
 * Write a Java program to compute the specified expressions and print the output.
 * Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */

public class Programme12_specified_expressions {
    static double l1, l2, l3, l4;

    public static void main(String[] args) {
        expression();
    }

    public static void expression() {
        l1 = 25.5;
        l2 = 3.5;
        l3 = 40.5;
        l4 = 4.5;
        System.out.println((l1 * l2 - l2 * l2) / (l3 - l4));
    }
}
