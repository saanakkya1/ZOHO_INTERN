import java.util.Scanner;

public class StringOps{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = inp.nextLine();
    System.out.println(str);
    System.out.println("CharAt METHOD\t"+str.charAt(0));
    System.out.println("CONCAT METHOD");
    System.out.println(str.concat(str));
    System.out.println("SUBSTRING METHOD");
    System.out.println(str.substring(0, 5));
    System.out.println("IndexOf METHOD");
    System.out.println(str.indexOf('K'));
    System.out.println("LastIndexOf METHOD");
    System.out.println(str.lastIndexOf('K'));


  }
}
