
public class BitwiseOperators {
    public static void main (String[] args) {
        /*
        Bitwise operators: 
        & : both should be 1 to be 1
        | : or operator
        ^ : xor operator
        ! : 
        <<: left shift  
        >>: right shift
        */
        int x = 2;
        System.out.println(Integer.toBinaryString(x));  //10

        System.out.println("-------------");
        int a = 5;  //0101
        int b = 3;  //0011
        /* AND        0001
        OR            0111
        XOR           0110
        */
        
        // AND operator (&)
        System.out.println("AND Operation:");
        System.out.println("5 & 3 = "+ (a & b));
        System.out.println("Binary: " + Integer.toBinaryString(a & b));

        // OR operator (|)
        System.out.println("\nOR Operation:");
        System.out.println("5 | 3 = "+ (a | b));
        System.out.println("Binary: " + Integer.toBinaryString(a | b));

        //XOR operator(^)
        System.out.println("\nXOR Operation:");
        System.out.println("5 ^ 3 = "+ (a ^ b));
        System.out.println("Binary: " + Integer.toBinaryString(a ^ b));

        //NOT operator(~)
        System.out.println("\nNOT Operation:");
        System.out.println("~5 "+ (~a));
        System.out.println("Binary: " + Integer.toBinaryString(~a));
        // 101+1=110 (6)

        //Left Shift (<<)
        System.out.println("\n Left shift:");
        System.out.println("5 << 1 = "+ (a << 1 ));
        System.out.println("Binary: " + Integer.toBinaryString(a << 1));

        //Right Shift (<<)
        System.out.println("\n Right shift:");
        System.out.println("5 >> 1 = "+ (a >> 1 ));
        System.out.println("Binary: " + Integer.toBinaryString(a >> 1));



    }
}