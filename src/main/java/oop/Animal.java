package oop;

public abstract class Animal {
    String name;
    int hungryStatus;
    int weight;

    protected abstract void walk();
    protected abstract void eat();
}
