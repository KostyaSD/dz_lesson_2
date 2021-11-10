package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        System.out.println(number(2,3));
        System.out.println(positiveAndNegative(0));
        System.out.println(booleanPositiveAndNegative(-2));
        stringAndNumber("hello world", 2);
        System.out.println(leapYear(400));
     }

/* 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean number(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else return false;
    }

/* 2. Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.*/

    public static String positiveAndNegative(int a) {
        if (a >= 0) {
            return "число положительное";
        } else return "число отрицательное";
    }

/* 3. Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

    public static boolean booleanPositiveAndNegative(int a) {
        if (a >= 0) {
            return false;
        } else return true;
    }

/* 4. Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз.*/

    public static void stringAndNumber(String text, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

/* 5. * Написать метод, который определяет, является ли год високосным,
и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else return false;
    }
}
