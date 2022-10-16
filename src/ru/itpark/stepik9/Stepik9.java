package ru.itpark.stepik9;

import java.util.Arrays;

public class Stepik9 {
    public static void Task9() {

        System.out.println("Sample Output: " + Arrays.toString(mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] sum = new int[a1.length + a2.length];

        for (int i = 0, j = 0, k = 0; k < (sum.length); k++) {

            if (i > a1.length - 1) {
                sum[k] = a2[j];
                j++;
            } else if (j > a2.length - 1) {
                sum[k] = a1[i];
                i++;
            } else if (a1[i] < a2[j]) {
                sum[k] = a1[i];
                i++;
            } else {
                sum[k] = a2[j];
                j++;
            }
        }
        return sum;
    }
}
