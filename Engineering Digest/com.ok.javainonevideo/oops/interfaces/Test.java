// package io.github.jiangdequan;
package interfaces;

/*
INTERFACE:
Class <-> blueprint for object
Interface <-> blueprint for class
By interface, we achieve abstraction and multiple inheritance.
Interface can have abstract methods, static constants, static methods and default methods. 
 
Static methods in Interface:  check pdf pages 68, 69
- used for utility operations that are RELATED to the interface but don't need instance state.
- cannot be overridden by implementing classes
- called directly on the interface (not through instance)

default methods in interface: check pdf pages 70, 71

*/
public class Test {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.makeCall("123-456-7890");
        myPhone.playMusic();
        myPhone.exists();
        String str ="try";
        System.out.println(str.length());
}
}


interface Mobile {
    static final int numberOfBatteries = 1;   //static constant
    void exists();         //abstract method
    void makeCall(String number);  //default method
    void sendMessage(String number, String message);
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Mobile, MusicPlayer {      //all the methods of these interfaces SmartPhone class is implementing, must be used in the class. 
    @Override
    public void exists() {
        System.out.println("The smartphone exists. It is real ! ");
    }

    @Override
    public void playMusic() {
        System.out.println("The smartphone is playing music.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }
}

/*
there are specific examples of static methods and default methods in pdf 68-71 have a look. 
*/

/*
 INTERFACE VS. ABSTRACT CLASS: when to use each? 
1. Use an abstract class when you want to share code among closely related classes. Abstract classes can have instance variables and concrete methods that can be inherited by subclasses.
2. Use an interface when you want to define a contract that can be implemented by classes from different class hierarchies. Interfaces are ideal for defining capabilities that can be shared across unrelated classes.
3. multiple inheritance can be achieved interface.

*/