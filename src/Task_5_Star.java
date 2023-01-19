/*
Гражданин 1 марта открыл счет в банке, вложив  1000 руб. Через каждый месяц размер вклада увеличивается
на 2% от имеющейся суммы. Определить:
1. За какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
2. Через сколько месяцев размер вклада превысит 1200 руб.
 */

public class Task_5_Star {
    static public void main(String[] args) {
        double deposit = 1000;
        final double rate = 0.02;
        double profit = 0;
        final double aimSum = 1200;
        final double aimProfit = 30;
        int month = 2;
        while (profit <= aimProfit) {
            profit = deposit * rate;
            deposit += profit;
            month++;
            if (deposit > aimSum && deposit < (aimSum + profit)) {
                System.out.println("                 Сумма      Прибыль    Месяц");
                System.out.printf("Целевая сумма    %.2f    %.2f      %d\n", deposit, profit, month);
                months(month);
            }
            if (profit > aimProfit) {
                System.out.printf("Целевая прибыль  %.2f    %.2f      %d\n", deposit, profit, month);
                months(month);
            }
        }
    }

    public static int months(int month) {
        int currentYear = 2022;
        int year = currentYear + (month - 1) / 12;
        int mon = month % 12;
        System.out.print("Срок: ");
        switch (mon) {
            case 0:
                System.out.printf("Декабрь %d \n", year);
                break;
            case 1:
                System.out.printf("Январь %d \n", year);
                break;
            case 2:
                System.out.printf("Февраль %d \n", year);
                break;
            case 3:
                System.out.printf("Март %d \n", year);
                break;
            case 4:
                System.out.printf("Апрель %d \n", year);
                break;
            case 5:
                System.out.printf("Май %d \n", year);
                break;
            case 6:
                System.out.printf("Июнь %d \n", year);
                break;
            case 7:
                System.out.printf("Июль %d \n", year);
                break;
            case 8:
                System.out.printf("Август %d \n", year);
                break;
            case 9:
                System.out.printf("Сентябрь %d \n", year);
                break;
            case 10:
                System.out.printf("Октябрь %d \n", year);
                break;
            case 11:
                System.out.printf("Ноябрь %d \n", year);
                break;
            default:
                System.out.printf("Некорректные данные");
                break;
        }
        return mon;
    }
}
