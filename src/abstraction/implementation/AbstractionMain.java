package abstraction.implementation;

public class AbstractionMain {
    public static void main(String[] args) {
        AbstractClass abstractClass = new Extended2AbstractClass();
        AbstractClass2 abstractClass2 = new ExtendedAbstractClass3();
        abstractClass2.checkingAbstractMethod1();
        abstractClass.checkingAbstractMethod();
        abstractClass2.checkingAbstractMethod();
        System.out.println("value from abstract class"+abstractClass.value);

    }
}
