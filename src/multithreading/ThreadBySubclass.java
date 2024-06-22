package multithreading;

public class ThreadBySubclass {
    public static void main(String[] args) {
        Thread thread =new ThreadChecking();
        System.out.println("current thread is running" + Thread.currentThread().getName());
        thread.start();
        System.out.println("current thread is running" + thread.getName());
    }
    private static class ThreadChecking extends Thread{

    }
}
