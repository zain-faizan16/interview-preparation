package java8.features.defaultstaticmethod;

public class MainDefaultClass implements A,B{
    public static void main(String[] args) {
        MainDefaultClass mainDefaultClass = new MainDefaultClass();
        mainDefaultClass.hello();

    }
    @Override
    public void hello(){
        A.super.hello();
    }

}
