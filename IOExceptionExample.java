import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("nonexistent_file.txt");
            

            BufferedReader reader = new BufferedReader(file);
            

            System.out.println(reader.readLine());
        } catch (IOException e) {

            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

