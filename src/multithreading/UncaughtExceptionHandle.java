package multithreading;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class UncaughtExceptionHandle {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {throw new RuntimeException("stack memory kind of error");});
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler  (){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("this is for logging to check uncaught exception in thread name : " + t.getName()
                + " and exception is : " + e.getMessage());
            }

        });
        thread.setName("exception");
        thread.start();
    }
}
