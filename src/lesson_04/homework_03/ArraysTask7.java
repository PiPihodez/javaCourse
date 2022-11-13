package lesson_04.homework_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.*/
public class ArraysTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] array = new Integer[20];

        int a = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array, Collections.reverseOrder());
        for (int i : array) {
            System.out.println(i + " ");
        }
// норм решение
//        for (int i = 0; i < array.length; i++) {    //внешний цикл
//            for (int j = i; j < array.length; j++) {    //внутренний цикл
//                if (array[i] < array[j]) {
//                    int x = array[i];   //временная переменная
//                    array[i] = array[j];
//                    array[j] = x;
//                }
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }
}