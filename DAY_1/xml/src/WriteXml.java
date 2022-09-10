import org.jdom2.CDATA;
import org.jdom2.Comment;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileWriter;

public class WriteXml {

    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("./staffs.xml");
        writeXml(System.out,f);
//        writeXml(f);
    }

    private static void writeXml(OutputStream output,FileWriter f) throws IOException {

        Document doc = new Document();
        doc.setRootElement(new Element("company"));

        Element staff = new Element("staff");
        // add xml attribute
        staff.setAttribute("id", "1001");

        staff.addContent(new Element("name").setText("mkyong"));
        staff.addContent(new Element("role").setText("support"));
        staff.addContent(new Element("salary")
                .setAttribute("curreny", "USD").setText("5000"));

        // add xml comments
        staff.addContent(new Comment("for special characters like < &, need CDATA"));

        // add xml CDATA
        staff.addContent(new Element("bio")
                .setContent(new CDATA("HTML tag <code>testing</code>")));

        // append child to root
        doc.getRootElement().addContent(staff);

        Element staff2 = new Element("staff");
        staff2.setAttribute("id", "1002");
        staff2.addContent(new Element("name").setText("yflow"));
        staff2.addContent(new Element("role").setText("admin"));
        staff2.addContent(new Element("salary").setAttribute("curreny", "EUD").setText("8000"));
        // add xml CDATA
        staff2.addContent(new Element("bio").setContent(new CDATA("a & b")));

        // append child to root
        doc.getRootElement().addContent(staff2);

        XMLOutputter xmlOutputter = new XMLOutputter();

        // pretty print
        xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output(doc, output);
        xmlOutputter.output(doc, f);
    }
}