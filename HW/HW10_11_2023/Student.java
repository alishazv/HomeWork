package HW10_11_2023;

public class Student {

    int studentID;
    String name;
    String surname;
    int yearStudy;
    double averageMathGrade;
    double averageEconomicGrade;
    double averageLanguageGrade;

    class StudentTest {
        double averageGrade(Student student) {
            double midGrade = (student.averageMathGrade + student.averageEconomicGrade + student.averageLanguageGrade) / 3;
            System.out.println(midGrade);
            return midGrade;
        }

        public static void main(String[] args) {

            Student studentFirst = new Student();
            studentFirst.studentID = 1;
            studentFirst.name = "Андрей";
            studentFirst.surname = "Степанов";
            studentFirst.yearStudy = 2018;
            studentFirst.averageMathGrade = 4.8;
            studentFirst.averageEconomicGrade = 4.6;
            studentFirst.averageLanguageGrade = 5.0;


            Student studentSecond = new Student();
            studentSecond.studentID = 5;
            studentSecond.name = "Александр";
            studentSecond.surname = "Лампочкин";
            studentSecond.yearStudy = 2023;
            studentSecond.averageMathGrade = 5.0;
            studentSecond.averageEconomicGrade = 4.7;
            studentSecond.averageLanguageGrade = 3.4;

            Student studentThird = new Student();
            studentThird.studentID = 3;
            studentThird.name = "Галина";
            studentThird.surname = "Бабенко";
            studentThird.yearStudy = 1982;
            studentThird.averageMathGrade = 4.8;
            studentThird.averageEconomicGrade = 3.5;
            studentThird.averageLanguageGrade = 2.8;
/*
            StudentTest studTest = new StudentTest();
            studTest.averageGrade(studentFirst);
            studTest.averageGrade(studentSecond);
            studTest.averageGrade(studentThird);



 */
        }
    }
}

//я сижу над этим уже несколько часов, просто не понимаю что не так