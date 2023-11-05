import java.util.Scanner;

public class ZadachaNaMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfMonth;
        String month = sc.nextLine().toLowerCase();

        switch (month) {
            case "январь":
                numOfMonth = 1;
                break;
            case "февраль":
                numOfMonth = 2;
                break;
            case "март":
                numOfMonth = 3;
                break;
            case "апрель":
                numOfMonth = 4;
                break;
            case "май":
                numOfMonth = 5;
                break;
            case "июнь":
                numOfMonth = 6;
                break;
            case "июль":
                numOfMonth = 7;
                break;
            case "август":
                numOfMonth = 8;
                break;
            case "сентябрь":
                numOfMonth = 9;
                break;
            case "октябрь":
                numOfMonth = 10;
                break;
            case "ноябрь":
                numOfMonth = 11;
                break;
            case "декабрь":
                numOfMonth = 12;
                break;
            default:
                System.out.println("Вы ввели не название месяца");
                return;
        }

        System.out.println("Месяц который вы ввели яввляется " + numOfMonth + " по счёту");
    }
}
