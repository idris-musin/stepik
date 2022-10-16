package ru.itpark.stepik10;

public class Stepik10 {
    public static void Task10() {

        System.out.println("Sample Output: "
                + "\n"
                + printTextPerRole(
                new String[]{
                        "Городничий",
                        "Аммос Федорович",
                        "Артемий Филиппович",
                        "Лука Лукич"},
                new String[]{
                        "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                        "Аммос Федорович: Как ревизор?",
                        "Артемий Филиппович: Как ревизор?",
                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                        "Аммос Федорович: Вот те на!",
                        "Артемий Филиппович: Вот не было заботы, так подай!",
                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"}));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();

        for (String name : roles) {
            result.append(name).append(":").append("\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(name.concat(":"))) {
                    result.append(j + 1).append(") ").append(textLines[j].
                            replaceFirst(name + ": ", "")).append("\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
