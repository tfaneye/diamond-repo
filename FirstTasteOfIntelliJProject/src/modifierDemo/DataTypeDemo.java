package modifierDemo;

public class DataTypeDemo {

    private int id = 2;
    private double amount = 100.28;
    char grade = 'A';
    public boolean isCarGreen = false;

    private String plateNumber = "AB 32 DR";

    String phone = "078956421535";

    public int showNumbers(){
        //return type == data type
        System.out.println("the product of my id and amount is " + id*amount);
        return 0;
    }
    
    public String displayPlateNumber() {
    	if(plateNumber.equals("AB 32 DFR")) {
    		System.out.println(plateNumber);
    	}else {
    		System.out.println("It is not my car");
    	}
    	
    	return null;
    }
}
