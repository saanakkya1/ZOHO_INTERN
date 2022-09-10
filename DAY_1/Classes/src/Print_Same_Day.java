import java.util.Calendar;

public class Print_Same_Day {
    public static void printCal(Calendar c, String str) {
        System.out.printf("%s %02d/%02d/%04d %02d:%02d:%02d\n",str, c.get(Calendar.DAY_OF_MONTH),
                                                                    c.get(Calendar.MONTH)+1,
                                                                    c.get(Calendar.YEAR),
                                                                    c.get(Calendar.HOUR_OF_DAY),
                                                                    c.get(Calendar.MINUTE),
                                                                    c.get(Calendar.SECOND));
    }

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        Print_Same_Day.printCal(cal, "Today"); //To print Todays Date
        cal.set(year-1,month,day);
        Print_Same_Day.printCal(cal, "Same Day Last Year");//To print Same Day Last Year Date
        cal.set(year,month-1,day);
        Print_Same_Day.printCal(cal, "Same Day Last Month");//To print Same Day Last Month Date
        cal.set(year,month,day-7);
        Print_Same_Day.printCal(cal, "Same Day Last Week");//To print Same Day Last Week Date
    }
}