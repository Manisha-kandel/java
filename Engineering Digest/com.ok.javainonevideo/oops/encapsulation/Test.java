
package encapsulation;
/*
ENCAPSULATION: it's the practice of bundling data (fields) and methods (functions) 
that operate on the data into a single unit (class). 
It also involves restricting direct access to some components using access modifiers(e.g., private, protected).
*/

public class Test {
    public static void main(String[] srgs) {
        Car car = new Car("Green");   //since color is private, we can only give color while initializing object with constructor
        car.setSpeed(-12);          //Not Possible ! 
        car.setSpeed(12);    
    }
    
}