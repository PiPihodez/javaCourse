package lesson_04.homework_03;

import java.util.Scanner;

/*Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class ArraysTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        int min = array.length;
        int max = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
