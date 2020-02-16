package fr.spacefox.matrixsum;

import java.util.List;

public class BestRatings {

    public static int sum(List<List<Integer>> matrix) {
        int result = 0;

        for (int j  = 0; j < matrix.get(0).size(); j++) {
            for (int i  = 0; i < matrix.size(); i++) {
                if (matrix.get(i).get(j) == 0) {
                    break;
                }
                result += matrix.get(i).get(j);
            }
        }
        return result;
    }

    public static int sumArray(int[][] matrix) {
        int result = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 0) {
                    break;
                }
                result += matrix[i][j];
            }
        }
        return result;
    }
}