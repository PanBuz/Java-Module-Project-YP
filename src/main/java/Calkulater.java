package org.example;
import java.util.Scanner;
public class Calkulater {
    Scanner sc = new Scanner(System.in);
    String name;
    String nameAll = ":";
    double cost;
    double summ = 0;
    double money = 0;
    int ost;
    double ostl;

    void calk(int person) {
        org.example.Ostatok rur = new org.example.Ostatok();
        while (true) {

            System.out.println("Введите Название блюда");
            name = sc.next();
            if (!(name.equalsIgnoreCase("Завершить"))) {
                System.out.println("Введите стоимость в формате рублей.копеек");

               // cost = sc.nextDouble();
                while (true){
                    cost = sc.nextDouble();
                    if (cost <= 0 ) {
                        System.out.println("Не корректное цифра");}
                       // else if (!sc.hasNextDouble()) {System.out.println("Буквы нельзя в стоимсть вводить");}
                     else { break;}
                }

                summ = summ + cost;
                nameAll = nameAll + "\n" + name;

                String messageTemplate1 = "Вы успешно добавили товар на общую сумму %.2f руб., добавьте товар еще, или наберите слово Завершить";
                System.out.println(String.format(messageTemplate1, summ));
            } else {
                break;
            }
        }



        money = summ / person;

        ostl = money % 10f;
        ost = (int)ostl;

        rur.ostat(ost, money, nameAll);


    }
}
