// package io.github.jiangdequan;
package polymorphism;

public class Car {
    private int speed;        //private
    private String color;   //color is private now, can only be accessed in constructor

    /*
    public Car() {    
    //default constructor --> it's hidden while creating the class. 
    }
     */

    public Car(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Not possible ! ");
        } else {
            this.speed = speed;
            System.out.println("Driving at "+ speed);
        }
        
    }

    void drive(){
        System.out.println("Driving .... ");
    }
}