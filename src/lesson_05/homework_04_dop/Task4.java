package lesson_05.homework_04_dop;

import java.util.Scanner;

/*1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
которой совпадает с текущим индексом из массива чисел.*/
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[10];
        int[] num = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextLine();
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = list[i].length();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
