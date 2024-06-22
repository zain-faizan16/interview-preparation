package java8.features.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MethodReferenceImplementation {
    void print(String s){
        System.out.println("Muhammad "+s);
    }
    public static void main(String[] args) {
        MethodReferenceImplementation methodReferenceImplementation = new MethodReferenceImplementation();
        List<String> a = Arrays.asList("zain","Abdullah","ahmed");
        a.forEach (x-> System.out.println("Muhammad " +x));
        a.forEach(methodReferenceImplementation::print);
        a.forEach( System.out::println);
        System.out.println(a.stream().map(Student::new).collect(Collectors.toList()));

    }


}
