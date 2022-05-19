import java.util.Scanner;

public class StringOps{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = inp.nextLine();
    System.out.println(str);
    System.out.println("FINDING CHAR AT INDEX USING CharAt() METHOD\t"+str.charAt(0));
    System.out.println("CONCAT METHODS: ");
    System.out.println("Using str.concat() method \t"+str.concat(str));
    System.out.println("Using <str1> + <str2> method \t"+str+str);
    System.out.println("RETURNING SUBSTRING USING SUBSTRING() METHOD: ");
    System.out.println(str.substring(0, 5));
    System.out.println("FINDING INDEX USING IndexOf() METHOD");
    System.out.println(str.indexOf('K'));
    System.out.println("FINDING LAST OCCURANCE OF ELEMENT USING LastIndexOf() METHOD ");
    System.out.println(str.lastIndexOf('K'));


  }
}
