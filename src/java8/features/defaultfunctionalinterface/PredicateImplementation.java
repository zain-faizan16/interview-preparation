package java8.features.defaultfunctionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateImplementation {
    public static void main(String[] args) {
        Predicate<Integer> p = x -> x > 100;
        System.out.println(p.test(200));
        Predicate<String> stringTest = x -> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> stringLastIndex = x-> x.charAt(3) == 'e';
        System.out.println(stringTest.test("Vipe"));
        Predicate<String > stringTestAnd = stringTest.and(stringLastIndex);
        System.out.println(stringTestAnd.test("vipe"));
        Predicate<String> stringTestNegate = stringTest.negate();
        System.out.println(stringTestNegate.test("Vakistan"));
        BiPredicate<Integer,Integer> function1 = (x,y) -> x > y;
        System.out.println(function1.test(150,100));
    }
}
