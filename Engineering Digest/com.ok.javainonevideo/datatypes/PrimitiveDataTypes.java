public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //INTEGRAL DATA TYPES IN JAVA
        // Integral data types in Java are used to store whole numbers (both positive and negative) without decimal points.
        // int, byte, short, long have different use cases.  
        // Here is an example of each:
        System.out.println("-------------------------------------");
        int a = 1;   //by default, integer literals are of type int
        byte b = 1;
        short c = 1;
        long d = 1;

        System.out.println(c+d);

        // They have their own ranges and memory sizes.
        byte w = 127; // 1 byte
        short x = 32767; // 2 bytes
        int y = 2147483647; // 4 bytes
        long z = 9223372036854775807L; // 8 bytes why it has L at the end? because long literals require an L suffix to distinguish them from int literals.
        System.out.println("Minimum and Maximum values:");
        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        /* difference between int and Int, byte and Byte, short and Short, long and Long
        int, byte, short, long are primitive data types, 
        while Integer, Byte, Short, Long are their corresponding wrapper classes in Java.
        Wrapper classes provide methods to manipulate the primitive data types as objects, 
        they also provide utility methods for conversion, comparison, and other operations.
        they can be used in collections like ArrayList, HashMap, etc.,
        which require objects rather than primitive types. */

        //DECIMAL DATA TYPES IN JAVA
        // Decimal data types in Java are used to store numbers with fractional parts (decimal points).
        // float and double have different use cases.
        // float has 7 digits of precision, while double has about 15-16 digits of precision.
        System.out.println("-------------------------------------------------");
        float f = 1.0f;  //f is required to indicate that it's a float literal as the default is double
        double g = 1.0;  //by default, decimal literals are of type double
        // print MIN_VALUE and MAX_VALUE of float and double
        System.out.println("Float Minimum and Maximum values:");
        System.out.println("Float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        //let's print lowest and largest negative value of float and double
        System.out.println("Float Lowest Negative value: " + -Float.MAX_VALUE);
        System.out.println("Double Lowest Negative value: " + -Double.MAX_VALUE);
        System.out.println("Float Negative value closest to 0: " + -Float.MIN_VALUE);
        System.out.println("Double Negative value closest to 0: " + -Double.MIN_VALUE);
        
        //BOOLEAN DATA TYPE IN JAVA
        // The boolean data type in Java is used to represent one of two possible values: true or false.
        System.out.println("-----------------------------------------");
        boolean isAutocompleteIrritatingWhileLearning = true;
        System.out.println("Is autocomplete irritating while learning? " + isAutocompleteIrritatingWhileLearning);
        
        //CHARACTERS DATA TYPE IN JAVA
        // The char data type in Java is used to store a single 16-bit Unicode character
        // emojis and everything else are represented using char data type
        System.out.println("---------------------------------");
        char letterA = 'A'; //it has an integer value mapped which is it's unicode code point
        char letterB = 66; // you can also assign integer value representing Unicode code point
        System.out.println("Character A and B: " + letterA + " and " + letterB);
        //let's print MIN_VALUE and MAX_VALUE of char
        System.out.println("Character Minimum and Maximum values:");
        int minValue = (int)Character.MIN_VALUE; //(int) is used to convert char to its integer Unicode code point
        int maxValue = (int)Character.MAX_VALUE; 
        System.out.println("Char: " + minValue + " to " + maxValue);    
        
        //WIDENING CONVERSION IN JAVA
        //it's a concept used to 
        System.out.println("Widening Conversion Example");
        System.out.println("---------------------------------");
        byte byteValue = 10; //1 byte
        short shortValue = byteValue; //2 bytes
        int intValue = shortValue; //4 bytes
        long longValue = intValue; // 8 bytes
        float floatValue = longValue; //4 bytes   //even though it's converting 8 bytes value to 4 bytes, it works cause it can include that in scientific notation
        double doubleValue = floatValue; //8bytes
        System.out.println("int:" + intValue);
        System.out.println("long:" + longValue);
        System.out.println("float:" + floatValue);
        System.out.println("double" + doubleValue);
        System.out.println();

        //NARROWING CONVERSION IN JAVA
        System.out.println("Narrowing Conversion Example");
        System.out.println("------------------------");
        double doubleValue2 = 123.456;
        float floatValue2 = (float) doubleValue2; //Narrowing conversion down from double to float
        long longValue2 = (long) floatValue2; //Narrowing conversion down from float to long
        int intValue2 = (int) longValue2;     // from long to int
        System.out.println("double:" + doubleValue2);
        System.out.println("float: " + floatValue2);
        System.out.println("long:" + longValue2);
        System.out.println("int:" + intValue2);
        System.out.println();

        
    } 
}