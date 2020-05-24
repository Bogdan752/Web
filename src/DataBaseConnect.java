import java.io.InputStream;
import java.sql.*;

public class DataBaseConnect {

    public static Connect getConnect() {
        Connection connect = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/servlet";
            String loginDB = "postgres";
            String passDB = "pass";
            connect = DriverManager.getConnection(url, loginDB, passDB);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return connect;
    }

    public static void createUser(String login, String pass) throws SQLException {
        Connection connect = getConnection();
        PreparedStatement statement = connect.prepareStatement("INSERT INTO users VALUES (?, ?)");
        statement.setString(1, login);
        statement.setString(2, pass);
        statement.executeUpdate();
        connect.close();
    }
}