package HW28_11_2023;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public void showSalary() {
        System.out.println(salary);
    }

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }


    Employee(int id, String surname, int age, String department) {
        this(id, surname, age, 0.0, department);
    }

    private Employee(String surname, int age) {
        this(0, surname, age, 0.0, null);
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11, "Алиев", 38, 8000, "post");

        Employee employee2 = new Employee(58, "Бабкина", 79, 5683.23, "policeman");

        employee1.showId();
        employee1.showSalary();
        employee1.showSurname();

        employee1.showId();
        employee2.showSalary();
        employee2.showSurname();

    }
}
