package fileInputOutput;

import java.io.*;
import java.util.Properties;

/**
 * .txt
 * .properties
 * File
 * FileInputStream
 * FileOutputStream
 * FileWriter
 * Properties
 */

public class CreateAndWriteFile {

    private File file;


    public void createFile(){

        String systemPath = System.getProperty("user.dir");
        //String fileName = systemPath + "/test_data/test.txt";
        String fileName = systemPath + "/src/resources/env-data.properties";

        //file = new File("C:\\Users\\Tunde\\JavaCourseCodes\\diamond-repo\\FirstTasteOfIntelliJProject\\test.txt");

        file = new File(fileName);
        /*try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public void writeIntoFile(){
        /*try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This is Monday 23/04/2018,\nthis is good," +
                    "\nthis is ausome,\nBatch 2018.");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public void readFile(){
        try {
            FileInputStream fis = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fis);
            System.out.println(prop);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
