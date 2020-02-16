package fr.spacefox.matrixsum;

import java.util.Arrays;
import java.util.List;

public class Branches {

    public static int sum(List<List<Integer>> matrix) {

        boolean[] usableColumns = new boolean[matrix.size()];
        Arrays.fill(usableColumns, true);
        int result = 0;

        for (List<Integer> row : matrix) {
            for (int i = 0; i != row.size(); i++) {
                if (usableColumns[i]) {
                    int v = row.get(i);
                    if (v == 0) {
                        usableColumns[i] = false;
                    } else {
                        result += v;
                    }
                }
            }
        }
        return result;
    }

    public static int sumArray(int[][] matrix) {

        boolean[] usableColumns = new boolean[matrix.length];
        Arrays.fill(usableColumns, true);
        int result = 0;

        for (int[] row : matrix) {
            for (int i = 0; i != row.length; i++) {
                if (usableColumns[i]) {
                    int v = row[i];
                    if (v == 0) {
                        usableColumns[i] = false;
                    } else {
                        result += v;
                    }
                }
            }
        }
        return result;
    }
}