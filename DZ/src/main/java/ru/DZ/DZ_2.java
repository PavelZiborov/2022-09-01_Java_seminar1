package ru.DZ;

public class DZ_2 {
    public static void main(String[] args) {
//        2. Напишите функцию, для поиска наиболее длинного общего префикса,
//        среди массива строк. Если общего префикса нет, то возвращать пустую строку.
//        Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"

        String[] stringArray = {"aabb", "aabbb", "aaabb"};
        String result = longestCommonPrefix(stringArray);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] s) {
        if (s.length == 0) return "";

        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals("")) return "";
            }
        }
        return prefix;
    }
}
