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
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));

        for (int i = 0; i < mass.length - 1; i++) {
            for(int j = i + 1; j < mass.length; j++) {
                if(mass[i] < mass[j]) {
                    int temp = mass [i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
