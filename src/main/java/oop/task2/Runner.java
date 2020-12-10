package oop.task2;

import oop.task1.dog.Dog;
import oop.task1.turtle.Turtle;
import oop.task1.сat.Cat;
import oop.task2.menu.Menu;
import oop.task2.nursery.Nursery;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        //fixme main не должен выполнять миллион функций. у тебя же он отвечает и за создание питомника и за главное меню

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

        //Создаем объект класса Nursery и передаем внутрь конструктора созданных животных
        Nursery nursery = new Nursery(barsik, murzik, vaska, reks, ryzhik, misha, sharik, pok, rock, mock);
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                //Показываем главное меню
                menu.showMainMenu();
                //Считываем пользовательский ввод
                int userChoice = scanner.nextInt();
                switch (userChoice){
                    //Показываем весь питомник
                    case 1 :
                        nursery.printAnimals();
                        break;
                    //Показываем только выбранный вид животных
                    case 2:
                        menu.printOnlyThisClass(nursery);
                        break;
                    case 3:
                        menu.sortAnimals(nursery);
                        break;
                    case 4:
                        System.out.println("Введи начальную границу диапозона веса животного: ");
                        //Считываем пользовательский ввод
                        int choiceWeigthStart = scanner.nextInt();
                        System.out.println("Введи конечную границу диапозона веса животного: ");
                        //Считываем пользовательский ввод
                        int choiceWeigthEnd = scanner.nextInt();
                        nursery.printAnimalsFromInterval(choiceWeigthStart, choiceWeigthEnd);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Вы ввели что-то не то");
        }
    }
}
