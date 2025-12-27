// Print hello world, name and age, print sum and difference of two numbers, check if a number is even or odd, check if a number is divisible by 3 based on sum of its digits.
public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Name: Manisha Kandel");
        System.out.println("Age: 20 ;) ");
        int a = 12;
        int b = 8;
        int sum_ = a + b;
        int diff_ = a - b;
        System.out.println("Sum: " + sum_); 
        System.out.println("Difference: " + diff_);
        int n=16;
        if(n%2==0){
            System.out.println(n + " is even number");
        }
        else{
            System.out.println(n + " is odd number");
        }

        // CHECKING DIVISIBILITY BY 3 BASED ON SUM OF DIGITS
        int m = 123545212;
        int sum_of_digits = 0;
        int temp = m;
        while(temp > 0){
            sum_of_digits += temp % 10;
            temp /= 10;
        }
        if(sum_of_digits % 3 == 0){
            System.out.println(m + " is divisible by 3");
        }
        else{
            System.out.println(m + " is not divisible by 3");
        }
        
        //swap two numbers
        int x = 5;
        int y = 10;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        temp = y;
        y = x;
        x = temp;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}


        
 