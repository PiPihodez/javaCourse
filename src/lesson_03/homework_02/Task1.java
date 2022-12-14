package lesson_03.homework_02;

/*Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
то треугольника с такими сторонами не существует.*/
public class Task1 {
    public static void main(String[] args) {

        int a = 15, b = 15, c = 30;

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}
