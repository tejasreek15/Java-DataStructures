package com.example;

import java.util.Arrays;

public class The2DArrays {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                    board[i][j] = '-';
                }
            }
        board[0][0] = 'o';
        board[1][0] = 'o';
        board[2][0] = 'o';

        char[][] board2 = new char[][] {
                new char[]{'o', '-', '-'},
                new char[]{'o', '-', '-'},
                new char[]{'o', '-', '-'}
        };

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(board2));
    }
}
