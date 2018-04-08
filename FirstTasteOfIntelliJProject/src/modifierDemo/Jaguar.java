package modifierDemo;

public class Jaguar {

    public String model = "X-Type";
    double chasisNumber = 3241653;
    public String speed = "60m/h";
    private String plateNumber = "AB 65 CDE";
    protected int numOfTyres = 4;

    void describeYourCar() {

    }

    public int driveJaguar() {
        System.out.println("my model is " + model + "my speed in one sec is " + speed);
        System.out.println(numOfTyres);
        return numOfTyres;
    }
}
