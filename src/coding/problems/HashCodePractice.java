package coding.problems;

import java.util.HashMap;
import java.util.Map;

public class HashCodePractice {
    public static void main(String[] args) {
        Map<Integer,String> hashPractice = new HashMap<>();
        hashPractice.put(7,"Ali");
        hashPractice.put(8,"Zain");
        hashPractice.put(9,"Arslan");
        System.out.println(hashPractice.get(7));
    }

}
