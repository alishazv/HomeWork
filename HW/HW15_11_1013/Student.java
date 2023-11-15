package HW15_11_1013;

public class Student {
    int studentID;
    String name;
    String surname;
    int studYear;
    double averageMathGrade;
    double averageEconomicGrade;
    double averageLanguageGrade;

    Student(int id1, String name1, String surname1, int yearStudy1, double averageMathGrade1, double averageEconomicGrade1, double averageLanguageGrade1) {
        studentID = id1;
        name = name1;
        surname = surname1;
        studYear = yearStudy1;
        averageMathGrade = averageMathGrade1;
        averageEconomicGrade = averageEconomicGrade1;
        averageLanguageGrade = averageLanguageGrade1;
    }

    Student(int id2, String name2, String surname2, int studYear2) {
        this(id2, name2, surname2, studYear2, 0, 0, 0);

    }

    Student() {
    }

    public void averageGrade() {
        System.out.println((averageEconomicGrade + averageMathGrade + averageLanguageGrade) / 3);
    }

}

class StudentTest {
    double averageGrade(Student student) {
        double Grade = (student.averageMathGrade + student.averageEconomicGrade + student.averageLanguageGrade) / 3;
        System.out.println(Grade);
        return Grade;
    }

    public static void main(String[] args) {

        Student studentFirst = new Student();
        studentFirst.studentID = 1;
        studentFirst.name = "Андрей";
        studentFirst.surname = "Степанов";
        studentFirst.studYear = 2018;
        studentFirst.averageMathGrade = 4.8;
        studentFirst.averageEconomicGrade = 4.6;
        studentFirst.averageLanguageGrade = 5.0;


        Student studentSecond = new Student(5,"Александр","Лампочкин",2023);
        studentSecond.averageMathGrade = 5.0;
        studentSecond.averageEconomicGrade = 4.7;
        studentSecond.averageLanguageGrade = 3.4;

        Student studentThird = new Student(3,"Галина","Бабенко",1982, 4.8, 3.5,2.8);


        studentFirst.averageGrade();
        studentSecond.averageGrade();
        studentThird.averageGrade();


    }
}