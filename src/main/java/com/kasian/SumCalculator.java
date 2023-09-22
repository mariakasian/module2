package com.kasian;

public class SumCalculator {

    public int sum(int n) throws IllegalArgumentException {

        if (n <= 0 || n > 65535) {
            System.out.println("\u0412\u0438 \u0432\u0432\u0435\u043B\u0438 \u043D\u0435\u0432\u0430\u043B\u0456\u0434\u043D\u0435 \u0447\u0438\u0441\u043B\u043E. \u0411\u0443\u0434\u044C \u043B\u0430\u0441\u043A\u0430, \u0432\u0432\u0435\u0434\u0456\u0442\u044C \u0446\u0456\u043B\u0435 \u0447\u0438\u0441\u043B\u043E \u0432 \u043C\u0435\u0436\u0430\u0445 \u0432\u0456\u0434 1 \u0434\u043E 65535 \u0432\u043A\u043B\u044E\u0447\u043D\u043E.");
            throw new IllegalArgumentException("\u0412\u0438 \u0432\u0432\u0435\u043B\u0438 \u043D\u0435\u0432\u0430\u043B\u0456\u0434\u043D\u0435 \u0447\u0438\u0441\u043B\u043E.");
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}



