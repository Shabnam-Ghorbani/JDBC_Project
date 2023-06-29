package ir.maktab.articleapp.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/maktab_hw5";
    private static final String USER = "postgres";
    private static final String PASS = "0023279397";

    private Connection connection;
    public  Connection getConnection() {

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
