package ru.itpark.stepik7;

public class Stepik7 {
    public static void Task7() {

        System.out.println("Sample Output: " + isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        String reverseText = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder stringBuilder = new StringBuilder(reverseText);

        return reverseText.equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}
