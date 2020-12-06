package oop.task2;

import oop.task2.creating_and_showing.CreateArrayList;
import oop.task2.creating_and_showing.ShowingAnimals;

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
                case 1 :
                    //Создаем экземпляр класса для создания ArrayList
                    CreateArrayList menagerie = new CreateArrayList();
                    //Создаем экземпляр класса для дальнейшего вызова метода, показывающего весь питомник
                    ShowingAnimals showing = new ShowingAnimals();
                    showing.showingAnimals(menagerie.createArrayList());
                    break;
                default:
                    System.out.println("Вы ввели что-то не то");
            }
        }
    }
}
