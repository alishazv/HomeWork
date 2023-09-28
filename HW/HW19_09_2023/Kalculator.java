package HW19_09_2023;

import java.util.Scanner;

public class Kalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Вас приветствует программа для подщета количество часов и минут из секунд ");
        System.out.println("Введите количество секунд:");
        long s = input.nextInt();

        long hours = (s / 60) / 60;
        long min = (s / 60) % 60;
        long sec = s % 60;
        System.out.println(hours + "час(-ов)" + min + "минут(-а)" + sec + "секунд(-а)");
    }
}
