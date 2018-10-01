import java.util.Calendar;
import java.util.Scanner;

public class DateClass {
	public static String dayOfWeek[] = {"", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		System.out.println(getDay(day, month, year));
	}
	
	public static String getDay(String day, String month, String year) {
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month) - 1;
		int d = Integer.parseInt(day)-1;
		Calendar c = Calendar.getInstance();
		c.set(y, m, d);
		int i = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek[i];
	}
}



