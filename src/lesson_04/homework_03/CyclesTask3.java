package lesson_04.homework_03;

import java.util.Scanner;

/*Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.*/
public class CyclesTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b && a < c || a < b && a > c) {
            System.out.println(a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println(b);
        } else if (c > a && c < b || c < a && c > b){
            System.out.println(c);
        } else {
            System.out.println(a);
        }
    }
}
