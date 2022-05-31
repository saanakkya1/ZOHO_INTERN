import org.jetbrains.annotations.NotNull;
import java.sql.*;
public class DB {

    static final String     DB_NAME     = System.getenv("DB_NAME");
    static final String     DB_HOST     = System.getenv("DB_HOST");
    static final String     UNAME       = System.getenv("UNAME");
    static final String     PASS        = System.getenv("PASS");
    static String DB_URL = "jdbc:mysql://"+DB_HOST+"/"+DB_NAME;

    public static Boolean ConnectDB() throws SQLException {
        Connection con = DriverManager.getConnection(DB_URL, UNAME, PASS)
        System.out.println("Connection established......");
        return true;
    }
    public boolean Add_user(@NotNull Connection con, int id, String firstname, String lastname) throws SQLException{
        try {
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO USERS(id,firstname,lastname) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.setString(2,firstname);
            stmt.setString(3,lastname);
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();return false;
        }
}
}
