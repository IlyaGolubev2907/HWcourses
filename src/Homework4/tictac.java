package Homework4;

import java.util.Scanner;

public class tictac {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char currentPlayer = 'X';
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (true) {
            System.out.println("Текущая доска:");
            for (int i = 0; i < 3; i++) {
                System.out.print("|");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + "|");
                }
                System.out.println();
            }

            int row, col;
            while (true) {
                System.out.print("Игрок " + currentPlayer + ", введите строку и столбец (0, 1 или 2) через пробел: ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    break;
                } else {
                    System.out.println("Некорректный ход, попробуйте снова.");
                }
            }

            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                        (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                    gameWon = true;
                }
            }
            if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                    (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
                gameWon = true;
            }

            if (gameWon) {
                System.out.println("Игрок " + currentPlayer + " выиграл!");
                break;
            }

            boolean isDraw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        isDraw = false;
                    }
                }
            }
            if (isDraw) {
                System.out.println("Игра завершилась вничью!");
                break;
            }

            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }

        scanner.close();
    }
}