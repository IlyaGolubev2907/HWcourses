package Homework8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите 2 строку:");
        String str2 = scanner.nextLine();
        System.out.println("Введите 3 строку:");
        String str3 = scanner.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        double averageLength = (len1 + len2 + len3) / 3.0;

        System.out.println("Строки с длиной меньше средней (" + averageLength + "):");
        if (len1 < averageLength) {
            System.out.println(str1 + " (длина: " + len1 + ")");
        }
        if (len2 < averageLength) {
            System.out.println(str2 + " (длина: " + len2 + ")");
        }
        if (len3 < averageLength) {
            System.out.println(str3 + " (длина: " + len3 + ")");
        }
        scanner.close();
    }
}
