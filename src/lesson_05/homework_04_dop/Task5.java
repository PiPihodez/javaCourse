package lesson_05.homework_04_dop;

import java.util.Scanner;

/*1. Считать 6 строк и заполнить ими массив strings.
2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
*/
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int x = 0; x < strings.length; x++) {
                if (i != x && strings[i] != null && strings[x] != null && strings[i].equals(strings[x])) {
                    strings[i] = null;
                    strings[x] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}

