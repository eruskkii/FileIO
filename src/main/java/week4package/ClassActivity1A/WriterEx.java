package week4package.ClassActivity1A;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Writer wr = new FileWriter(desktopPath + "/output.csv");

            String fileContent = "I am learning how to write to a csv file";

            wr.write(fileContent);

            wr.close();

            System.out.println("Successfully written into a csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
