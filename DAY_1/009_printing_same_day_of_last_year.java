import java.util.Calendar;
public class printing_same_day_of_last_year {
    public static void main(String[] args){
        Calendar now = Calendar.getInstance();
        int DAY = now.get(now.DAY_OF_MONTH);
        int MONTH = now.get(now.MONTH);
        int YEAR = now.get(now.YEAR);
        // now.get(now.DAY_OF_YEAR);
        int H = now.get(now.HOUR);
        int M = now.get(now.MINUTE);
        int S = now.get(now.SECOND);
        System.out.printf("LAST YEAR  SAME DAY : %02d %02d %02d %02d:%02d:%02d\n",DAY,MONTH+1,YEAR-1,H,M,S);
        System.out.printf("LAST MONTH SAME DAY : %02d %02d %02d %02d:%02d:%02d\n",DAY,MONTH,YEAR,H,M,S);
        System.out.printf("LAST Week  SAME DAY : %02d %02d %02d %02d:%02d:%02d\n",DAY,MONTH+1,YEAR,H,M,S);
        

        // now.add(now.YEAR, -1);
        // // now.DAY_OF_WEEK;
        // System.out.println(now.getTime());   
        // now.add(now.YEAR, 1);
        // now.add(now.MONTH,-1);
        // System.out.println(now.getTime());
        // now.add(now.MONTH,1);
        // now.add(now.DAY_OF_YEAR,-7);
        // System.out.println(now.getTime());
    }
    
}
