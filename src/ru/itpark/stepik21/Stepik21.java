package ru.itpark.stepik21;

public class Stepik21 {
    public static void Task1() {

        System.out.println("Sample Output 1: " + booleanExpression(false, false, false, false));
        System.out.println("Sample Output 2: " + booleanExpression(true, true, true, true));
        System.out.println("Sample Output 3: " + booleanExpression(false, false, true, true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (b ^ c));
    }
}
