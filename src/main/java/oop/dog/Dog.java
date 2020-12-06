package oop.dog;

import oop.Animal;

public final class Dog extends Animal {
    private String name;
    private int hungryStatus;
    private int weight;

    public Dog(String name, int hungryStatus, int weight) {
        this.name = name;
        this.hungryStatus = hungryStatus;
        this.weight = weight;
    }

    protected void biteAss(){
        hungryStatus = hungryStatus + 3;
    }

    @Override
    protected void walk() {
        hungryStatus = hungryStatus - 2;
    }

    @Override
    protected void eat() {
        hungryStatus = hungryStatus + 4;
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
