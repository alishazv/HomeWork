package HW10_11_2023;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double salaryIncrease() {
        salary *= 2.0;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11,"Алиев", 38,8000,"post");
        employee1.salary = 8000.00;
        employee1.salaryIncrease();

        Employee employee2 = new Employee(58, "Бабкина", 79,5683.23,"policeman");
        employee2.salary = 5683.23;
        employee2.salaryIncrease();

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
    }
}


