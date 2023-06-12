
/**
 * 1. Реализовать метод isPalindrome
 * Проверить, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева и справа
 * abcdedcba -> true
 * a -> true
 * abc -> false
 * abcd -> false
 * abba -> true
 */

public class Homework_s2 {

    public static void main(String[] args) {
        String[] arrStr = { "abcdedcba", "abc", "abcd", "abba", "qwq", "qwqe", "qwqw", "o", "Trort", "qwqsqwq",
                "qwqsqwqa", "9123k3219" };
        for (String s : arrStr)
            if (isPolindrom(s))
                System.out.printf("%s - полиндром \n", s);
    }

    public static boolean isPolindrom(String targetStr) {
        if (targetStr.length() == 1)
            return true;
        for (int i = 0; i < targetStr.length() / 2; i++) {
            if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
                return false;
        }
        return true;
    }

    // Второй способ

    // public static void main(String[] args) {
    // System.out.println(isPalindrome("шалаш")); // true
    // System.out.println(isPalindrome("ротор")); // true
    // System.out.println(isPalindrome("мотор")); // false
    // System.out.println(isPalindrome("арозаупаланалапуазора"));
    // }
    // public static boolean isPalindrome(String str) {
    // return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    // }
}
