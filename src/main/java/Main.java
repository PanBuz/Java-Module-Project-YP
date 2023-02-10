// dev branch for Y.Practicum
package org.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        org.example.Calkulater calkul = new org.example.Calkulater();


        System.out.println("На скольких человек разделить счет?");

        int person;


        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Введены буквы вместо цифр");
                sc.next();
            }
            person = sc.nextInt();
            if (person > 1) {
                System.out.println("Будем делить на , " + person + " человек!");
                break;
            } else if (person == 1) {
                System.out.println("Нет смысла делить счет на одного человека!");
            } else {
                System.out.println("Не корректное количество гостей!");
            }
        }

        calkul.calk(person);


    }
}

