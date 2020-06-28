package Test001;

/**
 * 校验qq号
 */
public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("1084444848"));
    }
    public static boolean checkQQ(String QQ){
        return QQ!=null && QQ.matches("\\d{4,10}");//大于等于4位，小于10位，全为数字
    }
}
