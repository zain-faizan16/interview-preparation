package interfaces;

public class MainInterface {
    public static void main(String[] args) {
        Foo foo = new FooImplementation2();
        foo.checkingDefaultFunctionality();
    }
}
