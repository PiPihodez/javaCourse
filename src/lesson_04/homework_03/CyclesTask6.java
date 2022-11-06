package lesson_04.homework_03;

import java.util.Scanner;

/*Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988*/
public class CyclesTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        int m;
        int d;

        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        System.out.print("Введите год: ");
        y = sc.nextInt();
        System.out.print("Введите месяц: ");
        m = sc.nextInt();
        System.out.print("Введите день: ");
        d = sc.nextInt();

        System.out.println("Меня зовут " + name + "." + "\nЯ родился " + d + "." + m + "." + y);

    }
}
