package ru.itpark.stepik4;

public class Stepik4 {
    public static void Task4() {

        System.out.println("Sample Output: " + flipBit(0, 1));
    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1); // put your implementation here
    }
}
