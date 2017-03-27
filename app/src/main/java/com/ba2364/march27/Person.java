package com.ba2364.march27;

public class Person {
    private String name;
    private int age;
    private boolean alive;

    public Person() {
    } // Empty constructor is needed to read from Firebase

    public Person(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return name + " " + " " + age + " " + alive;
    }
}