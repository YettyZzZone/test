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
    private final ArrayList<Animal> animals;

    //В конструкторе инициализируем коллекцию
    public Nursery(Animal ... animal){
        animals = new ArrayList<Animal>(Arrays.asList(animal));
    }

    //Метод, показывающий всех животных
    public void printAnimals() {
        for (Animal animal :
                animals) {
            System.out.println(animal.toString());
        }
    }

    //Метод, выводящий только животных определенного класса
    //Цифре 1 соответствует класс - Cat
    //Цифре 2 соответствует класс - Dog
    //Цифре 3 соответствует класс - Turtle
    public void printOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                printCollection(Cat.class);
                break;
            case 2:
                printCollection(Dog.class);
                break;
            case 3:
                printCollection(Turtle.class);
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
                printAnimals();
                break;
            case 2:
                Collections.sort(animals, new Comparator<Animal>() {
                    public int compare(Animal o1, Animal o2) {
                        return o1.getHungryStatus() - (o2.getHungryStatus());
                    }
                });
                printAnimals();
                break;
            case 3:
                Collections.sort(animals, new Comparator<Animal>() {
                    public int compare(Animal o1, Animal o2) {
                        return o1.getWeight() - (o2.getWeight());
                    }
                });
                printAnimals();
                break;
        }
    }

    //Метод, выводящий животных с параметром веса от параметра weigthStart до weigthEnd
    public void printAnimalsFromInterval(int weigthStart, int weigthEnd) {
        for (Animal animal :
                animals) {
            if (animal.getWeight() >= weigthStart && animal.getWeight() <= weigthEnd) {
                System.out.println(animal.toString());
            }
        }
    }

    //Выводим элементы коллекции, если они соответствуют классу, который передали внутрь метода
    public void printCollection(Class<?> choiseClass){
        for (Animal animal :
                animals) {
            if (choiseClass.isInstance(animal)) {
                System.out.println(animal.toString());
            }
        }
    }
}
