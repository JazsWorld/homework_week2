package homework_week2;

/**
 * Write a Java Program to print as below.
 * "+------------------------+"
 * "|                        |"
 * "| CORNER STORE           |"
 * "|                        |"
 * "| 2015-03-29 04:38PM     |"
 * "|                        |"
 * "| Gallons: 10.870        |"
 * "| Price/gallon: $ 2.089  |"
 * "|                        |"
 * "| Fuel total: $ 22.71    |"
 * "|                        |"
 * "+------------------------+"
 */
public class Programme20_toprint_design {
    public static void main(String[] args) {
        Programme20_toprint_design obj20 = new Programme20_toprint_design();
        obj20.design();
    }

    public void design() {
        System.out.println("+-------------------------------+");
        System.out.println("|                               |");
        System.out.println("|        corner store           |");
        System.out.println("|                               |");
        System.out.println("|    2015-03-29     04:38PM     |");
        System.out.println("|                               |");
        System.out.println("| Gallons:              10.870  |");
        System.out.println("| Price/gallon:        $  2.089 |");
        System.out.println("|                               |");
        System.out.println("| Fuel total:        $ 22.71    |");
        System.out.println("|                               |");
        System.out.println("+-------------------------------+");


    }
}
