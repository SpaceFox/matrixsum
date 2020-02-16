package fr.spacefox.matrixsum;

import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Indices {

    public static int sum(List<List<Integer>> matrix) {

        List<Integer> usableColumns = IntStream.range(0, matrix.size()).boxed().collect(Collectors.toList());
        int result = 0;

        for (List<Integer> row : matrix) {
            for (int it = 0; it < usableColumns.size(); it++) {
                int i = usableColumns.get(it);
                int v = row.get(i);
                if (v == 0) {
                    usableColumns.remove(it);
                    it--;
                } else {
                    result += v;
                }
            }
        }
        return result;
    }

    public static int sumArray(int[][] matrix) {

        int[] usableColumns = IntStream.range(0, matrix.length).toArray();
        int result = 0;

        for (int[] row : matrix) {
            for (int it = 0; it < usableColumns.length; it++) {
                int i = usableColumns[it];
                int v = row[i];
                if (v == 0) {
                    usableColumns = ArrayUtils.remove(usableColumns, it);
                    it--;
                } else {
                    result += v;
                }
            }
        }
        return result;
    }
}