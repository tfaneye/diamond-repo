package logicalOperators;

/**
 * Created by inet-tech on 15/04/18.
 */
public class LogicalOperators {
    /**
     * 3) Logical Oprators { &&, ||, ! }
     * && - ampersand is means logical AND
     */

    private static double amount = 5.0;
    private static double cash = 15.00;
    private static String bank = "Nation";

    public static void main(String[] args) {
        if ((amount == 5.0) && (cash == 10.0) && (bank == "Nation")) {
            System.out.println("amount = " +amount + " ; " + "cash = " + cash);
        }else {
            System.out.println("you do not have specified amount and cash");
        }

        if((amount == 5.0) || (cash == 15.0) && (bank == "Naon")){
            System.out.println("amount = " +amount + " ; " + "cash = " + cash);
        }else {
            System.out.println("you do not have specified amount and cash");
        }
    }
}
