package HW13_12_2023;

public class Ex2 {
    public final static double Pi = 3.14;
    public double area(double radius){
        double area = Pi * radius * radius;
        return area;
    }
    public static double length(double radius){
        double length = 2* Pi * radius;
        return length;
    }
    public void info(double radius){
        System.out.println(radius);
        System.out.println(area(radius));
        System.out.println(length(radius));
    }
}
class Ex2Test{
    public static void main(String[] args) {
        Ex2 exercise = new Ex2();
        exercise.area(25);
        Ex2.length(4);
        exercise.info(58);
    }
}
