package ru.itpark.stepik3;

public class Stepik3 {
    public static void Task3() {

        System.out.println("Sample Output: " + doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return ((a + b - c) > -0.0001) & ((a + b - c) < 0.0001);
    }

}
