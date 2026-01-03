
package polymorphism;
/*
POLYMORHISM:
tomorrow will do from here.  
*/

public class Test {
    public static void main(String[] srgs) {
        Child child = new Child();
        child.name = "Mansu";
        System.out.println(child.name);

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.capture();    
    }
    
}

//multilevel inheritance: Child extends Parent which extends GrandParent
class Child extends Parent {}
class Parent extends GrandParent {}
class GrandParent {    
    String name; }      //this will be used by Parent and Child class, since they directly or indirectly extend it.
    
    
/* multiple inheritance isn't supported on java.  */
class Camera{
    void capture(){
        System.out.println("Photo clicking ....");
    }
}
class MusicPlayer{
    void playMusic(){
        System.out.println("Music Playing . . . ");
    }
}
class Phone{
    void call(String number) {
        System.out.println("Calling . . " + number);
    }
}
class SmartPhone extends Camera {}    //works
 
/* class SmartPhone extends Camera, Phone, MusicPlayer {}     //doesn't work 
*/

/* a solution: 
POLYMORPHISM: java doesn’t support multiple inheritance of classes(a class
 can extend only one class) to avoid ambiguity like the “diamond problem” 
 when two parents have the same method.

Instead, Java uses interfaces (a class can implement many) and polymorphism lets you 
treat different objects through a common parent type/interface, calling the same 
method name and getting the correct behavior at runtime (method overriding).
*/

    