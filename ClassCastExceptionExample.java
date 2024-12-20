public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (ClassCastException e) {

            System.out.println("ClassCastException: Invalid type casting.");
        }
    }
}
