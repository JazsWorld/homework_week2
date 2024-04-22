package homework_week2;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme3_oneinstance_onestatic {

    //3.1 Declare one instance and one static variable.

    static String c1 = "This is an one instance and one static variable program3 is executed successfully ";
    int c2 = 500;

    //3.5 Declare the Main method.
    public static void main(String[] args) {

        //3.6 Call both instance and static methods into the Main method and run the programme.

        Programme3_oneinstance_onestatic obj3 = new Programme3_oneinstance_onestatic();
        c4();
        obj3.c3();

    }

    //3.3 Declare one static method.
    public static void c4() {
        //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
        System.out.println(c1);

    }

    //3.2 Declare one instance method.
    public void c3() {
        //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
        System.out.println(c2);
        System.out.println(c1);
    }
}
