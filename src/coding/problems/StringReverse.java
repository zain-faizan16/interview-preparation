package coding.problems;

public class StringReverse {
    public static void main(String[] args) {
        String a  = "abcdefghijklmnopqrstxwyz";

        StringBuffer string =  new StringBuffer(a);
        for (int i = 0;  i < a.length(); i++) {
            int  n = a.length()-i-1;
            string.setCharAt(i,a.charAt(n));

        }
        System.out.println(string);
    }
/*    public static void main(String[] args) {
        String a  = "abcdefghijklmnopqrstxwyz";

        StringBuffer string =  new StringBuffer();
        for (int i = a.length()-1;  i >=0 ; i--) {
            string.append(a.charAt(i));

        }
        System.out.println(string);
    }*/

/*    public static void main(String[] args) {
        String a  = "abcdefghijklmnopqrstxwyz";

        String string =  "";
        for (int i = a.length()-1;  i >=0 ; i--) {

            string = string.concat(String.valueOf(a.charAt(i)));
        }
        System.out.println(string);
    }*/


}
