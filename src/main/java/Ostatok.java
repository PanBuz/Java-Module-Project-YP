
package org.example;
public class Ostatok {
     void ostat (int ost, double money, String nameAll){
        String rubli = new String();

        switch (ost){
            case 0: rubli ="Рублей";  break;
            case 1: rubli ="Рубль"; break;
            case 2: rubli ="Рубля"; break;
            case 3: rubli ="Рубля";  break;
            case 4: rubli ="Рубля"; break;
            case 5: rubli ="Рублей"; break;
            case 6: rubli ="Рублей";  break;
            case 7: rubli ="Рублей"; break;
            case 8: rubli ="Рублей"; break;
            case 9: rubli ="Рублей"; break;
        }
         String messageTemplate = "Вы заказали %s, скидываемся по %.2f %s.";
         System.out.println(String.format(messageTemplate, nameAll, money, rubli));
    }
}
