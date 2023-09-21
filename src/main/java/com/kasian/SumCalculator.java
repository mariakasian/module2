package com.kasian;

public class SumCalculator {

    public int sum(int n) throws IllegalArgumentException {

        if (n <= 0 || n > 65535) {
            throw new IllegalArgumentException("Ви ввели невалідне число.");
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}



