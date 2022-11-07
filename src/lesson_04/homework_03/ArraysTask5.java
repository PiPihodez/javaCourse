package lesson_04.homework_03;

import lesson_04.Arrays;

import java.util.Scanner;

/*1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
public class ArraysTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            num1[i] = array[i];
            num2[i] = array[10 + i];
            System.out.println(num2[i]);
        }

// TODO: 07.11.2022
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] <= num1.length) {
//                num1[i] = array[i];
//            }
//        }
    }
}