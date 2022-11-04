package lesson_03.homework_02;

import java.util.Scanner;

/*Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна*/
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int month = sc.nextInt();

        if (month == 12  || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month >= 3 && month < 6) {
            System.out.println("Весна");
        } else if (month >= 6 && month < 9) {
            System.out.println("Лето");
        } else if (month >= 9 && month < 12)
            System.out.println("Осень");

    }
}
