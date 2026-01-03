// package io.github.jiangdequan;
package classes;

/*
CLASS is a blueprint for creating objects, 
within class, we will have fields and methods. 
fields: instance variables, characteristics 
methods: 
OBJECT: 
 real world entity: an instance of class

*/

public class Test {
    public static void main(String[] srgs) {
        Car car = new Car();
        car.speed = 110;
        car.color = "Green";
        car.drive();
    }
    
}