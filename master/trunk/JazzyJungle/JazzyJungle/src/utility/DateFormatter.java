package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: James.Owen
 * Date: 18/11/13
 * Time: 18:24
 * To change this template use File | Settings | File Templates.
 */
public class DateFormatter {

    static SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEE");
    static SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
    static SimpleDateFormat dayFormat = new SimpleDateFormat("d");
    static SimpleDateFormat shortTimeFormat = new SimpleDateFormat("hh:mm");

    public static String getShortDateFromUnixTime(int time){
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy '@' hh:mm");
        return dt.format(new Date(time*1000L));
    }

    public static String getLongDateFromUnixTime(int time){
//Wednesday 5th January
        int numericDay = Integer.parseInt(dayFormat.format(new Date(time*1000L)));

        String dayOfWeek = dayOfWeekFormat.format(new Date(time*1000L));
        String day = String.valueOf(numericDay) + getDayOfMonthSuffix(numericDay);
        String month = monthFormat.format(new Date(time*1000L));
        String shortTime = shortTimeFormat.format(new Date(time*1000L));

        return dayOfWeek + "  " + month + " " + day + " @ " + shortTime;
    }

    private static String getDayOfMonthSuffix(final int day) {
        if((day >= 1 && day <= 31)){
               if (day >= 11 && day <= 13) {
                return "th";
                }
                switch (day % 10){
                    case 1:  return "st";
                    case 2:  return "nd";
                    case 3:  return "rd";
                    default: return "th";
                }
        }
        else {
            return "illegal day of month: " + day;
        }
    }
}
