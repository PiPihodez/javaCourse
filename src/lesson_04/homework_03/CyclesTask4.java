package lesson_04.homework_03;

import java.util.Scanner;

/*Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
   int number = считываем число;
   if (проверяем, что number -1)
       break;
}

*/
public class CyclesTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b = 0;

        while (true) {
            a = sc.nextInt();
            if (a != -1) {
                b = b + a;
            } else if (a == -1) {
                System.out.println("Вы ввели: " + a);
                b = b + a;
                break;
            }
        }
        System.out.println("Сумма: " + b);
    }
}

