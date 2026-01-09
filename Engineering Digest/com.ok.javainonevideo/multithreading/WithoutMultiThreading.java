
// package multithreading;     //package gave erros, 


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