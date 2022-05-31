import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import src.XMLOBJ;
public class ReadXmltoColl {

    private static final String FILENAME = "src/staff.xml";

    public static void main(String[] args) {

        try {

            SAXBuilder sax = new SAXBuilder();
            // XML is a local file
            Document doc = sax.build(new File(FILENAME));

            Element rootNode = doc.getRootElement();
            //System.out.println(rootNode.getName());
            List<Element> list = rootNode.getChildren("staff");
            int N = list.size();
            ArrayList<XMLOBJ> arr = new ArrayList<XMLOBJ>();
            for (Element target : list) {

                String id = target.getAttributeValue("id");
                String name = target.getChildText("name");
                String role = target.getChildText("role");
                String salary = target.getChildText("salary");
                String currency = "";
                if (salary != null && salary.length() > 1) {
                    // access attribute
                    currency = target.getChild("salary").getAttributeValue("currency");
                }
                String bio = target.getChildText("bio");
                arr.add(new XMLOBJ(id,name,role,salary,currency,bio));
                }
            System.out.println(arr);


        } catch (IOException | JDOMException e) {
            e.printStackTrace();
        }

    }
}
