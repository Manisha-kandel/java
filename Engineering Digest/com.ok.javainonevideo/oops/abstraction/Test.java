// package io.github.jiangdequan;
package abstraction;

/*
ABSTRACT CLASS:
declared using keyword 'abstract'
can include: 
1. abstract methods
2. concrete methods
An abstract class cannot be instantiated directly.
Acts as a blueprint for subclasses, which must implement the abstract methods. 
*/

/*
REGULAR CLASS VS ABSTRACT CLASS:
1. A regular class can be instantiated, whereas an abstract class cannot be instantiated directly.
2. A regular class can have only concrete methods, whereas an abstract class can have both abstract and concrete methods. 
3. A regular class can be used to create objects directly, whereas an abstract class is meant to be subclassed and cannot be used to create objects directly.
*/

public class Test {
    public static void main(String[] args) {
        Animal bob = new Dog(); Animal bobby = new Cat();
        bob.sayHello();   //Woof!
        bobby.sayBye();   //Meow! Meow!
        bob.sleep();      //zzzzzzzz....
        bobby.sleep();    //zzzzzzzz...
    }
}

//note the use of abstract keywords here. 
abstract class Animal {
    public abstract void sayHello();     //abstract method
    public abstract void sayBye();       //abstract method
    public void sleep() {                //concrete method
        System.out.println("zzzzzzz....");
    }
}

class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Woof! ");
    }
    @Override
    public void sayBye() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Meow! ");
    }
    @Override
    public void sayBye() {
        System.out.println("Meow! Meow!");
    }
}