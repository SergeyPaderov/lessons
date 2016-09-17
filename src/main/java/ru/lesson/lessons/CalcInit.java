package ru.lesson.lessons;

import java.util.Scanner;

public class CalcInit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite pervoe chislo : ");
        double first = scanner.nextInt();

        System.out.print("Vvedite vtoroe chislo : ");
        double second = scanner.nextInt();

        Calculator.substruct(first, second);
        System.out.println(Calculator.result);

        Calculator.add(first, second);
        System.out.println(Calculator.result);

        Calculator.div(first, second);
        System.out.println(Calculator.result);

        Calculator.multiple(first, second);
        System.out.println(Calculator.result);
    }
}