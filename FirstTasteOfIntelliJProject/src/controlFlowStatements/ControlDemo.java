package controlFlowStatements;

/**
 * Created by inet-tech on 16/04/18.
 */

/**
 *  1) Decision-making Statements { if, if-else, switch}
 *  2) Looping Statements { while, do-while, for}
 *  3) Branching Satements { break, continue, return }
 */
public class ControlDemo {

    public static void main(String[] args) {
        int passMark = 70;
        String grade;
        String subject = "Art";
        //String subject2 = "Art";
        if(passMark >= 90){
            if(subject.equals("Art")){
                grade = "A";
            }else {
                grade = "A*";
            }

        }else if(passMark >= 80){
            if(subject.equals("Science")){
                grade = "B";
            }else{
                grade = "B*";
            }

            System.out.println("Grade = " + grade);
        }else if(passMark >= 70){
            if(subject.equals("Science")){
                grade = "C";
            }else{
                grade = "C*";
            }
            System.out.println("Grade = " + grade);
        }else if (passMark >= 60){
            if(subject.equals("Science")){
                grade = "D";
            }else{
                grade = "D*";
            }
            System.out.println("Grade = " + grade);
        }else{
            System.out.println("Yuo failed, yur grade is F");
        }
    }
}
