package modifierDemo;

import newCar.MyNewCar;

public class Honda {

    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar();
        double chasis = jaguar.chasisNumber;
        String mod = jaguar.model;
        jaguar.describeYourCar();
        System.out.println("my car details are: " +chasis+ " " +mod);

        jaguar.driveJaguar();
        //System.out.println();

        int tyres = jaguar.numOfTyres;
        System.out.println(tyres);


        MyNewCar newCar = new MyNewCar();
        int tyr = newCar.numOfTyres;

        DataTypeDemo dataTypeDemo = new DataTypeDemo();
        dataTypeDemo.showNumbers();
        dataTypeDemo.displayPlateNumber();
    }
}
