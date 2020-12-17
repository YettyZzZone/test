package oop.task2;

import exceptions.TheSecondValueIsLessThanTheFirstException;
import exceptions.WeightLessThanZeroException;
import oop.task1.dog.Dog;
import oop.task1.turtle.Turtle;
import oop.task1.сat.Cat;
import oop.task2.menu.Menu;
import oop.task2.nursery.Nursery;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Nursery nursery = Runner.arrayInitialization();
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
                        try{
                            //Показываем животных, которые подходят под интервал веса,
                            //заданного пользователем
                            nursery.printAnimalsFromInterval(menu.enterStartRangeValues(), menu.enterEndRangeValues());
                        } catch (WeightLessThanZeroException e){
                            System.out.println(e.getMessage());
                        } catch (TheSecondValueIsLessThanTheFirstException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Вы ввели что-то не то");
        }
    }
    public static Nursery arrayInitialization (){
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
        return new Nursery(barsik, murzik, vaska, reks, ryzhik, misha, sharik, pok, rock, mock);
    }
}
