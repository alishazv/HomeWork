package HW19_09_2023;

import java.util.Scanner;

public class dialog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Привет");
        System.out.println("Как тебя зовут?");
        String name = input.next();
        System.out.println("Приятно познакомиться " + name);

        System.out.println("Сколько тебе лет?");
        int age = input.nextInt();
        int month = age * 12;
        System.out.println("Круто! Это целых " + month +" месяцев");

        //String YesNo = input.next();

        /* if (YesNo == "да") {
            System.out.println(age * 12);
        } else if (YesNo == "нет") {
            System.out.println("Ну хорошо");
        }
*/
        System.out.println("Какой у тебя рост?");
        short height = input.nextShort();
        Long heightmm = height * 1000000L;
        System.out.println("Это " + heightmm + "микрометров");


        System.out.println("Какая книга твоя любимая ?(пиши одним словом)");
        String book = input.next();
        System.out.println("Вау! " + book + " Хороший выбор!");

        System.out.println("А какой твой любимый фильм? (пиши одним словом)");
        String film = input.next();
        System.out.println("А мой Гарри Поттер");
        long m = 1192L;
        long hour1 = (m / 60) % 60;
        long min1 = (m/1) % 60;
        System.out.println("Он длится :" + hour1 +"час(-ов)" + min1+"минут(-а)");
        System.out.println("Введите количество минут вашего любимого фильма или нескольких фильмов");
        long filmTime = input.nextLong();
        long s = filmTime;
        long hour = s / 60;
        long min = (s/1) % 60;
        System.out.println("Твой любимый фильм длится :" + hour +"час(-ов)" + min+"минут(-а)");

        System.out.println("Я могу вычислить сколько в километрах миллиметров и наоборот");
        System.out.println("Введи количество километров :");
        Long km = input.nextLong();
        Long mm = km * 1000000;
        System.out.println("=" + mm + "миллиметров");
        System.out.println("А теперь наоборот. Введи количество миллиметров :");
        Long mmm = input.nextLong();
        Long kkm = (mmm/1000000);
        Long met = (mmm / 1000) % 1000;
        Long mmmm = (mmm/1) % 1000;
        System.out.println("=" + kkm + " километров "+met+ " метров "+mmmm + " миллиметров");

        System.out.println("Какую цифру (для себя) ты считаешь самой счастливой ?");
        byte figure = input.nextByte();
        System.out.println(figure + " - замечательное цифра");

        System.out.println("А теперь напиши свой номер телефона (начни с 8)");
        Long phoneNumber = input.nextLong();
        System.out.println("Внимание! На вас оформлен кредит :)");
        System.out.println("Спасибо за услугу");
        System.out.println("Пока)))))))))");






    }
}
