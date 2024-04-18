package pro.kosenkov.date;

import java.util.Calendar;
import java.util.Locale;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String month = calendar.getDisplayName(Calendar.MONTH,
                Calendar.LONG, new Locale("ru"));
        System.out.println(month);
    }
}
