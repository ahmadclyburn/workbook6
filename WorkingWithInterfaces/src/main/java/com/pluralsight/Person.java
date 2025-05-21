package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public int compareTo(Person other){
        int sameAge = Integer.compare(this.age, other.age);
        return sameAge == 0 ? this.firstName.compareTo(other.firstName) : sameAge;
}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
public String toString() {
    return firstName + " " + lastName + " (Age: " + age + ")\n";
}

}
