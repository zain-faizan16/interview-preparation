package coding.problems;

public class ExhangeStringValue {
// exchange string values without making 3rd variable

    public static void main(String[] args) {
        String a = "zain";
        String b = "arslan";
        a = a+ b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("value of a : " + a + "\nvalue of b :" + b);

    }
}
