package HW04_10_2023;

import java.util.Scanner;

public class Exercise3_3_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radius = s.nextInt();
        double area = 0, PI = 3.1415926535;
// правильный код
        if (radius >= 0) {
            area = radius * radius * PI;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }

    }
}
