package org.example;
import java.util.Scanner;
public class Calkulater {
    Scanner sc = new Scanner(System.in);
    String name;
    String nameAll = ":";
    double cost;
    double summ = 0;
    double money = 0;


    void calk(int person) {
        while (true) {

            System.out.println("Введите Название блюда");
            name = sc.next();
            if (!(name.equalsIgnoreCase("Завершить"))) {
                System.out.println("Введите стоимость в формате рублей.копеек");

                cost = sc.nextDouble();

                summ = summ + cost;
                nameAll = nameAll + "\n" + name;
                String messageTemplate1 = "Вы успешно добавили товар на общую сумму %.2f руб., добавьте товар еще, или наберите слово Завершить";
                System.out.println(String.format(messageTemplate1, summ));
            } else {
                break;
            }
        }


        money = summ / person;
        String messageTemplate = "Вы заказали %s, скидываемся по %.2f руб.";
        System.out.println(String.format(messageTemplate, nameAll, money));
    }
}
