package nonAccessModifierDemo;

public class BeveragesRunner {

    public static void main(String[] args) {
        Beverages beverages = new Beverages("1 Nestle St");
        System.out.println(beverages.getCompanyName());

      // Beverages.name = "Millo";
   //     String newBevName = "Millo";

     //   System.out.println(newBevName);

        int newNumber = beverages.getRegNumber();
        System.out.println(newNumber);

        String compAddress = beverages.getAddress();
        System.out.println(compAddress);

        String newName = beverages.name;
        newName = "Vita";
        System.out.println(newName);

    }
}
