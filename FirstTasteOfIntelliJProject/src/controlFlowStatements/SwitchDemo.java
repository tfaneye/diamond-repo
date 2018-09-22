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

        System.out.println("==================================================================");

        int month = 7;
        String particularMonth;

        switch (month) {
            case 1:
                particularMonth = "January";
                break;
            case 2:
                particularMonth = "February";
                break;
            case 3:
                particularMonth = "March";
                break;
            case 4:
                particularMonth = "April";
                break;
            case 5:
                particularMonth = "May";
                break;
            case 6:
                particularMonth = "June";
                break;
            case 7:
                particularMonth = "July";
                break;
            case 8:
                particularMonth = "August";
                break;
            case 9:
                particularMonth = "September";
                break;
            case 10:
                particularMonth = "October";
                break;
            case 11:
                particularMonth = "Nov";
                break;
            case 12:
                particularMonth = "Dec";
                break;
            default:
                particularMonth = "Invalid Month";
                break;
        }
        System.out.println(particularMonth);
    }
}
