import net.spy.memcached.MemcachedClient;
import java.net.InetSocketAddress;
import java.io.IOException;
public class memcached {
    public static void main(String[] args) {
    try {
        // Connecting to Memcached server on localhost
        MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
        System.out.println("Connection to server sucessfully");

        //not set data into memcached server
        System.out.println("set status:" + mcc.set("tutorialspoint", 900, "memcached"));

        //Get value from cache
        System.out.println("Get from Cache:" + mcc.get("tutorialspoint"));
    }
    catch(IOException e){
       e.printStackTrace();
        }
    }
}