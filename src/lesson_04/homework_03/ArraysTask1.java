package lesson_04.homework_03;

import java.util.Scanner;

/*1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/
public class ArraysTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = array.length -1; i >=0; i--) {
            System.out.println(array[i]);
        }

    }
}
