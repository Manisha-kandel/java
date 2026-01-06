// package io.github.jiangdequan;
package polymorphism;

//compile-time polymorphism, method overloading
class Printer {
    void print(String s){
        System.out.println("String: " + s);
    }
    void print(int num) {
        System.out.println("Integer: " + num);
    }
    void print(double d) {
        System.out.println("Double: " + d);    
    }
}

public class PolyMain2 {
    public static void main (String[] args) {
        Printer printer = new Printer();
        printer.print("Hello World");   //String: Hello World
        printer.print(100);             //Integer: 100
        printer.print(99.99);           //Double: 99.99

    }
}