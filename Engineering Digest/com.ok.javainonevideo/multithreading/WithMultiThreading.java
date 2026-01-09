
/*
To create a new thread in Java, 
1. you can either extend the Thread class or 
2. implement the Runnable interface. 
public class Test {
    public static void main (String[] args) {
        // Create a new thread by extending the Thread class
        Thread thread1 = new MyThread();
        thread1.start(); // Start the thread

        // Create a new thread by implementing the Runnable interface
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start(); // Start the thread
    }
}
// */   //will continue multithreading next day from here, keeping error as bookmark.
public class WithMultiThreading {
    public static void main(String[] args) {
        // System.out.println();
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
        //let's create two classes for two tasks: SumCalculator and NumberCounter. 

        long startTime = System.currentTimeMillis();
        //extends Thread class
        NumberCounter thread1 = new NumberCounter();

        //implements Runnable 
        SumCalculator sumCalculator = new SumCalculator();
        Thread thread2 = new Thread(sumCalculator);
        
        thread1.start();
        thread2.start();

        //we have to join the threads to main thread, so that the time taken shown by the line below shows true time taken. 
        //if the threads aren't joined, the main thread executes the below line giving ~3 ms as time taken, 
        // while these parallel tasks actually take around 627 ms.
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         
        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime) + "ms" );
    }
}