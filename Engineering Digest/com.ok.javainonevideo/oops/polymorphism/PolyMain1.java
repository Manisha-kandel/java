
package polymorphism;

/* class SmartPhone extends Camera, Phone, MusicPlayer {}     //doesn't work 

A solution: 
POLYMORPHISM: java doesn’t support multiple inheritance of classes(a class
 can extend only one class) to avoid ambiguity like the “diamond problem” 
 when two parents have the same method.

Instead, Java uses interfaces (a class can implement many) and polymorphism lets you 
treat different objects through a common parent type/interface, calling the same 
method name and getting the correct behavior at runtime (method overriding).
*/

/*
POLYMORPHISM:
1. Compile-time polymorphism (method overloading, operator overloading): same name of method but different parameters list.
2. Runtime polymorphism (method overriding)

*/

//compile-time polymorphism, method overloading
class Calculator{
    int add(int a, int b){ return a+b; }          //method overloading: method 1 with name 'add'
    double add(double a, double b){ return a+b; } // method 2. 
    int add(int a, int b, int c){ return a+b+c; } // method 3.
    }

public class PolyMain1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));           //5
        System.out.println(calc.add(2.5, 3.5));       //6.0
        System.out.println(calc.add(1, 2, 3));        //6
    }
}









    