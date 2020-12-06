package oop.task1.turtle;

import oop.task1.Animal;

public final class Turtle extends Animal {
    private String name;
    private int hungryStatus;
    private int weight;

    public Turtle(String name, int hungryStatus, int weight) {
        this.name = name;
        this.hungryStatus = hungryStatus;
        this.weight = weight;
    }

    protected void sleep(){
        hungryStatus--;
    }

    @Override
    protected void walk() {
        hungryStatus--;
    }

    @Override
    protected void eat() {
        hungryStatus = hungryStatus + 2;
    }

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
