package HW28_11_2023_1;

import HW28_11_2023.Employee;

public class Employee3 {
    public static void main(String[] args) {

        HW28_11_2023.Employee employee1 = new HW28_11_2023.Employee(11, "Алиев", 38, 8000, "post");
        //       System.out.println(employee1.id);
        //       System.out.println(employee1.salary);  так как эта переменная приватная
        System.out.println(employee1.surname);

        employee1.showId();
        employee1.showSalary();
        employee1.showSurname();

    }

}
