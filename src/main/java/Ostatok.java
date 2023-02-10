
package org.example;
public class Ostatok {
     void ostat (int padeg, double moneyPerPerson, String nameOfDishesAll){
        String rubli = new String();

        switch (padeg){
            case 0: rubli ="Рублей"; break;
            case 1: rubli ="Рубль"; break;
            case 2: rubli ="Рубля"; break;
            case 3: rubli ="Рубля"; break;
            case 4: rubli ="Рубля"; break;
            case 5: rubli ="Рублей"; break;
            case 6: rubli ="Рублей"; break;
            case 7: rubli ="Рублей"; break;
            case 8: rubli ="Рублей"; break;
            case 9: rubli ="Рублей"; break;
            case 10: rubli ="Рублей"; break;
            case 11: rubli ="Рублей"; break;
            case 12: rubli ="Рублей"; break;
            case 13: rubli ="Рублей"; break;
            case 14: rubli ="Рублей"; break;
            case 15: rubli ="Рублей"; break;
            case 16: rubli ="Рублей"; break;
            case 17: rubli ="Рублей"; break;
            case 18: rubli ="Рублей"; break;
            case 19: rubli ="Рублей"; break;
        }
         String messageTemplate = "Вы заказали %s, скидываемся по %.2f %s.";
         System.out.printf(messageTemplate, nameOfDishesAll, moneyPerPerson, rubli);
    }
}
