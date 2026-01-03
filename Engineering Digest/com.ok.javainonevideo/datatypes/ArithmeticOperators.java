public class ArithmeticOperators {
    public static void main (String[] args) {
        int a = 10+ 1;
        int b = 10-1;
        int c = 10*1;
        float d1 = 10/3;  //3  (integer division)
        float d2 = 10 / 3.0f;   //3.3333333  (float division, 7 digits of precision)
        double d3 = 10.0/ 3.0;  //3.3333333333333335
        int e = 10 % 3; //1  
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        System.out.println("-------------");
        System.out.println(a);
        a += 5;   //16
        System.out.println(a);
        a -= 3;   //13
        System.out.println(a);
        a *= 2;   //26
        System.out.println(a);
        a /= 4;   //6   (integer division)
        System.out.println(a);
        a %= 4;   //2
        System.out.println(a);

        System.out.println("-------------------");
        System.out.println(a);
        a++;                        //operate with a= 2, then increment to 3
        System.out.println(a);      
        ++a;                        //increment to 4, then operate with a = 4
        System.out.println(a);
        a--;                        // op with 4, decrement to 3
        System.out.println(a);
        --a;                        // decrement to 2, then op
        System.out.println(a);

        System.out.println("------------------");
        int z = 1;
        System.out.println(z++ + --z);  //1+1 = 2
        System.out.println(++z + ++z);  //2+3 = 5
        System.out.println(--z + z--);  //2+2 = 4
        
    }
}
