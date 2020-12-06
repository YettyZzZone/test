package oop.сat;

import oop.Animal;

public final class Cat extends Animal {
    private String name;
    private int hungryStatus;
    private int weight;

    public Cat(String name, int hungryStatus, int weight) {
        this.name = name;
        this.hungryStatus = hungryStatus;
        this.weight = weight;
    }

    protected void climb(){
        hungryStatus = hungryStatus - 2;
    }

    @Override
    protected void walk() {
        hungryStatus--;
    }

    @Override
    protected void eat() {
        hungryStatus++;
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
