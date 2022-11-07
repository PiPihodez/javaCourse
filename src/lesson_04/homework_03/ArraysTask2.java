package lesson_04.homework_03;

import java.util.Scanner;

/*1.1. Создай массив на 10 чисел
1.2. Считай с консоли 10 чисел и заполни ими массив
2. Найти максимальное число из элементов массива*/
public class ArraysTask2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        int max = array.length;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
