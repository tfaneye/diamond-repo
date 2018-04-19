package javaOperatorsDemo;

/**
 * Created by inet-tech on 15/04/18.
 */
public class RelationalDemo {

    /**
     * 2) Relational Operators { ==, !=, >, <, >= <= }
     *
     */
    private static String name = "Darren";
    private static String lastname = "Darren";

    public static void main(String[] args) {
        int value1 = 2;
        int value2 = 5;
        if(value1 == value2){
            System.out.println("yes they are equal");
        }else{
            System.out.println("The numbers are not equal");
            int result = value1*value2;
            System.out.println(result);
        }

        if (name.equals(lastname)){
            System.out.println("good they are the same person");
        }

        if (value1 != value2){
            value1 += 1;
            System.out.println(value1);  //expecting 5
            if(value1 == value2){
                int res = value1*value2;
                System.out.println(res);
            }
        }

        if(value1 < value2){
            value2 -= 3;

            if (value1 > value2){
                System.out.println(value1++);
            }else {
                System.out.println(value2--);
            }
        }else{
            value1 -= 2;
            System.out.println(value1);
        }

    }
}
