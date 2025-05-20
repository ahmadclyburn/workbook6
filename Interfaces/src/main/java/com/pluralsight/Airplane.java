package com.pluralsight;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("starts engine and takes off");
    }
}
