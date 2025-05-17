package Homework8;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
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

            String[] strings = {str1, str2, str3};
            Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());

            System.out.println("Строки в порядке возрастания:");
            for (String str : strings) {
                System.out.println( str + "(длина: " + str.length() + ")");
            }
            scanner.close();
        }
    }
