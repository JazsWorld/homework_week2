package homework_week2;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme
 */

public class Programme1_instancevariables {
    // 1.1 Declare two instance variables.

    String a1 = "This is an instancevariable program1 is executed successfully ";
    int a2 = 500;

    // 1.4 Declare the Main method.

    public static void main(String[] args) {
        //1.5 Call the above instance method into the Main method and Run the programme

        Programme1_instancevariables obj1 = new Programme1_instancevariables();
        obj1.a3();
    }

    //1.2 Declare one instance method.

    public void a3() {

        // 1.3 Call both instance variables into the instance method inside the print statement.

        System.out.println(a1);
        System.out.println(a2);
    }
}
