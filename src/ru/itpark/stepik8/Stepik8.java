package ru.itpark.stepik8;

import java.math.BigInteger;

public class Stepik8 {
    public static void Task8() {

        System.out.println("Sample Output 1: " + factorial(1));
        System.out.println("Sample Output 2: " + factorial(3));
    }

    public static BigInteger factorial(int value) {
        BigInteger bigInteger = BigInteger.valueOf(1);

        for (int i = 1; i <= value; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}
