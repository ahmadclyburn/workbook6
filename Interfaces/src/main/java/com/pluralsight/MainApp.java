package com.pluralsight;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Flyable[] flyers = {new Bird(), new Airplane(), new Drone()};

        for(Flyable thing:flyers){
            thing.fly();
        }
    }
}
