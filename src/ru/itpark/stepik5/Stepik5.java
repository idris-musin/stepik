package ru.itpark.stepik5;

public class Stepik5 {
    public static void Task5() {

        System.out.println("Sample Output 1: " + charExpression(32));
        System.out.println("Sample Output 2: " + charExpression(29));
    }

    public static char charExpression(int a) {
        int s = '\\';
        return (char) (s + a);
    }
}
