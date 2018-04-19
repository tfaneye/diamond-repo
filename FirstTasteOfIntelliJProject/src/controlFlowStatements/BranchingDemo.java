package controlFlowStatements;

public class BranchingDemo {

    public static void main(String[] args) {
        int x = 3;
        int y = 0;

        try {
            int z = x/y;
            System.out.println(z);
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
