package Homework8;

import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            StringBuilder result = new StringBuilder();

            for (char c : input.toCharArray()) {
                result.append(c).append(c);
            }
            System.out.println("Результат: " + result);
        }
    }
