package Homework8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите 2 строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите 3 строку:");
        String str3 = scanner.nextLine();

        String[] words = (str1 + " " + str2 + " " + str3).split("\s+");

        String firstUniqueWord = null;
        for (String word : words) {
            if (isUniqueCharacters(word)) {
                firstUniqueWord = word;
                break;
            }
        }

        if (firstUniqueWord != null) {
            System.out.println("Слово с уникальными символами: " + firstUniqueWord);
        } else {
            System.out.println("Нет слов с уникальными символами.");
        }

        scanner.close();
    }

    public static boolean isUniqueCharacters(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
