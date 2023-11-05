import java.util.Scanner;

public class TasksForCycles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //zadacha1
        double num = 1;

        while (num < 6) {
            System.out.println(num + " ");
            num++;
        }

        //zadacha2
        num = 5;

        while (num > 0) {
            System.out.println(num);
            num--;
        }

        //zadacha3

        double numMultipliedBy3;
        num = 1;

        while (num < 11) {
            numMultipliedBy3 = num * 3;
            System.out.println(numMultipliedBy3);
            num++;
        }

        //zadacha4
        num = 2;

        while (num < 101) {
            System.out.println(num);
            num += 2;
        }

        //zadacha5 (имеет отдельный класс)

        //zadacha6
        System.out.print("Введите положительное число: ");
        int a = sc.nextInt();
        num = 1;
        double sum = 0;

        while (num <= a) {
            sum += num;
            num++;
        }
        System.out.println(sum);

        //zadacha9
        double number = 1;
        sum = 0;
        double numInSquare;

        while (number < 101) {
            numInSquare = Math.pow(number, 2);
            sum += (int) numInSquare;
            number++;
        }
        System.out.println(sum);

        //zadacha10
        number = 1;
        sum = 0;

        while (number < 201) {
            numInSquare = Math.pow(number, 2);
            sum += (int) numInSquare;
            number++;
        }
        System.out.println(sum);

        //zadacha11
        double n = 200;
        long sumOfCubedDifferences = 0;

        for (int i = 1; i <= n; i++) {
            long cube = (long) Math.pow(i, 3);
            sumOfCubedDifferences -= cube;
        }
        System.out.println(sumOfCubedDifferences);

        //zadacha12
        n = 10;
        double product = 1;
        long an = 1;

        for (int i = 2; i <= n; i++) {
            an = 6 + (an - 1);
            product *= an;
        }
        System.out.println(product);

        //zadacha13
        double y;

        for (double x = -5; x <= 5; x += 0.5) {
            y = 5 - Math.pow(x, 2) / 2;
            System.out.println("x = " + x + ", y = " + y);
        }

        //zadacha14
        n = sc.nextDouble();
        num = 1;
        sum = 0;

        while (num <= n) {
            sum = sum + (1 / num);
            num++;
        }

        //zadacha15
        n = 10;
        sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println(sum);

        //zadacha16
        num = 1;
        sum = 0;
        product = 1;

        for (int i = 2; i <= 10; i++) {
            sum += i;
            product *= (num + sum);
        }
        System.out.println(product);

        //zadacha17
        System.out.print("Введите действительное число: ");
        double A = sc.nextDouble();
        System.out.print("Введите натуральное число: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            product *= (A + i);
        }
        System.out.println(product);

        //zadacha25
        System.out.print("Введите целое число: ");
        a = sc.nextInt();
        sum = 1;

        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        System.out.println(sum);

        //zadacha21
        System.out.print("Введите значение а: ");
        A = sc.nextDouble();
        System.out.print("Введите значение b: ");
        double b = sc.nextDouble();
        double h = 0.1;
        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("---------------------------------");

        for (double x = A; x <= b; x = x + h) {
            y = x - Math.sin(x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println("---------------------------------");

        //zadacha22
        System.out.print("Введите значение а: ");
        A = sc.nextDouble();
        System.out.print("Введите значение b: ");
        b = sc.nextDouble();
        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("---------------------------------");

        for (double x = A; x <= b; x = x + h) {
            y = Math.pow(Math.sin(x), 2);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println("---------------------------------");

        //zadacha23
        System.out.print("Введите значение а: ");
        A = sc.nextDouble();
        System.out.print("Введите значение b: ");
        b = sc.nextDouble();
        System.out.println("---------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("---------------------------------");

        for (double x = A; x <= b; x = x + h) {
            y = (1 / (Math.tan(x / 3))) + 0.5 * (Math.sin(x));
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }
        System.out.println("---------------------------------");

        //zadacha29
        System.out.print("Введите целое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = sc.nextInt();
        int buff1;
        int buff2;

        while (num1 > 0) {
            buff1 = num1 % 10;
            num1 /= 10;
            System.out.print(buff1 + " ");
        }

        System.out.println();
        while (num2 > 0) {
            buff2 = num2 % 10;
            num2 /= 10;
            System.out.print(buff2 + " ");
        }

        
    }

}

