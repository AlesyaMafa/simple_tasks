package com.alesya.mafa.simpletasks.matrix;

public class Matrix {

    public static void main(String[] args) {
        int[][] pic = new int[10][10];
        for (int j = 1; j < pic.length - 1; j++) {
            int i = pic.length - 1 - j;
            pic[j][j] = 1;
            pic[i][j] = 1;
        }
        for (int[] row : pic) {
            for (int value : row)
                System.out.print(value);
            System.out.println();
        }
    }
}
