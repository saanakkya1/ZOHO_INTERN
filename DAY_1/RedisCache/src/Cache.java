import redis.clients.jedis.*;
import java.sql.*;
import java.sql.Connection;


public class Cache {
    static final String     DB_NAME     = System.getenv("DB_NAME");
    static final String     DB_HOST     = System.getenv("DB_HOST");
    static final String     UNAME       = System.getenv("UNAME");
    static final String     PASS        = System.getenv("PASS");
    static final String     REDIS_HOST  = System.getenv("REDIS_HOST");
    static final Integer    REDIS_PORT  = Integer.parseInt(System.getenv("REDIS_PORT"));

//    static String SQLResult(Connection con , String Query){
//
//    }


    public static void main(String args[]) throws SQLException {
        String DB_URL = "jdbc:mysql://"+DB_HOST+"/"+DB_NAME;
        Connection con = DriverManager.getConnection(DB_URL,UNAME,PASS);
        Jedis jedis = new Jedis(REDIS_HOST,REDIS_PORT);
        System.out.println("Connecting to Redis server successfully!");
        // Check whether server is running or not
        System.out.println("Redis Server is running: " + jedis.ping());







    }


}
