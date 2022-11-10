package lesson_05.homework_04_dop;

import java.util.Scanner;

/*1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
