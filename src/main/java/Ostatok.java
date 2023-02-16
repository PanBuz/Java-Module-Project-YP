
package org.example;
public class Ostatok {
     void ostat (double moneyPerPerson, String nameOfDishesAll){
        String rubli = new String();
        int padeg;
        double padegD;

         padegD = moneyPerPerson % 100f;
         if (padegD > 14) {padegD = padegD % 10f;}
         padeg = (int) padegD;

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

        }

         String messageTemplate = "Добавленные товары: %s, каждый платит %.2f %s.";
         System.out.printf(messageTemplate, nameOfDishesAll, moneyPerPerson, rubli);
    }
}
