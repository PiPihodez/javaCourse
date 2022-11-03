package lesson_03.homework_02;

import java.util.Scanner;

/*Написать программу, которая будет проверять число, которое мы подадим ей.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат в консоль.*/
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println(x * 2);
        } else if (x < 0) {
            System.out.println(x + 1);
        } else if (x == 0) {
            System.out.println(x);
        }
    }
}
