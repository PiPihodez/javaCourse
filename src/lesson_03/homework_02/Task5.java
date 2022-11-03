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

        switch (month) {
            case (1):
                System.out.println("Зима");
                break;
            case (2):
                System.out.println("Зима");
                break;
            case (3):
                System.out.println("Весна");
                break;
            case (4):
                System.out.println("Весна");
                break;
            case (5):
                System.out.println("Весна");
                break;
            case (6):
                System.out.println("Лето");
                break;
            case (7):
                System.out.println("Лето");
                break;
            case (8):
                System.out.println("Лето");
                break;
            case (9):
                System.out.println("Осень");
                break;
            case (10):
                System.out.println("Осень");
                break;
            case (11):
                System.out.println("Осень");
                break;
            case (12):
                System.out.println("Зима");
                break;
            default:
                System.out.println("Неправльное число");
                break;
        }

    }
}
