package lesson9;

import java.util.Random;

public class arraylesson9 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        Random random = new Random();


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("Матрица 4х4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int sumRow0 = 0;
        int sumRow2 = 0;


        for (int j = 0; j < matrix[0].length; j++) {
            sumRow0 += matrix[0][j];
        }


        for (int j = 0; j < matrix[2].length; j++) {
            sumRow2 += matrix[2][j];
        }


        int totalSum = sumRow0 + sumRow2;
        System.out.println("Сумма элементов в четных строках (строка 0, 2): " + totalSum);

        int sumRow1 = 0;
        int sumRow3 = 0;


        for (int i = 0; i < matrix[1].length; i++) {
            sumRow1 += matrix[1][i];
        }


        for (int i = 0; i < matrix[3].length; i++) {
            sumRow3 += matrix[3][i];
        }

        int totalSum1 = sumRow1 + sumRow3;
        System.out.println("Сумма элементов в нечетных строках (строка 1, 3): " + totalSum1);


        long product = 1;


        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i].length > 2) {
                product = product * matrix[i][0] * matrix[i][2];
            }
        }

        System.out.println("Произведение элементов в четных столбцах (столбец 0, 2): " + product);


        long product1 = 1;


        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i].length > 2) {
                product1 = product1 * matrix[i][1] * matrix[i][3];
            }
        }

        System.out.println("Произведение элементов в нечетных столбцах (столбец 1, 3): " + product1);

        if (isMagicSquare(matrix)) {
            System.out.println("Матрица является магическим квадратом.");
        } else {
            System.out.println("Матрица НЕ является магическим квадратом.");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;


        for (int[] row : matrix) {
            if (row.length != n) {
                return false;
            }
        }

        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }


        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }


        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }


        int diag1Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += matrix[i][i];
        }
        if (diag1Sum != magicSum) {
            return false;
        }


        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag2Sum += matrix[i][n - i - 1];
        }
        if (diag2Sum != magicSum) {
            return false;
        }

        return true;

    }
}
