package fileInputOutput;

public class RunnerMain {

    public static void main(String[] args) {
        /*TakingInput takingInput = new TakingInput();
        takingInput
                .takeInput();*/

        CreateAndWriteFile createAndWriteFile = new CreateAndWriteFile();
        createAndWriteFile.createFile();
        //createAndWriteFile.writeIntoFile();
        createAndWriteFile.readFile();
    }
}
