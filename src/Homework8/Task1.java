package Homework8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите 2 строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите 3 строку:");
        String str3 = scanner.nextLine();

        String shortest = str1;
        String longest = str1;

        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str2.length() > longest.length()) {
            longest = str2;
        }

        if (str3.length() < shortest.length()) {
            shortest = str3;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        System.out.println("Самая короткая строка: " + shortest +  " (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная строка: " + longest +  " (длина: " + longest.length() + ")");

        scanner.close();
    }
}
