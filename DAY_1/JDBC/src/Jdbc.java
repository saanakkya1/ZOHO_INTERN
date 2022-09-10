import com.mysql.jdbc.*;
import java.sql.*;
import java.sql.Driver;

public class Jdbc {

    static final String DB_URL = "jdbc:mysql://localhost/TEST";
    static final String USER = "kouth";
    static final String PASS = "kouth1234";
    static final String QUERY = "SELECT * FROM Employees WHERE Age > 20 and Age<30;";
    public static void main(String args[]) throws SQLException{
        try{
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            while (rs.next()){
                System.out.println("======================    MYSQL    ====================");
                System.out.println("|EMP_ID      |\t"+rs.getInt("Emp_id"));
                System.out.println("|Age         |\t"+rs.getInt("Age"));
                System.out.println("|First_Name  |\t"+rs.getString("first_name"));
                System.out.println("|Last_Name   |\t"+rs.getString("last_name")+"");
                System.out.println("=======================================================\n");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            con.close();
        }

    }
}
