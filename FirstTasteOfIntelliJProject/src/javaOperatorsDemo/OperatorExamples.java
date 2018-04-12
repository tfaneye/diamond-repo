package javaOperatorsDemo;

public class OperatorExamples {

    /**
     * 1) Arithmethic Operators { +, -, *, %, ++, -- }
     * 2) Relational Operators { ==, !=, >, <, >= <= }
     * 3) Logical Oprators { &&, ||, ! }
     * 4) Assignment Operator { = , +=, -= }
     */
    private double x = 2;
    public double y = 3;


    public void performArithmeticOperations(){

        int num1 = 2;
        int num2 = 3;
        int res = num1 + num2;
        res++;
        System.out.println(res + 1);
        System.out.println(res++);

        double z = x + y;
        z--;
        System.out.println(z);
        System.out.println(z--);
        System.out.println(z--);
        double d = y%x;
        System.out.println(d);

        String firstName = "John";
        String lastName = "Peter";
        System.out.println(firstName + " " + lastName);


    }

    public static void main(String[] args) {
        OperatorExamples oe = new OperatorExamples();
        oe.performArithmeticOperations();
    }
}
