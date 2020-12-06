package oop.task2.creating_and_showing;

import oop.task1.Animal;

import java.util.ArrayList;

public class ShowingAnimals {

    public void showingAnimals (ArrayList <Animal> menagerie) {
        for (Animal animal :
                menagerie) {
            System.out.println("У животного с кличкой " + animal.getName()
                    + " уровень голода равен " +animal.getHungryStatus()
                    + ", а текущий вес - " + animal.getWeight());
        }
    }
}
