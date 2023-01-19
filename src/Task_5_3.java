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