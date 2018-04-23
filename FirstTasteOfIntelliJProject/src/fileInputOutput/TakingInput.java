package fileInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * InputStreamReader
 * BufferedReader
 * Scanner
 */

public class TakingInput {

    public void takeInput(){

       // System.out.println("Type your name");

        /*InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        try {
            String myRead = bufferedReader.readLine();
            System.out.println(myRead);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*System.out.println("===================================================");

        System.out.println("What is your favourite meal?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if(name.equals("Rice")){
            System.out.println("You are an African");
        }else if(name.equals("Sandwich")){
            System.out.println("Your British");
        }*/

        System.out.println("==========================================================");

        System.out.println("your first number");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("your second number");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        int res = num1 * num2;
        System.out.println(res);
    }

}
