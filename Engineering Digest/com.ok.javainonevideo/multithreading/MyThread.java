// package io.github.jiangdequan;

public class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

// 
class Counter {
    private int count = 0;      // shared resource
    public synchronized void increment() {     //if you don't use synchronized, then the final count comes < 2000. 
        count++;
    }
    public int getCount() {
        return count;
    }
}

