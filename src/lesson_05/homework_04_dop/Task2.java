package lesson_05.homework_04_dop;

import java.util.Scanner;

/*Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] slova = new String[5];

        for (int i = 0; i < slova.length; i++) {
            slova[i] = sc.nextLine();
        }

        int a = slova.length;
        String aa = null;

        for (int i = 0; i < slova.length; i++) {
            if (slova[i].length() > a) {
                a = slova[i].length();
                aa = slova[i];
            }
        }
        System.out.println(aa + " " + a);

        int b = slova.length;
        String bb = null;
        for (int i = 0; i < slova.length; i++) {
            if (slova[i].length() < b) {
                b = slova[i].length();
                bb = slova[i];
            }
        }
        System.out.println(bb + " " + b);
    }
}