package java8.features.defaultfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerImplementation {
    public static void main(String[] args) {
        Consumer<Integer> function1 =  x -> System.out.println(x + 100);
        function1.accept(100);
        Consumer<List<Integer>> function2 = x -> {
            for (Integer a: x) {
                System.out.println(a+100);
            }
        };
        function2.accept(Arrays.asList(1,2,3,4,5));
        BiConsumer<Integer,Integer> function3 = (x,y) -> System.out.println("Biconsumer values added" + x+y);
        function3.accept(50,150);
    }


}
