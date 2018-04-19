package controlFlowStatements;

/**
 * Created by inet-tech on 16/04/18.
 */
public class SwitchDemo {

    public static void main(String[] args) {
        int passMark = 40;
        String grade;

        switch (passMark){
            case 10: grade = "A";
                break;
            case 20: grade = "B";
                break;
            case 30: grade = "C";
                break;
            case 40: grade = "D";
                    break;
            default: grade = "Fail";
                break;
        }
        System.out.println(grade);
    }
}
