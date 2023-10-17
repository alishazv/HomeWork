package HW17_10_2023;

public class Exercise1 {
    public static void main(String[] args) {

        //ex1
        int i1= 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 -l;

        System.out.println(result);


        //ex2
        int a = 5;
        System.out.println(a-- - --a + ++a + a++ + a);


        //ex3
        int b =8;
        System.out.println(++b - b++ + ++b - --b);
    }
}
