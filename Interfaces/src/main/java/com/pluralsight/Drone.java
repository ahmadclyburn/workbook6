package com.pluralsight;

public class Drone implements Flyable{
    @Override
    public void fly() {
        System.out.println("battery starts and floats upward");
    }
}
