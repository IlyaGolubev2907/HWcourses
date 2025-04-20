package Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int massSize = scanner.nextInt();

        int[] mass = new int[massSize];
        for (int i = 0; i < massSize; i++) {
            mass[i] = (int) (Math.random() * 100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(mass));

        System.out.print("Массив в обратном порядке: ");
        for (int i = massSize - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        System.out.println();
        int min = mass[0];
        for (int i = 1; i < massSize; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Минимальное значение: " + min);

        int max = mass[0];
        for (int i = 1; i < massSize; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println();

        int index_min = 0;
        for (int i = 0; i < massSize; i++) {
            if (mass[i] == min) {
                index_min = i;
            }
        }
        System.out.print("Минимальное значение индекса: " + index_min);
        System.out.println();

        int index_max = 0;
        for (int i = 0; i < massSize; i++) {
            if (mass[i] == max) {
                index_max = i;
            }
        }
        System.out.print("Максимальное значение индекса: " + index_max);
        System.out.println();

        System.out.println();
        int nills = 0;
        for (int i = 0; i < massSize; i++) {
            if (mass[i] == 0) {
                nills++;
            }
        }
        if (nills > 0) {
            System.out.println("Нулевых значений: " + nills);
        } else {
            System.out.println("Нулевые значения отсутствуют");
        }
        System.out.println();

        for (int i = 0; i < massSize / 2; i++) {
            int a = mass[i];
            mass[i] = mass[(massSize - 1) - i];
            mass[(massSize - 1) - i] = a;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();

        boolean isAscend = true;
        for (int i = 1; i < massSize; i++) {
            if (mass[i] <= mass[i - 1]) {
                isAscend = false;
                break;
            }
        }
        if (isAscend) {
            System.out.println("Массив возрастающая последовательность");
        } else {
            System.out.println("Массив не возрастающая последовательность");
        }
        scanner.close();
    }
}
