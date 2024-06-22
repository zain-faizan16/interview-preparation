package java8.features.defaultfunctionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierImplementation {
    public static void main(String[] args) {
        Supplier<Integer> function = () -> 100;
        Consumer<Integer> function1 = x -> System.out.println(x);
        Function<Integer,Integer> function2 = x-> x+100;
        Predicate<Integer> function3 = x -> x == 100;
        System.out.println(function.get());
        if(function3.test(function.get()));
        function1.accept( function2.apply(function.get()));
    }

}
