package oop.task1;

public abstract class Animal {
    String name;
    int hungryStatus;
    int weight;

    protected abstract void walk();
    protected abstract void eat();

    public String getName() {
        return name;
    }

    public int getHungryStatus() {
        return hungryStatus;
    }

    public int getWeight() {
        return weight;
    }
}