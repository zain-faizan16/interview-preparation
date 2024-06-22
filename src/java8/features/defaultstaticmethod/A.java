package java8.features.defaultstaticmethod;

public interface A {
    default void hello(){
        System.out.println("A class hello");
    }
    static void helloStatic(){
        System.out.println("static method hello");
    }
}
