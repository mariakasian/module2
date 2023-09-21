package com.kasian;

import java.util.Scanner;

public class ScanNumber {
    public static int n;
    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введіть ціле число:");
            n = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ви ввели невалідне число. Будь ласка, введіть ціле число.");
        }
        System.out.println("Сума арифметичної прогресії від числа " + n + " = " + new SumCalculator().sum(n));
        scanner.close();
    }
}
