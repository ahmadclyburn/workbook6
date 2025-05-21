package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        people.add( new Person("james","johnson",35 ));
        people.add( new Person("Dana", "Wyatt", 63) );
        people.add( new Person("Zachary", "Westly", 31) );
        people.add( new Person("Elisha", "Aslan", 14) );
        people.add( new Person("Ian", "Auston", 16) );
        people.add( new Person("Zephaniah", "Hughes", 9) );
        people.add( new Person("Ezra", "Aiden", 17) );

        Collections.sort(people);
        System.out.println(people);

        String searchedName = input.nextLine();
        for(Person person: people){
            if (person.getLastName().equalsIgnoreCase(searchedName)){

            }
        }

    }


}
