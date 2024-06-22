package java8.features.lambdaexpression;

import java.util.*;

public class ComparableFunctionalImplementation {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(7);
        l.add(8);
        l.add(5);
        Collections.sort(l,(a,b) -> b - a);
        System.out.println("list sorting desc" + l);
        Set<Integer> s = new TreeSet<>((a,b) -> b - a);
        s.add(7);
        s.add(8);
        s.add(5);
        System.out.println("tree set desc" + s);
        Map<Integer,String> tm = new TreeMap<>((a,b) -> b - a);
        tm.put(1,"zain");
        tm.put(5,"Abdullah");
        tm.put(3,"ali hamza");

        System.out.println("treemap sorting "+ tm);





    }
}
