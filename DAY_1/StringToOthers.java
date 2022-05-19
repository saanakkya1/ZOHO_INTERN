import java.util.Scanner;
public class StringToOthers {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = inp.nextLine();
        Boolean b = Boolean.valueOf(str);
        long l = Long.parseLong(str);
        int i = Integer.parseInt(str);
        System.out.println("Boolean:\t"+b);
        System.out.println("Long:\t"+l);
        System.out.println("Int:\t"+i);
        
        System.out.println("Convertion of Int to String");
        System.out.println(i);
        System.out.println("Convertion of Long to String");
        System.out.println(l);
    }
    
}
