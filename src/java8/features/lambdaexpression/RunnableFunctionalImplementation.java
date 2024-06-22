package java8.features.lambdaexpression;

public interface RunnableFunctionalImplementation {
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("runnable used to run this code on separate thread");
        Thread thread = new Thread();
        thread.run();
        runnable.run();
    }
}
