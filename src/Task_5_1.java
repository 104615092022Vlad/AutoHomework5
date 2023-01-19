/*
Составить программу, которая уменьшает первое введённое число в два раза, если
оно больше второго введённого числа по абсолютной величине.
*/

import java.util.Scanner;
public class Task_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float firstNumber = sc.nextFloat();
        System.out.print("Введите второе число: ");
        float secondNumber = sc.nextFloat();
        if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            firstNumber = 0.5f * firstNumber;
            System.out.printf("Условие выполнено. Новое значение первого числа: %.2f", firstNumber);
        } else {
            System.out.println("Условие не выполнено. Значения чисел остаются прежними.");
        }
    }
}
