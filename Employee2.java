package HW28_11_2023;

public class Employee2 {

    public static void main(String[] args) {

        Employee employee1 = new Employee(58, "Бабкина", 79, 5683.23, "policeman");

        System.out.println(employee1.id);
//        System.out.println(employee1.salary);  так как эта переменная приватная
        System.out.println(employee1.surname);

        employee1.showId();
        employee1.showSalary();
        employee1.showSurname();

    }
}