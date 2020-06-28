package Test001;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);//0.30000000000000004

        BigDecimal biga = BigDecimal.valueOf(a);
        BigDecimal bigb = BigDecimal.valueOf(b);
        BigDecimal bigc = biga.add(bigb);
        System.out.println(bigc);//0.3

        double rs = bigc.doubleValue();


        String str = "1234";
        int i = Integer.parseInt(str);
        double v = Double.parseDouble(str);

        int integer = Integer.valueOf(str);
        double aDouble = Double.valueOf(str);

    }
}
