import java.util.Calendar;
public class printing_same_day_of_last_year {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int year = Calendar.YEAR;
        int month = Calendar.MONTH;
        int day = Calendar.DAY_OF_MONTH;
        cal.set(year-2,month-1,day);
        printing_same_day_of_last_year.PrintCAL(cal,"Same Date Last Year");    
  
    }
    public static void PrintCAL(Calendar c,String s){
        
        int DAY = c.get(Calendar.DAY_OF_MONTH);
        int MONTH = c.get(Calendar.MONTH);
        int YEAR = c.get(Calendar.YEAR);
        int H = c.get(Calendar.HOUR_OF_DAY);
        int M = c.get(Calendar.MINUTE);
        int S = c.get(Calendar.SECOND);
        System.out.printf(s+" : %02d %02d %04d %02d:%02d:%02d\n",DAY,MONTH+1,YEAR,H,M,S);
    }

    
}
/*public class print_cal{
    public static void PrintCAL(Calendar c,String s){
        
        int DAY = c.get(Calendar.DAY_OF_MONTH);
        int MONTH = c.get(Calendar.MONTH);
        int YEAR = c.get(Calendar.YEAR);
        int H = c.get(Calendar.HOUR_OF_DAY);
        int M = c.get(Calendar.MINUTE);
        int S = c.get(Calendar.SECOND);
        System.out.printf(s+" : %02d %02d %04d %02d:%02d:%02d\n",DAY,MONTH+1,YEAR,H,M,S);
   //     System.out.printf("LAST MONTH SAME DAY : %02d %02d %02d %02d:%02d:%02d\n",DAY,MONTH,YEAR,H,M,S);
   //     System.out.printf("LAST Week  SAME DAY : %02d %02d %02d %02d:%02d:%02d\n",cal.DAY_OF_MONTH,cal.MONTH+1,YEAR,cal.HOUR,cal.MONTH,cal.SECOND);
    }
}*/