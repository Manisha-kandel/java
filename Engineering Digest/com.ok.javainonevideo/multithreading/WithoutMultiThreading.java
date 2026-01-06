
// package multithreading;     //package gave erros, 


/*
To create a new thread in Java, you can either extend the Thread class or implement the Runnable interface. 
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
*/
public class WithoutMultiThreading {
    public static void main (String[] args) {
        //sequential works
        long startTime = System.currentTimeMillis();

        long sum = 0;
        for (int i=1; i<=1000000000; i++) { sum+= i; }
        System.out.println("sum: "+ sum);

        int count = 0;
        for (int i=1; i<=500000000; i++) { 
            if (i % 10 == 7) { 
                count++; }
        }
        System.out.println("count of numbers ending in 7: "+ count);

        System.out.println("Time taken: "+ (System.currentTimeMillis() - startTime) + " ms");

    }
}