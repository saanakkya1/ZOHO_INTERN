import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
public class Split_words {
    public static void main(String args[]) {
        try {

            FileReader f = new FileReader("./test.txt");
            Scanner s = new Scanner(f);
            String str = "";
            while (s.hasNextLine()) {
                str += s.nextLine();
            }
            String[] splited = str.split("\\s+");

//            for(int i=0;i<1000;i++)
//            {
//                System.out.println(i+" "+splited[i]);
//                S +=splited[i];
//            }
//            Srting joined_array = "";
            ArrayList<String> joined_array = new ArrayList<String>();
            for(int j = 0;j<(splited.length/1000+1);j++){
                String Splitted_strings = "";
                for(int i=0;i<1000;i++)
                {
                    //System.out.println(i+" "+splited[i]);
                    Splitted_strings +=splited[i]+" ";
                }
                //System.out.println(splited.length);
                joined_array.add(Splitted_strings);
            }
//            System.out.println(joined_array);
            FileWriter op = new FileWriter("./output.txt");
            for(String q: joined_array){
                System.out.println(q+"\n\n\n\n\n\n\n\n\n\n\n");
                op.write(q+"\n\n\n\n\n\n\n\n\n\n\n");
            }
            f.close();
            op.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //catch (java.io.FileNotFoundException e1) {
          //  e1.printStackTrace();
        //}
        finally {
            System.out.println("RAN without ERRORS");
        }
    }

}
