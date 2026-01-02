public class StringClass {
    public static void main (String[] args) {
        //String is a class in java
        // jvm --> heap memory  (string pool, literal, reuse)
        System.out.println("try");
        StringClass obj1 = new StringClass();   //example of creating an object of a class
        StringClass obj2 = new StringClass();   // we can create as many instances of it as we want. 
        String str1 = "Hello";
        String str2 = "Hello"; //cause of string pool feature of heap memory in java for string literals, both str1 and str2 will refer to same address.
        String str3 = new String("Hello");
        
        int a = 1;
        System.out.println(a == a);  //this will check value of the variable
        System.out.println(str1 == str2); //but this will check addresses of str1 and str2
        System.out.println(str1 == str3); //false, cause new instance was created with new String();
        System.out.println(str1.equals(str3));  //String class has .equals method, which compares the content only. 

        //STRING IS IMMUTABLE IN JAVA, 
        //IF WE USE, SAY 'HELLO' FOR THE 100 TIMES ALSO, SAME CONTENT IS POINTED BY ALL THOSE 100 VARIABLES. 
        //IT DOESN'T CHANGE, AND HENCE STRING IS IMMUTABLE IN JAVA. 

        //few String methods
        String text = "Hello World";

        // Length
        System.out.println(text.length());  // 11

        // Accessing character
        System.out.println(text.charAt(4)); //'o'

        // Substring
        System.out.println(text.substring(0,5)); // "Hello"

        // Contains, startsWith, endsWith
        System.out.println(text.contains("World"));  //true

        // Replace
        String newText = text.replace("World", "Java");
        System.out.println(newText);     // "Hello Java"
        
        




        





    }
}

