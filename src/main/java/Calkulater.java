package org.example;

import java.util.Scanner;

public class Calkulater {
    Scanner sc = new Scanner(System.in);
    String nameOfDishes = "";
    String nameOfDishesAll = "";
    double cost;
    private double summ = 0;
    private double moneyPerPerson = 0;


    void calk(int person) {
        org.example.Ostatok rur = new org.example.Ostatok();
        while (true) {

            System.out.println("Введите Название блюда");
            nameOfDishes = sc.next();
            if (!(nameOfDishes.equalsIgnoreCase("Завершить"))) {
                System.out.println("Введите стоимость в формате рублей.копеек");


                while (true) {
                    while (!sc.hasNextDouble()) {
                        System.out.println("Введены буквы вместо цифр");
                        sc.next();
                    }
                    cost = sc.nextDouble();
                    if (cost <= 0) {
                        System.out.println("Не корректная цифра");
                    } else {
                        break;
                    }
                }

                summ = summ + cost;
                nameOfDishesAll = nameOfDishesAll + "\n" + nameOfDishes;

                String messageTemplate1 = "Вы успешно добавили товар на общую сумму %.2f руб., добавьте товар еще, или наберите слово Завершить \n";
                System.out.printf(messageTemplate1, summ);
            } else {
                break;
            }
        }


        moneyPerPerson = summ / person;


        rur.ostat(moneyPerPerson, nameOfDishesAll);


    }
}
