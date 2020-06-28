package Test001;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 问701天 15小时后是什么日子
 *
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR,701);//加天数
        cal.add(Calendar.HOUR_OF_DAY,15);
        long timeInMillis = cal.getTimeInMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(timeInMillis);
        System.out.println(format);//2022-05-30 10:01:15
    }
}
