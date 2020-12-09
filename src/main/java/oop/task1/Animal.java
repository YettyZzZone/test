package oop.task1;

public abstract class Animal {
    private String name;
    private int hungryStatus;
    private int weight;

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