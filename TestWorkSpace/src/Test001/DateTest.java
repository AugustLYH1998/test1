package Test001;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        long date = 1000*60*60;//代表1小时
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}
