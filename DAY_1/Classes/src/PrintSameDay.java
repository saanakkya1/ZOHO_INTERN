import java.util.Calendar;
//import java.time.LocalDate;

public class PrintSameDay {
    public static void printCalendar(Calendar c, String str) {
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.printf("%s %02d-%02d-%04d %02d:%02d:%02d",str,day,month+1,year,hour,minute,second);
        System.out.println("\n");
    }

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        PrintSameDay.printCalendar(cal, "Today");
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        cal.set(year-1,month,day);
        PrintSameDay.printCalendar(cal, "Same Day Last Year");

        cal.set(year,month-1,day);
        PrintSameDay.printCalendar(cal, "Same Day Last Month");

        cal.set(year,month,day-7);
        PrintSameDay.printCalendar(cal, "Same Day Last Week");
    }
}