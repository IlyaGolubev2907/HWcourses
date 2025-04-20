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
        } //Создаем массив и заполняем случайными значениями

        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass); //Соритровка по возрастанию
        System.out.println(Arrays.toString(mass));

        int[] mass1 = Arrays.copyOf(mass, massSize); //Копия отсортированного по возрастанию массива
        // из него буду выводить мин и макс значения массива

        for (int i = 0; i < massSize - 1; i++) {
            for(int j = i + 1; j < massSize; j++) {
                if(mass[i] < mass[j]) {
                    int temp = mass [i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mass)); // Сортировка по убыванию

        int min = mass1[0];
        int max = mass1[massSize - 1];

        System.out.println(min);
        System.out.println(max); // Вывод мин и макс значений в отсортированном массиве

        int indexMin = Arrays.binarySearch(mass1, min);
        int indexMax = Arrays.binarySearch(mass1, max);

        System.out.println(indexMin);
        System.out.println(indexMax); // Вывод индексов мин и макс элементов в отсортированном массиве
    }
}
