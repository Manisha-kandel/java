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
        int m = 123545212;       // number to check for 3-divisibility
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

        //print grade of students based on percentage 
        // 90+ = A, 80-89 = B, 70-79 = C, else D
        int percentage = 66;
        char grade = ' ';
        if (percentage >= 90) {
            grade = 'A';
        } 
        else if (percentage >= 80) {
            grade = 'B';
        } 
        else if (percentage >= 70) {
            grade = 'C';
        } 
        else if (percentage >= 60) {
            grade = 'D';
        }
        else {
            System.out.println("Invalid percentage");
        }
        System.out.println("Grade: " + grade);

        /*CHECK IF A YEAR IS A LEAP YEAR OR NOT
        In the Gregorian calendar, a year is a leap year if it is divisible by 4 but not divisible by 100, except if it is divisible by 400. 
        Examples: 2000 and 2020 are leap years |  But 1900 and 2100 are not.*/

        int year = 2020;   //change the year you want to check
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {          //Logic writing here is same as python, easy peasy
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
        /* SWITCH
        we will print weekday name based on integer number input
        */
       int weekday = 1;  //valid weekdays --> 1 to 7
       String weekdayName = "";
        switch (weekday) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break; 
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";  
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                System.out.println("\nInvalid input for weekday");
        }
        System.out.println("Weekday: " + weekdayName);

        /* LOOPS
        // Print first 10 natural numbers using for loop and while loop
        */     
        System.out.println("\nFirst 10 natural numbers using for loop:");   
        for(int i=1; i<=10; i++){
            System.out.print(i + " "); 
        }
        System.out.println("\nFirst 10 natural numbers using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        
        // Print sum of numbers from 1 to n using for loop
        int n_ = 5; // you can change this value to calculate sum up to
        int sum = 0;
        for (i = 1; i <= n_; i++){
            sum += i;
        }
        System.out.println("\nSum of first " + n_ + " natural numbers is: " + sum);

        //FACTORIAL OF A NUMBER USING FOR LOOP
        int num = 4;
        int factorial = 1;
        for (i = 1; i<= num; i++){
            factorial *= i;
        }
        System.out.println("\nFactorial of " + num + " is: " + factorial);

        // COUNT DIGITS IN A NUMBER USING WHILE LOOP
        int number = 23483535;
        int countDigits = 0;
        temp = number;
        while (temp > 0){
            temp /= 10;
            countDigits++;
        }
        System.out.println("\nNumber of digits in " + number + " is: " + countDigits);

        //REVERSE A NUMBER USING WHILE LOOP
        int numberToReverse = 12345;
        int reversedNumber = 0;
        int temp_ = numberToReverse;
        while (temp_ > 0){
            reversedNumber = reversedNumber * 10 + temp_ % 10;
            temp_ /= 10;
        }
        System.out.println("\nReversed number of " + numberToReverse + " is: " + reversedNumber);


        /*------------------------------------------------------------------------------------------
                                                LEVEL 5: ARRAYS
        ------------------------------------------------------------------------------------------*/
        // make an array of integers and print all elements, sum, and maximum element
        int[] arr = {11,12,13,14,15};
        // print all elements
        System.out.println("\nArray elements are:");
        for (int element : arr) {
            System.out.print("\n" + element + " ");
        }
        // sum and max of elements
        int sum_of_elements = 0;
        int max = arr[0];
        for (int element : arr) {
            sum_of_elements += element;
            if (element > max) {
                max = element;
            }
        }
        System.out.println("\nSum of elements: " + sum_of_elements);
        System.out.println("\nMaximum element: " + max);

        //find a value in an array if it exists
        int[] arrayToSearch = {6,4,5,8,2,9,1,3,7};
        int valueToFind = 10;
        boolean found = false;
        for (int element : arrayToSearch) {
            if (element == valueToFind)
                found = true;
                break;
        }
        if (!found) { System.out.println("\nValue " + valueToFind + " not found in array."); } 
        else { System.out.println("\nValue " + valueToFind + " found in array: " + found); }

        //find a value in an array if it exists, and print how many times it occurs
        int[] arrayToSearch_ = {6,4,5,8,2,9,1,1,1,3,7};
        int valueToFind_ = 1;
        boolean found_ = false;
        int howManyTimes = 0;
        for (int j = 0; j < arrayToSearch_.length; j++) {
            if (arrayToSearch_[j] == valueToFind_) {                 //when the bracket was missed for if statement, value of howManyTimes was always 11 (the length of array)
                found_ = true;
                howManyTimes++;
                System.out.println(howManyTimes);
            }
        }
        if (!found_) { System.out.println("\nValue " + valueToFind_ + " not found in array."); } 
        else { System.out.println("\nValue " + valueToFind_ + " found in array: "  + howManyTimes + " times"); }
        

        //for tomorrow
        //second largest number in an array
        int[] arrayForSecondLargest = {12,35,1,10,34,25,100};
        
        //mini programs: number guess check
        //print the star patterns
        

    }
}


        
 