package ru.itpark.stepik6;

public class Stepik6 {
    public static void Task6(){

        System.out.println("Sample Output 1: " + isPowerOfTwo(0));
        System.out.println("Sample Output 2: " + isPowerOfTwo(1));
        System.out.println("Sample Output 3: " + isPowerOfTwo(-2));
    }

    public static boolean isPowerOfTwo(int value) {
        int i = Math.abs(value);
        return ((i & (i-1)) == 0) && (i != 0);
    }
}
