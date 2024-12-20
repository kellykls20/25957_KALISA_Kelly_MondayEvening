public class NumberFormatExceptionExample {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException: Invalid number format.");
        }
    }
}
