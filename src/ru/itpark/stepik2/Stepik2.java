package ru.itpark.stepik2;

public class Stepik2 {
    public static void Task2() {

        System.out.println("Sample Output 1: " + leapYearCount(1));
        System.out.println("Sample Output 2: " + leapYearCount(4));
        System.out.println("Sample Output 3: " + leapYearCount(100));
    }

    public static int leapYearCount(int year) {
        return year/4 - year/100 + year/400;
    }

}
