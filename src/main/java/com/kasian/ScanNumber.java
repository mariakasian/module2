package com.kasian;

import java.util.Scanner;

public class ScanNumber {
    public static int n;
    public static void scan() throws NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\u0412\u0432\u0435\u0434\u0456\u0442\u044C \u0446\u0456\u043B\u0435 \u0447\u0438\u0441\u043B\u043E:");
            n = scanner.nextInt();
            System.out.println("\u0421\u0443\u043C\u0430 \u0430\u0440\u0438\u0444\u043C\u0435\u0442\u0438\u0447\u043D\u043E\u0457 \u043F\u0440\u043E\u0433\u0440\u0435\u0441\u0456\u0457 \u0432\u0456\u0434 \u0447\u0438\u0441\u043B\u0430 " + n + " = " + new SumCalculator().sum(n));
        } catch (java.util.InputMismatchException e) {
            throw new NoSuchElementException();
        }
        scanner.close();
    }
}

class NoSuchElementException extends Exception {
    NoSuchElementException() {
        super("\u0412\u0438 \u0432\u0432\u0435\u043B\u0438 \u043D\u0435\u0432\u0430\u043B\u0456\u0434\u043D\u0435 \u0447\u0438\u0441\u043B\u043E. \u0411\u0443\u0434\u044C \u043B\u0430\u0441\u043A\u0430, \u0432\u0432\u0435\u0434\u0456\u0442\u044C \u0446\u0456\u043B\u0435 \u0447\u0438\u0441\u043B\u043E.");
    }
}