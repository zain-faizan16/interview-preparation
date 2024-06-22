package interfaces;

public class FooImplementation2 implements Foo{
    @Override
    public void firstHelloWorld() {
        System.out.println("implementing 2nd time");
    }
    @Override
    public void checkingDefaultFunctionality(){
        System.out.println("default method in FooImplementation Class");

    }
}
