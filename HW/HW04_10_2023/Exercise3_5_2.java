package HW04_10_2023;

import java.util.Scanner;

public class Exercise3_5_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt();

        // x  и у нужно вписать самостоятельно, для эффективности и мобильности программы,
        // а так же чтобы не писать несколько кодов
        // в задаче x=2 y=3, потом x=3 y=2, потом x=3, y=3

        if (x > 2)
            if (y > 2) {
                int z = x + y;
                System.out.println("z is " + z);
            } else System.out.println("x is " + x);
    }
}
