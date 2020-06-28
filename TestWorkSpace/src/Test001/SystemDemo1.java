package Test001;

import java.text.SimpleDateFormat;

public class SystemDemo1 {
    public static void main(String[] args) {
        //终止当前虚拟机
//        System.exit(0);

        long time = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(time);
        System.out.println(format);//2020-06-27 19:13:16
    }
}
