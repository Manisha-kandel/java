// package io.github.jiangdequan;

/*
LOOPS: 


*/
public class Loops {
    public static void main (String[] args) {
        System.out.println("--------------------");
        //while loop
        int i = 0;
        while (i<=10) {                                 //while (); --> gave ; by mistake earlier, the while statement ended right there and rest of the code didn't execute/ 
            System.out.println("hello in while loop");
            i++;
        }


        //for loop
        //for (variable init, condition, increment/decrement step) { statements to run}
        System.out.println("------------------------");
        for (i = 0; i <= 10; i++) {                //i is local variable here. 
            System.out.println("Hello in for loop");
        }
        
        /*
        for (i=0; false; i++ ) {
            System.out.println("I will not print anyway. ");
        }
             */
        //

        //do-while loops
        System.out.println("----------------------");
        int j = 101;
        do {
            System.out.println("Hello in do-while, I will run at least once");  //will run the first time anyway. 
            j++;
        } while(j<=100);

    }
    
}