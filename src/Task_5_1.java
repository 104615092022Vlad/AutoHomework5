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



/*
Найти максимальное из натуральных чисел, не превышающих 5000, которое нацело делится на 39.
Используйте цикл с пост- или предусловием.
*/

public class Task_5_3 {
    public static void main(String[] args) {
        int number = 5000;
        while (number <= 5000 && number >= 39 && number % 39 != 0){
            number = --number;
        }
        System.out.printf("Искомое число: %d", number);
    }
}



/*
Напечатать числа с помощью цикла for следующим образом:
10 10.4
11 11.4
...
25 25.4
*/

public class Task_5_2 {
    public static void main(String[] args) {
        for (int i = 10; i <= 25; i++) {
            System.out.println(i + " " + i + ".4");
        }
    }
}



/*
Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе выполнения программы.
*/

import java.util.Scanner;
public class Task_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Введите число №" + (i + 1) + ": ");
            int number = sc.nextInt();
            array[i] = number;
        }
        System.out.println();
        System.out.println("Задан массив: ");
        for (int j = 0; j < 10; j++) {
            System.out.printf(array[j] + " ");
        }
    }
}
