package oop.task2;

import oop.task1.сat.Cat;
import oop.task2.creating_and_showing.CreateArrayList;
import oop.task2.creating_and_showing.ShowingAnimals;
import oop.task2.show_only.ShowOnlyThisClass;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner user_choice = new Scanner(System.in);
        while (true) {
            System.out.println("Введи цифру необходимого тебе действия: \n" +
                    "1. Показать весь питомник\n" +
                    "2. Показать только выбранный вид животных\n" +
                    "3. Отсортировать коллекцию по выбранному параметру\n" +
                    "4. Вывести животное подходящее под заданные параметры");
            int num = user_choice.nextInt();
            switch (num){
                //Показываем весь питомник
                case 1 :
                    //Создаем экземпляр класса для создания ArrayList
                    CreateArrayList menagerie = new CreateArrayList();
                    //Создаем экземпляр класса для дальнейшего вызова метода, показывающего весь питомник
                    ShowingAnimals showing = new ShowingAnimals();
                    showing.showingAnimals(menagerie.createArrayList());
                    break;
                //Показываем только выбранный вид животных
                case 2:
                    System.out.println("Выбери, какой вид животных ты хочешь увидеть: \n" +
                            "1. Кошки\n" +
                            "2. Собаки\n" +
                            "3. Черепахи");
                    //Считываем пользовательский ввод
                    int num2 = user_choice.nextInt();
                    ShowOnlyThisClass onlyThisClass = new ShowOnlyThisClass();
                    //В зависимости от выбора пользователя, прокидываем в метод
                    //число, соответствующее определенному классу животного
                    switch (num2){
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
            }
        }
    }
}
