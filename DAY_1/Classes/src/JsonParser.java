import org.json.simple.JSONObject;
import java.io.StringWriter;
import java.io.FileWriter;
import java.io.IOException;
class JsonEncodeDemo {

    public static void main(String[] args) {

        try{
            JSONObject obj = new JSONObject();

        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip",new Boolean(true));

        StringWriter out = new StringWriter();
        obj.writeJSONString(out);

        String jsonText = out.toString();
        FileWriter f = new FileWriter("/root/Desktop/JsonParser.json");
        f.write(jsonText);
        System.out.print(jsonText);
        f.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}