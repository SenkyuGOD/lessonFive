import java.util.Scanner;

public class Zadachi21to40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //zadacha21
        System.out.print("Кто ты: мальчик или девочка? Введи Д или М");
        String gender = sc.next().toLowerCase();
        switch (gender) {
            case "д":
                System.out.println("Мне нравятся девочки!");
                break;
            case "м":
                System.out.println("Мне нравятся мальчики!");
                break;
            default:
                System.out.println("вы ввели не верные данные");
                return;
        }

        //zadacha22
        System.out.print("Введите значчение х: ");
        double x = sc.nextDouble();
        System.out.print("Введите значение y: ");
        double y = sc.nextDouble();

        x = Math.max(x, y);
        y = Math.min(x, y);

        //zadacha23
        System.out.print("какое сегодня число: ");
        int day = sc.nextInt();
        System.out.print("Какой сейчас месяц по порядку: ");
        int numberOfMoth = sc.nextInt();

        if (day > 31 || day < 0) {
            System.out.println("вы ввели некорректные данные");
        }

        if (numberOfMoth > 12 || numberOfMoth < 0) {
            System.out.println("вы ввели некорректные данные");
        }

        //zadacha24
        System.out.print("Введите количество лепестков");
        int numOfPetals = sc.nextInt();
        if (numOfPetals % 2 == 0) {
            System.out.println("Не любит");
        } else {
            System.out.println("Любит");
        }

        //zadacha25
        System.out.print("Введите температуру которую показывает датчик");
        int temperature = sc.nextInt();

        if (temperature >= 60) {
            System.out.println("Пожароопасная ситуация");
        } else {
            System.out.println("Все в норме");
        }

        //zadacha26
        System.out.print("Введите первое число: ");
        int firstNum = sc.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = sc.nextInt();
        System.out.print("Введите третье число: ");
        int thirdNum = sc.nextInt();

        int maxNum = Math.max(firstNum, Math.max(secondNum, thirdNum));
        int minNum = Math.min(firstNum, Math.min(secondNum, thirdNum));

        int result = maxNum + minNum;
        System.out.println("Сумма максимального и минимального числа = " + result);

        //zadacha27
        System.out.print("Введите число а: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();
        System.out.print("Введите число c: ");
        int c = sc.nextInt();
        System.out.print("Введите число d: ");
        int d = sc.nextInt();

        int max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(max);

        //zadacha28
        System.out.print("Введите число а: ");
        a = sc.nextInt();
        System.out.print("Введите число b: ");
        b = sc.nextInt();
        System.out.print("Введите число c: ");
        c = sc.nextInt();
        System.out.print("Введите число d: ");
        d = sc.nextInt();

        if (d == a) {
            System.out.println("Число d равно числу a");
        } else if (d == b) {
            System.out.println("Число d равно числу b");
        } else if (d == c) {
            System.out.println("Число d равно числу c");
        } else {
            a = d - a;
            b = d - b;
            c = d - c;
            max = Math.max(a, Math.max(b, c));
            System.out.println("ни одно число не равно d => max(d — a, d — b, d — c)" + max);
        }

        //zadacha29
        System.out.print("Введите через пробел значение координат точки а: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Введите через пробел значение координат точки b: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print("Введите через пробел значение координат точки c: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double A = (y2 - y1) * (x3 - x2);
        double B = (x2 - x1) * (y3 - y2);
        double C = (x3 - x2) * (y2 - y1);

        if (A == B && B == C && C == 0) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }

        //zadacha30
        System.out.print("Введите число а: ");
        a = sc.nextInt();
        System.out.print("Введите число b: ");
        b = sc.nextInt();
        System.out.print("Введите число c: ");
        c = sc.nextInt();

        if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println("Удваоенные числа а b c: " + a + " " + b + " " + c);
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
            System.out.println("Абсолютные значения a b c: " + a + " " + b + " " + c);
        }

        //zadacha31
        System.out.print("Введите сторону а в отверстии: ");
        a = sc.nextInt();
        System.out.print("Введите сторону b в отверстии:");
        b = sc.nextInt();
        System.out.print("Введите длинну x в кирпиче: ");
        x = sc.nextInt();
        System.out.print("Введите длинну y в кирпиче: ");
        y = sc.nextInt();
        System.out.print("Введите длинну z в кирпиче: ");
        int z = sc.nextInt();
        if (a > x) {
            if (b > y) {
                System.out.println("Пройдёт");
            }

            if (b > z) {
                System.out.println("Пройдёт");
            }
        } else {
            System.out.println("Не пройдёт");
        }

        if (a > y) {
            if (b > x) {
                System.out.println("Пройдёт");
            }

            if (b > z) {
                System.out.println("Пройдёт");
            }
        } else {
            System.out.println("Не пройдёт");
        }

        if (a > z) {
            if (b > y) {
                System.out.println("Пройдёт");
            }

            if (b > x) {
                System.out.println("Пройдёт");
            }
        } else {
            System.out.println("Не пройдёт");
        }

        //zadacha32
        System.out.print("Введите число а: ");
        a = sc.nextInt();
        System.out.print("Введите число b: ");
        b = sc.nextInt();
        System.out.print("Введите число c: ");
        c = sc.nextInt();
        if (a + b >= 0) {
            System.out.println("Da");
        } else if (a + c >= 0) {
            System.out.println("Da");
        } else if (b + c >= 0) {
            System.out.println("Da");
        } else {
            System.out.println("No");
        }

        //zadacha33
        System.out.print("Введите пароль: ");
        int password = sc.nextInt();

        switch (password) {
            case 9583:
            case 1747:
                System.out.println("доступны модули баз A");
                break;
            case 3331:
            case 7922:
                System.out.println("доступны модули баз B");
                break;
            case 9455:
            case 8997:
                System.out.println("доступны модули базы C");
                break;
            default:
                System.out.println("Неверный пароль");
        }

        //zadacha34
        System.out.print("Введите стоимость книги: ");
        double costOfTheBook = sc.nextDouble();
        System.out.print("Введите количество денен для оплаты книги: ");
        double costOfMoney = sc.nextDouble();

        if (costOfMoney == costOfTheBook) {
            System.out.println("Спасибо что без здачи");
        } else if (costOfMoney > costOfTheBook) {
            System.out.println("Спасибо, возьмите сдачу");
        } else {
            System.out.println("Вам не хватает " + (costOfTheBook - costOfMoney) + " для оплаты книги");
        }

        //zadacha35
        //её решение будет отдельно

        //zadacha36
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();
        double fx;

        if (x <= 3) {
            fx = Math.pow(x, 2) - 3 * x + 9;
            System.out.println("F(x) = " + fx);
        } else {
            fx = 1 / (Math.pow(x, 3) + 6);
            System.out.println("F(x) = " + fx);
        }

        //zadacha37
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();

        if (x >= 3) {
            fx = -(Math.pow(x, 2)) + 3 * x + 9;
            System.out.println("F(x) = " + fx);
        } else {
            fx = 1 / (Math.pow(x, 3) + 6);
            System.out.println("F(x) = " + fx);
        }

        //zadacha38
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();

        if (x >= 0 && x <= 3) {
            fx = Math.pow(x, 2);
            System.out.println("F(x) = " + fx);
        } else if (x > 3 || x <= 0) {
            fx = 4;
            System.out.println("F(x) = " + fx);
        }

        //zadacha39
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();

        if (x >= 8) {
            fx = -(Math.pow(x, 2)) + x - 9;
            System.out.println("F(x) = " + fx);
        } else {
            fx = 1 / (Math.pow(x, 4) + 6);
            System.out.println("F(x) = " + fx);
        }

        //zadacha40
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();

        if (x <= 13) {
            fx = -(Math.pow(x, 3)) + 9;
            System.out.println("F(x) = " + fx);
        } else {
            fx = -(1 / (x + 1));
            System.out.println("F(x) = " + fx);
        }
    }

}
