package week4package.ClassActivity2A;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

//        try {
//            Reader rd = new FileReader(desktopPath + "/output.csv");
//
//            int readContent = rd.read();
//
//            while (readContent != -1) {
//                System.out.println((char) readContent);
//                readContent = rd.read();
//            }
//            rd.close();
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//        Assignment: What other format can you use to read file apart from while loop.
//        Find a way to make it display horizontally normally.
        try {
            FileReader rdh = new FileReader(desktopPath + "/output.csv");

            int readContent = rdh.read();

            while (readContent != -1) {
                System.out.print((char) readContent);
                readContent = rdh.read();
            }
            rdh.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
