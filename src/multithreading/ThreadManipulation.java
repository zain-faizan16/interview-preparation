package multithreading;

public class ThreadManipulation {

    public static void main(String[] args) {
       Thread thread = new Thread(()->
                System.out.println("this thread strating point " + Thread.currentThread().getName() ));
        System.out.println("before starting thread :" +Thread.currentThread().getName());
        thread.setName("for learning");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        System.out.println("after starting thread :" +Thread.currentThread().getName());
    }
}
