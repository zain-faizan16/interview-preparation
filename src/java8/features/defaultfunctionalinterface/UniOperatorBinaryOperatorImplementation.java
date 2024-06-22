package java8.features.defaultfunctionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UniOperatorBinaryOperatorImplementation {
    public static void main(String[] args) {
        UnaryOperator<Integer> function1 = x-> x*3;
        System.out.println(function1.apply(5));
        BinaryOperator<Integer> function2= (x,y) -> x+y;
        System.out.println(function2.apply(15,30));
    }
}
