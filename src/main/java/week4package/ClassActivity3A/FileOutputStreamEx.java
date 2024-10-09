package week4package.ClassActivity3A;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileOutputStream out = new FileOutputStream(desktopPath + "/output1.csv", true);

            String wr = "I am learning how to write into a file using file output stream class";

            byte[] bytes = wr.getBytes();

            out.write(bytes);


            out.close();

            System.out.println("Successfully added a file with file output stream");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
