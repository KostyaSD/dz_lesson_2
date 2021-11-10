package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        System.out.println(number(2,3));
        System.out.println(positiveAndNegative(0));
        System.out.println(booleanPositiveAndNegative(-2));
    }

/* 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean number(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
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
}
