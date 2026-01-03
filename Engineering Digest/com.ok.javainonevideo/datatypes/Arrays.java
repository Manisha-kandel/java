// package io.github.jiangdequan;

/*
ARRAYS
declaration: []
int[] str[] ....


*/
public class Arrays {
    public static void main (String[] args) {
        System.out.println("--------------");
        int[] a = new int[5];  //0,0,0,0,0       
        //by default, arrays are integer arrays are initialized to 0s. 
        System.out.println(a[0]);
        //loop inside array by index
        System.out.println("----loop by index-------");
        for (int i = 0; i< 5; i++) {
            System.out.println(a[i]);
        }
        
        //loop by element 
        System.out.println("-----Loop by element----");
        for (int i:a) {
            System.out.println(i);
        }

        //initialize individual elements
        System.out.println("------");
        a[4] = 5;
        System.out.println(a[4]);

        //combined declaration, creation, and initialization
        System.out.println("-------");
        int[] values = {1,2,3,4,5};
        for (int i:values) System.out.println(i);     




    }
    
}