package oop.task2.show_only;

import oop.task1.Animal;
import oop.task1.dog.Dog;
import oop.task1.turtle.Turtle;
import oop.task1.сat.Cat;
import oop.task2.creating_and_showing.CreateArrayList;


public class ShowOnlyThisClass {
    //Создаем экземпляр класса для создания ArrayList
    CreateArrayList menagerie = new CreateArrayList();

    //Метод, выводящий только животных определенного класса
    //Цифре 1 соответствует класс - Cat
    //Цифре 2 соответствует класс - Dog
    //Цифре 3 соответствует класс - Turtle
    public void showOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                for (Animal animal :
                        menagerie.createArrayList()) {
                    if (animal instanceof Cat) {
                        System.out.println("У животного с кличкой " + animal.getName()
                                + " уровень голода равен " + animal.getHungryStatus()
                                + ", а текущий вес - " + animal.getWeight());
                    }
                }
                break;
            case 2:
                for (Animal animal :
                        menagerie.createArrayList()) {
                    if (animal instanceof Dog) {
                        System.out.println("У животного с кличкой " + animal.getName()
                                + " уровень голода равен " + animal.getHungryStatus()
                                + ", а текущий вес - " + animal.getWeight());
                    }
                }
                break;
            case 3:
                for (Animal animal :
                        menagerie.createArrayList()) {
                    if (animal instanceof Turtle) {
                        System.out.println("У животного с кличкой " + animal.getName()
                                + " уровень голода равен " + animal.getHungryStatus()
                                + ", а текущий вес - " + animal.getWeight());
                    }
                }
                break;
        }
    }
}
