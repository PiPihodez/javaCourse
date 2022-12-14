package lesson_03.homework_02;

import java.util.Scanner;

/*Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
, будет определять количество дней в году. Результат вывести на экран в следующем виде:
количество дней в этом году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.

Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.*/
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int x = sc.nextInt();

        if (x % 400 == 0) {
            System.out.println("кол-во дней: 366");
        } else if (x % 100 == 0){
            System.out.println("кол-во дней: 365");
        } else if (x % 4 == 0){
            System.out.println("кол-во дней: 366");
        } else {
            System.out.println("кол-во дней: 365");
        }
    }
}