package HW04_10_2023;

import java.util.Scanner;

public class Exercise3_5_3 {
    public static void main(String[] args) {
        // нужно дописать еще одно условие в оператор, то есть поставить ограничения оценки
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if (score >= 60 && score <= 70)
            System.out.println("D");
        else if (score >= 70 && score <= 80)
            System.out.println("C");
        else if (score >= 80 && score <= 90)
            System.out.println("B");
        else if (score >= 90)
            System.out.println("A");
        else
            System.out.println("F");
    }
}
