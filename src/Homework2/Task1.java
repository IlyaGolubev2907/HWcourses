package Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();

            if (a % 2 != 0) {
                System.out.println("Число нечетное");
            } else {
                System.out.println("Число четное");
            }
        } else {
            System.out.println("Введите целое число");
        }
        scanner.close();
    }
}
