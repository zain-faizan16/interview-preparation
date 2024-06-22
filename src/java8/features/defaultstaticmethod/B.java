package java8.features.defaultstaticmethod;

public interface B {
    default void hello(){
        System.out.println("B class hello");
    }
}
