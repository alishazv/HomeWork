package HW04_10_2023;

import java.util.Scanner;

public class Exercise3_4_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введи балл");
        int score = s.nextInt();

        System.out.println("Введи оплату");
        int pay = s.nextInt();

        if (score>90){
            pay = pay+((pay/100)*3);
            System.out.println(pay);
        } else {
            pay = pay+((pay/100)*1);
            System.out.println(pay);
        }
    }
}
