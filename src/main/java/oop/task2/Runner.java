package oop.task2;

import oop.task1.Animal;
import oop.task1.сat.Cat;
import oop.task2.creating_and_showing.CreateArrayList;
import oop.task2.creating_and_showing.ShowingAnimals;
import oop.task2.show_only.ShowOnlyThisClass;
import oop.task2.sort.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        while (true) {
            System.out.println("Введи цифру необходимого тебе действия: \n" +
                    "1. Показать весь питомник\n" +
                    "2. Показать только выбранный вид животных\n" +
                    "3. Отсортировать коллекцию по выбранному параметру\n" +
                    "4. Вывести животное подходящее под заданные параметры");
            int num = userChoice.nextInt();
            switch (num){
                //Показываем весь питомник
                case 1 :
                    //Создаем экземпляр класса для создания ArrayList
                    CreateArrayList menagerie = new CreateArrayList();
                    //Создаем экземпляр класса для дальнейшего вызова метода, показывающего весь питомник
                    ShowingAnimals showing = new ShowingAnimals();
                    showing.showingAnimals((ArrayList<Animal>) menagerie.createArrayList());
                    break;
                //Показываем только выбранный вид животных
                case 2:
                    System.out.println("Выбери, какой вид животных ты хочешь увидеть: \n" +
                            "1. Кошки\n" +
                            "2. Собаки\n" +
                            "3. Черепахи");
                    //Считываем пользовательский ввод
                    int userChoice2 = userChoice.nextInt();
                    ShowOnlyThisClass onlyThisClass = new ShowOnlyThisClass();
                    //В зависимости от выбора пользователя, прокидываем в метод
                    //число, соответствующее определенному классу животного
                    switch (userChoice2){
                        case 1:
                            onlyThisClass.showOnlyThisClass(1);
                            break;
                        case 2:
                            onlyThisClass.showOnlyThisClass(2);
                            break;
                        case 3:
                            onlyThisClass.showOnlyThisClass(3);
                            break;
                    }
                case 3:
                    System.out.println("Выбери, по какому параметру ты хочешь отсортировать коллекцию: \n" +
                            "1. Имя\n" +
                            "2. Уровень голода\n" +
                            "3. Вес");
                    //Считываем пользовательский ввод
                    int userChoice3 = userChoice.nextInt();
                    Sorting sorting = new Sorting();
                    //В зависимости от выбора пользователя, прокидываем в метод
                    //число, соответствующее определенному классу животного
                    switch (userChoice3){
                        case 1:
                            sorting.sortingAnimals(1);
                            break;
                        case 2:
                            sorting.sortingAnimals(2);
                            break;
                        case 3:
                            sorting.sortingAnimals(3);
                            break;
                    }
            }
        }
    }
}
