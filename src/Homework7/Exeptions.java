package Homework7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tryCatch(scanner);
        tryCatch2(scanner);
        tryCatchMulti(scanner);
        catchFinally(scanner);
    }

    static void tryCatch(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Метод 1. Введите делимое: ");
                int a = scanner.nextInt();

                System.out.println("Метод 1. Введите делитель: ");
                int b = scanner.nextInt();

                int result = a / b;
                System.out.println("Метод 1. Результат: " + result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Метод 1. Введено не число. Попробуйте снова.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Метод 1. Нельзя делить на ноль. Попробуйте снова.");
            }
        }
    }

    static void tryCatch2(Scanner scanner) {
        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.println("Метод 2. Введите делимое: ");
                a = scanner.nextInt();

                System.out.println("Метод 2. Введите делитель: ");
                b = scanner.nextInt();

                int result = a / b;
                System.out.println("Метод 2. Результат: " + result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Метод 2. Введено не число. Попробуйте снова.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Метод 2. Нельзя делить на ноль. Попробуйте снова.");
            }
        }
    }

    static void tryCatchMulti(Scanner scanner) {
        int[] mass = {1, 2, 3, 4, 5};

        while (true) {
            try {
                System.out.println("Метод 3. Введите элемент массива от 0 до 4: ");
                int c = scanner.nextInt();
                System.out.println("Метод 3. Элемент массива: " + mass[c]);
                break;
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Метод 3. Ошибка. Попробуйте снова.");
                scanner.next();
            }
        }
    }

    static void catchFinally(Scanner scanner) {
            try {
                System.out.println("Метод 4. Введите делимое: ");
                int a = scanner.nextInt();

                System.out.println("Метод 4. Введите делитель: ");
                int b = scanner.nextInt();

                int result = a / b;
                System.out.println("Метод 4. Результат: " + result);

            } catch (InputMismatchException e) {
                System.out.println("Метод 4. Введено не число. Попробуйте снова.");
            } catch (ArithmeticException e) {
                System.out.println("Метод 4. Нельзя делить на ноль.");
            } finally {
                System.out.println("Завершение работы.");
            }
        }
    }
