package homework_week2;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */

public class Programme2_staticvariables {
    //2.1 Declare two static variables
    static String b1 = "This is an staticvariable program2 is executed successfully ";
    static int b2 = 500;

    //2.4 Declare the Main method.
    public static void main(String[] args) {
        //2.5 Call the static method into the Main method and Run the programme
        b3();
    }

    //2.2 Declare one static method
    public static void b3() {
        //2.3 Call both static variables into the static method inside the print statement.
        System.out.println(b1);
        System.out.println(b2);
    }
}
