import java.util.Calendar;
import java.util.Scanner;
public class solution {
    public static String weekDay(int m, int d, int y) {
        Calendar c = Calendar.getInstance();
        c.set(y,m-1,d);
        int w = c.get(Calendar.DAY_OF_WEEK);
        String[] day = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return day[w-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d=sc.nextInt(), y=sc.nextInt();
        System.out.println(weekDay(m,d,y));
    }
}
