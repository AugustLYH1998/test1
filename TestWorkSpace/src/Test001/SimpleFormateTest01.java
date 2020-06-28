package Test001;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 请问“2020-11-04 09:30:30”往后1天15小时，30分29s后的时间是多少
 */
public class SimpleFormateTest01 {
    public static void main(String[] args) throws ParseException {
        String s = "2020-11-04 09:30:30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(s);//得到了解析日期格式

        long time = parse.getTime() + (24L * 60 * 60 * 60 + 15 * 60 * 60 + 30 * 60 + 29) * 1000;
        String format = sdf.format(time);
        System.out.println(format);//2021-01-04 01:00:59
    }
}
