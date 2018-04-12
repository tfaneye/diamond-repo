package dataTypeConversionDemo;

public class DTConversion {

    /**
     * String, int, long, float, double, boolean
     *
     */

    public void convertDataType(){

        String age = "50";
        int num = 35;
        long tel = 232425L;
        boolean colour = false;

        //convert age to Integer
        int realAge = Integer.parseInt(age);

        System.out.println(realAge - 5);

        //convert string to long
        long longAge = Long.parseLong(age);
        System.out.println(longAge);

        //convert string to double
        Double.parseDouble(age);

        //convert string to float
        Float.parseFloat(age);

        //convert string to boolean
        boolean boolAge = Boolean.parseBoolean(age);

        System.out.println(!boolAge);

        //from int to string
        String strNum = Integer.toString(num);

        System.out.println(strNum);

        //from long to string
        String strTel = Long.toString(tel);
        System.out.println(strTel);

        //from boolean to string
        String boolColour = Boolean.toString(colour);
        System.out.println(boolColour);

    }
}
