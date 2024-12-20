public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {

        try {
            Thread thread = new Thread();
            thread.setPriority(20);
        } catch (IllegalArgumentException e) {

            System.out.println("IllegalArgumentException: Invalid argument passed.");
        }
    }
}
