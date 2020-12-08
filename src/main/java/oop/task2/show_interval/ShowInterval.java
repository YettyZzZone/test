package oop.task2.show_interval;

import oop.task1.Animal;
import oop.task2.creating_and_showing.CreateArrayList;

import java.util.ArrayList;

//fixme слишком сильно начал дробить. этот класс не несет в себе никакой необходимости. тем более его объект
public class ShowInterval {
    //Создаем экземпляр класса для создания ArrayList
    CreateArrayList menagerie = new CreateArrayList();
    ArrayList<Animal> animals = menagerie.createArrayList();

    //Метод, сортирующий животных по выбранному пользователем параметру (по возрастанию)
    //Цифре 1 соответствует параметр - имя
    //Цифре 2 соответствует параметр - уровень голода
    //Цифре 3 соответствует параметр - вес
    public void showAnimalsFromInterval(int weigthStart, int weigthEnd) {
        for (Animal animal :
                animals) {
            if (animal.getWeight() >= weigthStart && animal.getWeight() <= weigthEnd) {
                System.out.println("У животного с кличкой " + animal.getName()
                        + " уровень голода равен " + animal.getHungryStatus()
                        + ", а текущий вес - " + animal.getWeight());
            }
        }
    }
}
