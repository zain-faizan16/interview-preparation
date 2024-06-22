package java8.features.defaultfunctionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionImplementation {
    public static void main(String[] args) {
        Function<String,Integer> function1 = x -> x.length();
        System.out.println(function1.apply("Ahmed"));
        Function<Integer,Integer> function2 = x -> x * 2;
        Function<Integer,Integer> function3 = x -> x * x * x ;
        System.out.println(function2.andThen(function3).apply(3));
        System.out.println(function3.andThen(function2).apply(3));
        //compose simply negate the implementation
        System.out.println(function2.compose(function3).apply(3));
        BiFunction<String,Integer,Character> function4 = (x,y) -> x.charAt(y);
        System.out.println(function4.apply("Zain",2));
    }




}
