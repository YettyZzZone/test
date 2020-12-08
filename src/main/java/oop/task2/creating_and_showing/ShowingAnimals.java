package oop.task2.creating_and_showing;

import oop.task1.Animal;

import java.util.ArrayList;

//fixme слишком сильно начал дробить. этот класс не несет в себе никакой необходимости. тем более его объект
public class ShowingAnimals {
    //Метод, показывающий всех животных
    public void showingAnimals (ArrayList <Animal> menagerie) {
        for (Animal animal :
                menagerie) {
            System.out.println("У животного с кличкой " + animal.getName()
                    + " уровень голода равен " +animal.getHungryStatus()
                    + ", а текущий вес - " + animal.getWeight());
        }
    }
}
