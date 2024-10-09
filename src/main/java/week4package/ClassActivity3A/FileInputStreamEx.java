package week4package.ClassActivity3A;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileInputStream fReader = new FileInputStream(desktopPath + "/output1.csv");

            int data;

            while ((data = fReader.read()) != -1){
                System.out.println((char) data);
            }
            fReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
