import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {

        try {

            Connection conn = DriverManager.getConnection("jdbc:invalid:url", "user", "pass");
        } catch (SQLException e) {
           
            System.out.println("SQLException: Unable to connect to database. " + e.getMessage());
        }
    }
}

