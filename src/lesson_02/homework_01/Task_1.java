package lesson_02.homework_01;

public class Task_1 {
    //    Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?

    public static void main(String[] args) {

        int sum = 5;
        float kassa1;
        float kassa2;
        kassa1 = (float) sum / 2;
        kassa2 = kassa1;

        System.out.println("В первой кассе лежит " + kassa1 + "руб.");
        System.out.println("Во второй кассе лежит " + kassa2 + "руб.");

    }
}
