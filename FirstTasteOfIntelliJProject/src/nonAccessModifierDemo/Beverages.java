package nonAccessModifierDemo;

public class Beverages {

    /**
     * two things are important for constructor
     * 1) They are methods without a return type
     * 2) They have the same name as the class
     * What they do:
     * They give values to instance variables at run time
     */

    public String name = "Milo";
    private static String companyName = "Nestle Plc";
    private final String address;
    private int regNumber = 25;




    public Beverages(String address){
        this.address = address;
    }

    public String getCompanyName(){

        return companyName;
    }

    public int getRegNumber(){
        return regNumber;
    }

    public String getAddress(){
        return address;
    }
}
