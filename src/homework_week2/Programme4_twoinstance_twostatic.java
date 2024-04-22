package homework_week2;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme4_twoinstance_twostatic {
    //4.1 Declare two instance and two static variables.

    static int d1 = 21;
    static String d2 = "This is an one instance and one static variable program4 is executed successfully";

    int d3 = 22;
    String d4 = "This is an one instance and one static variable program4 is executed successfully";

    //4.5 Declare the Main method.
    public static void main(String[] args) {
        //4.6 Call both instance and static methods into the Main method and run the programme

        d5();
        Programme4_twoinstance_twostatic obj4 = new Programme4_twoinstance_twostatic();
        obj4.d6();
    }
    //4.3 Declare one static method.

    public static void d5() {
        // 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.              System.out.println(d1);
        System.out.println(d1);
        System.out.println(d2);
    }

    //4.2 Declare one instance method.

    public void d6() {
        // 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
        System.out.println(d3);
        System.out.println(d4);
    }
}
