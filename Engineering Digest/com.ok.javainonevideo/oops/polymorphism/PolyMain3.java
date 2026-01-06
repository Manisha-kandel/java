// package io.github.jiangdequan;
package polymorphism;

//run-time polymorphism, method overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolyMain3 {
    public static void main(String[] args) {
        Animal myAnimal;          //declare an Animal reference
        myAnimal = new Dog();    //Dog object
        myAnimal.sound();        //Dog barks

        myAnimal = new Cat();    //Cat object
        myAnimal.sound();        //Cat meows
    }
}
