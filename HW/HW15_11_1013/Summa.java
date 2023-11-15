package HW15_11_1013;

public class Summa {
    int sum() {
        int result = 0;
        System.out.println(result);
        return result;
    }
    int sum(int a) {
        int result = a;
        System.out.println(result);
        return result;
    }
    int sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }
    int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }
    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println(result);
        return result;
    }
}
class summaTest{
    public static void main(String[] args) {
        Summa s = new Summa();
        s.sum();
        s.sum(175);
        s.sum(175,758);
        s.sum(175,758,11);
        s.sum(175,758,11,76);

    }
}
