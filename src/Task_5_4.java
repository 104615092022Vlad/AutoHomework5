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