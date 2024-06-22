package interfaces;

public interface Foo{
    void firstHelloWorld();
    default void checkingDefaultFunctionality(){
        System.out.println("default method in interface");
    }
}
