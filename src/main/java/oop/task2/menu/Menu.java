package oop.task2.menu;

import exceptions.WeightLessThanZeroException;
import oop.task2.nursery.Nursery;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    //Метод, показывающий главное меню программы
    public void showMainMenu() {
        System.out.println("Введи цифру необходимого тебе действия: \n" +
                "1. Показать весь питомник\n" +
                "2. Показать только выбранный вид животных\n" +
                "3. Отсортировать коллекцию по выбранному параметру\n" +
                "4. Вывести животное подходящее под заданные параметры");
    }

    //Метод, который показывает только определенный класс животного
    //номер которого ввел пользователь
    //1 - Кошки
    //2 - Собаки
    //3 - Черепахи
    public void printOnlyThisClass(Nursery nursery) {
        System.out.println("Выбери, какой вид животных ты хочешь увидеть: \n" +
                "1. Кошки\n" +
                "2. Собаки\n" +
                "3. Черепахи");
        int userSelectedClass = scanner.nextInt();
        //В зависимости от выбора пользователя, прокидываем в метод
        //число, соответствующее определенному классу животного
        switch (userSelectedClass) {
            case 1:
                nursery.printOnlyThisClass(1);
                break;
            case 2:
                nursery.printOnlyThisClass(2);
                break;
            case 3:
                nursery.printOnlyThisClass(3);
                break;
        }
    }

    //Метод, который сортирует животных по параметру,
    //Который ввел пользователь
    public void sortAnimals(Nursery nursery) {
        System.out.println("Выбери, по какому параметру ты хочешь отсортировать коллекцию: \n" +
                "1. Имя\n" +
                "2. Уровень голода\n" +
                "3. Вес");
        //Считываем пользовательский ввод
        int userSelectedParameter = scanner.nextInt();
        //В зависимости от выбора пользователя, прокидываем в метод
        //число, соответствующее определенному параметру сортировки
        switch (userSelectedParameter) {
            case 1:
                nursery.sortAnimals(1);
                break;
            case 2:
                nursery.sortAnimals(2);
                break;
            case 3:
                nursery.sortAnimals(3);
                break;
        }
    }

    //Метод, считывающий пользовательский ввод веса
    public int enterStartRangeValues() {
        System.out.println("Введи начальную границу диапозона веса животного: ");
        //Считываем пользовательский ввод
        int choiceWeigthStart = scanner.nextInt();
        if (choiceWeigthStart < 0) {
            throw new WeightLessThanZeroException("Параметр веса животного меньше ноля!");
        }
        return choiceWeigthStart;
    }
    //Метод, считывающий конечное значение веса животного
    public int enterEndRangeValues() {
        System.out.println("Введи конечную границу диапозона веса животного: ");
        int choiceWeigthEnd = scanner.nextInt();
        if (choiceWeigthEnd < 0) {
            throw new WeightLessThanZeroException("Параметр веса животного меньше ноля!");
        }
        return choiceWeigthEnd;
    }


}
