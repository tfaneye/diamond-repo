package fileInputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * .txt
 * .properties
 * File
 * FileInputStream
 * FileOutputStream
 * FileWriter
 */

public class CreateAndWriteFile {

    private File file;

    public void createFile(){

        file = new File("C:\\Users\\Tunde\\JavaCourseCodes\\diamond-repo\\FirstTasteOfIntelliJProject\\test.txt");
        /*try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public void writeIntoFile(){
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This is Java Web Automation Training");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
