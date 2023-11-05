import java.util.Scanner;

public class Zadacha35 {
    public static void calculateDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любой номер дня ");
         int dayNumber = sc.nextInt();
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dayNumber < 1 || dayNumber > 365) {
            System.out.println("Некорректный номер дня");
            return;
        }

        int month = 1;
        while (dayNumber > daysInMonth[month]) {
            dayNumber -= daysInMonth[month];
            month++;
        }

        System.out.println("День номер " + dayNumber + " это " + dayNumber + " " + getMonthName(month));
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"", "Января", "Февраля", "Марта", "Апреля", "Мая", "Июня", "Июля", "Августа", "Сентября", "Октября", "Ноября", "Декабря"};
        return monthNames[month];
    }


}
