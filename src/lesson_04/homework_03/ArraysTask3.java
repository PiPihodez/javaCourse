package lesson_04.homework_03;

import java.util.Scanner;

/*1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.*/
public class ArraysTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stroki = new String[10];
        int[] array = new int[10];

        for (int i = 0; i < stroki.length; i++) {
            stroki[i] = sc.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stroki[i].length();
            System.out.print(array[i] + " ");
        }


    }
}
