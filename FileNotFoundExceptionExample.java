import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("missing.txt");
        } catch (FileNotFoundException e) {

            System.out.println("FileNotFoundException: File not found!");
        }
    }
}

