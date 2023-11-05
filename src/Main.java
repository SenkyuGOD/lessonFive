import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        System.out.print("Введите вещественное число: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Вы ввели не вещественное число.");
            System.out.println("Пожалуйста повторите: ");
        }

        num1 = sc.nextDouble();

        System.out.print("Введите второе вещественное число: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Вы ввели не вещественное число.");
            System.out.println("Пожалуйста повторите: ");
        }

        num2 = sc.nextDouble();

        double sum = num1 + num2;

        System.out.println("Сумма двух вещественных чисел равна: " + sum);
    }
}