package newCar;

import modifierDemo.Jaguar;

public class MyNewCar {

    public int numOfTyres = 4;
    String colour = "blue";
    private static final double PI = 3.143;

    void showYourCar() {
        System.out.println("my car clour is " +colour);

    }

    public static void main(String []args) {

        /**
         * CREATING OBJECTS
         * the process of creating an object in java is called Instantiation
         * Syntax: ClassName objectName = new ClassName();
         */

        MyNewCar newCar = new MyNewCar();
        newCar.showYourCar();

//		System.out.println("This is Java Web Automation class1!!");
//		System.out.println("This is Java Web Automation class2!!");
//		System.out.println("This is Java Web Automation class3!!");
//		System.err.println("this is will give you a straight line output4!!");

        Jaguar jaguar = new Jaguar();
        jaguar.driveJaguar();
        //int tyres = jaguar.numOfTyres;

        System.out.println(jaguar.driveJaguar());

    }

}


class Vehicles{
    void main(String[] args) {
        String name = "My name"; //Name
    }

    void driveCar() {

    }
}
