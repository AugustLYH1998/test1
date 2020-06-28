package Test001;


public class RegexDemo2 {
    public static void main(String[] args) {
        //public boolean matches(regex)判断是否与正则表达式匹配，匹配返回true
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false

        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true

        System.out.println("2213123".matches("\\d*"));//true
        System.out.println("1".matches("[0-9]"));//true
    }
}
