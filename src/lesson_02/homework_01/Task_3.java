package lesson_02.homework_01;

public class Task_3 {
    //Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
    //насколько быстрее голодный Вася съедает один банан?
    public static void main(String[] args) {
        int hungry_min = 9 / 3;
        int full_min = 15 / 3;
        int result = full_min - hungry_min;
        System.out.println("Голодный Вася съедает один банан на " + result + " минуты быстрее");



    }
}
