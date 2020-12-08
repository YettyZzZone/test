package oop.task2.sort;

import oop.task1.Animal;
import oop.task2.creating_and_showing.CreateArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//fixme слишком сильно начал дробить. этот класс не несет в себе никакой необходимости. тем более его объект
public class Sorting {
    //Создаем экземпляр класса для создания ArrayList
    CreateArrayList menagerie = new CreateArrayList();
    ArrayList<Animal> animals = menagerie.createArrayList();

    //Метод, сортирующий животных по выбранному пользователем параметру (по возрастанию)
    //Цифре 1 соответствует параметр - имя
    //Цифре 2 соответствует параметр - уровень голода
    //Цифре 3 соответствует параметр - вес
    public void sortingAnimals(int animalParameter){
        switch (animalParameter) {
            case 1:
                Collections.sort(animals, new Comparator<Animal>() {
                    public int compare(Animal o1, Animal o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                for (Animal animal :
                        animals) {
                    System.out.println("У животного с кличкой " + animal.getName()
                            + " уровень голода равен " + animal.getHungryStatus()
                            + ", а текущий вес - " + animal.getWeight());
                }
                break;
            case 2:
                Collections.sort(animals, new Comparator<Animal>() {
                    public int compare(Animal o1, Animal o2) {
                        return o1.getHungryStatus() - (o2.getHungryStatus());
                    }
                });
                for (Animal animal :
                        animals) {
                    System.out.println("У животного с кличкой " + animal.getName()
                            + " уровень голода равен " + animal.getHungryStatus()
                            + ", а текущий вес - " + animal.getWeight());
                }
                break;
            case 3:
                Collections.sort(animals, new Comparator<Animal>() {
                    public int compare(Animal o1, Animal o2) {
                        return o1.getWeight() - (o2.getWeight());
                    }
                });
                for (Animal animal :
                        animals) {
                    System.out.println("У животного с кличкой " + animal.getName()
                            + " уровень голода равен " + animal.getHungryStatus()
                            + ", а текущий вес - " + animal.getWeight());
                }
                break;
        }
    }
}
