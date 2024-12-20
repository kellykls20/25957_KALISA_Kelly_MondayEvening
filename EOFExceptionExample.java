import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {

        try {

            byte[] data = "test".getBytes();
            DataInputStream input = new DataInputStream(new ByteArrayInputStream(data));
            

            while (true) {
                input.readChar();
            }
        } catch (EOFException e) {

            System.out.println("EOFException: Reached end of file unexpectedly.");
        } catch (IOException e) {

            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

