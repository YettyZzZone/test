package oop.task2.nursery;

import oop.task1.Animal;
import oop.task1.dog.Dog;
import oop.task1.turtle.Turtle;
import oop.task1.сat.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Nursery {
    //Объявляем переменную для хранения коллекции элементов с типом Animal
    private ArrayList<Animal> animals;

    //В конструкторе инициализируем коллекцию
    public Nursery(Animal animal1, Animal animal2, Animal animal3, Animal animal4, Animal animal5,
                   Animal animal6, Animal animal7, Animal animal8, Animal animal9, Animal animal10){
        animals = new ArrayList<Animal>(Arrays.asList(animal1, animal2, animal3,
                animal4, animal5, animal6, animal7, animal8, animal9, animal10));
    }

    //Метод, показывающий всех животных
    public void printAnimals() {
        for (Animal animal :
                animals) {
            System.out.println("У животного с кличкой " + animal.getName()
                    + " уровень голода равен " +animal.getHungryStatus()
                    + ", а текущий вес - " + animal.getWeight());
        }
    }

    //Метод, выводящий только животных определенного класса
    //Цифре 1 соответствует класс - Cat
    //Цифре 2 соответствует класс - Dog
    //Цифре 3 соответствует класс - Turtle
    public void printOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                for (Animal animal :
                        animals) {
                    if (animal instanceof Cat) {
                        System.out.println("У животного с кличкой " + animal.getName()
                                + " уровень голода равен " + animal.getHungryStatus()
                                + ", а текущий вес - " + animal.getWeight());
                    }
                }
                break;
            case 2:
                for (Animal animal :
                        animals) {
                    if (animal instanceof Dog) {
                        System.out.println("У животного с кличкой " + animal.getName()
                                + " уровень голода равен " + animal.getHungryStatus()
                                + ", а текущий вес - " + animal.getWeight());
                    }
                }
                break;
            case 3:
                for (Animal animal :
                        animals) {
                    if (animal instanceof Turtle) {
                        System.out.println("У животного с кличкой " + animal.getName()
                                + " уровень голода равен " + animal.getHungryStatus()
                                + ", а текущий вес - " + animal.getWeight());
                    }
                }
                break;
        }
    }

    //Метод, сортирующий животных по выбранному пользователем параметру (по возрастанию)
    //Цифре 1 соответствует параметр - имя
    //Цифре 2 соответствует параметр - уровень голода
    //Цифре 3 соответствует параметр - вес
    public void sortAnimals(int animalParameter){
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

    //Метод, выводящий животных с параметром веса от параметра weigthStart до weigthEnd
    public void printAnimalsFromInterval(int weigthStart, int weigthEnd) {
        for (Animal animal :
                animals) {
            if (animal.getWeight() >= weigthStart && animal.getWeight() <= weigthEnd) {
                System.out.println("У животного с кличкой " + animal.getName()
                        + " уровень голода равен " + animal.getHungryStatus()
                        + ", а текущий вес - " + animal.getWeight());
            }
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
