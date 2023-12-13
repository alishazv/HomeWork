package HW13_12_2023;

public class Ex1 {
    static double threeNumbers(double first, double second, double third) {
        return first * second * third;
    }

    static void wholePrivate(int a, int b) {
        System.out.println("Целая часть = " + a / b + " Остаток = " + a % b);
    }

}

class Ex1Test {
    public static void main(String[] args) {
        System.out.println(Ex1.threeNumbers(58, 5, 8));
        System.out.println(Ex1.threeNumbers(85, 8, 5));

        Ex1.wholePrivate(28, 12);
        Ex1.wholePrivate(49, 82);
    }
}


