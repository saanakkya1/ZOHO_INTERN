import java.util.Calendar; 
 
public class Print_Same_Day { 
public static 
  public static void printCal(Calendar c, String str) { 
    int day    = c.get(Calendar.DAY_OF_MONTH); 
    int month  = c.get(Calendar.MONTH); 
    int year   = c.get(Calendar.YEAR); 
    int hour   = c.get(Calendar.HOUR_OF_DAY); 
    int minute = c.get(Calendar.MINUTE); 
    int second = c.get(Calendar.SECOND); 
    System.out.printf("%s %02d/%02d/%04d %02d:%02d:%02d\n",str,day,month+1,year,hour,minute,second);  
  } 
     public static String getChoice() throws IOException{
        String namePattern = "^(?=.*[1-9])(?=\\S+$).+$";
        String Name = read.readLine();

        while(!Name.matches(namePattern)){
            System.out.println("Enter a valid name with alphabets only!");
            System.out.println("Enter Name: ");
            Name = read.readLine();
        }
        return Name;
    }
  public static void main(String[] args){ 
        
    } 
}
