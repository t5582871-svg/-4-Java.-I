package ru.qaguru;

public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        double c = 1.5;

        //Арифметические операции с примитавми int
        System.out.println("Арифметические операции");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        System.out.println("Арифметических операций над int и double в одном выражении");
        System.out.println("a + c = " + (a + c));
        System.out.println("a - c = " + (a - c));
        System.out.println("a * c = " + (a * c));
        System.out.println("a - c = " + (a / c));

        //Логические операции с примитавми int
        System.out.println("Логические операции");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        //Переполнение при арифметической операции
        System.out.println("Переполнение при арифметической операции ");
        int d = Integer.MAX_VALUE;
        System.out.println("Переполнение Integer " + (d + 1));
        int e = Integer.MIN_VALUE;
        System.out.println("Переполнение Integer " + (e - 1));
        float f = Float.MAX_VALUE;
        System.out.println("Переполнение Float " + (f * f));
        double g = Double.MAX_VALUE;
        System.out.println("Переполнение Double " + (g * g));

    }
}
