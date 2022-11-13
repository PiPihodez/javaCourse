package lesson_05.homework_04_dop;

import java.util.Locale;
import java.util.Scanner;

/*Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит слова на экран.*/
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            String i = sc.nextLine();
//            if (i != "") {
//                System.out.println(i.toUpperCase(Locale.ROOT));
//            } else {
//                break;
//            }
//        }
        while (true) {
            String i = sc.nextLine();
            if (i == ""){
                break;
            } else if (i.length() % 2 == 0) {
                System.out.println(i + " " + i);
            } else if (i.length() % 2 != 0) {
                System.out.println(i + " " + i + " " + i);
            }

        }
    }
}
