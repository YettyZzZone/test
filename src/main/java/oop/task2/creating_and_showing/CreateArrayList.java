package oop.task2.creating_and_showing;

import oop.task1.Animal;
import oop.task1.dog.Dog;
import oop.task1.turtle.Turtle;
import oop.task1.сat.Cat;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    //Создаем объекты с животными
    Cat barsik = new Cat("Барсик", 10, 5);
    Cat murzik = new Cat("Мурзик", 5, 2);
    Cat vaska = new Cat("Васька", 4, 2);
    Dog reks = new Dog("Рекс", 6, 10);
    Dog ryzhik = new Dog("Рыжик", 10, 15);
    Dog misha = new Dog("Миша", 2, 6);
    Dog sharik = new Dog("Шарик", 6, 6);
    Turtle pok = new Turtle("Пок", 7, 3);
    Turtle rock = new Turtle("Рок", 9, 4);
    Turtle mock = new Turtle("Мок", 2, 2);

    //Метод для создания коллекции с животными
    public ArrayList<Animal> createArrayList(){
        return new ArrayList<Animal>(Arrays.asList(barsik, murzik, vaska, reks, ryzhik, misha,
                sharik, pok, rock, mock));
    }
}
