package stringOperators;

/**
 * Created by inet-tech on 15/04/18.
 */
public class StringOperatorDemo {



    public static void main(String[] args) {
        String greeting = "Hello World!";
        String name = "John";


        int age = 10;
        char grade = 'A';

        int len = greeting.length();
        System.out.println(len);
        System.out.println(name.concat(greeting));
        System.out.println(name + greeting);

        String money = "£20";
        String newMoney = money.replaceFirst("£", "");
        System.out.println(newMoney);


        String nameUpper = name.toUpperCase();
        System.out.println(nameUpper);
    }
}
