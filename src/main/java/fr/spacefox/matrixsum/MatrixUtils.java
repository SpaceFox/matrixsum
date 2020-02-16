package fr.spacefox.matrixsum;

import java.util.*;

public class MatrixUtils {

    private Long seed;
    private Map<Integer, List<List<Integer>>> cache = new HashMap<>();

    List<List<Integer>> randomMatrix(int size) {
        var it = cache.get(size);
        if (it != null) {
            return it;
        }

        Random rg = seed == null ? new Random() : new Random(seed);

        final int maxValue = 100;

        List<List<Integer>> matrix = new ArrayList<>(size);

        for (int y = 0; y != size; y++) {
            List<Integer> row = new ArrayList<>(size);

            for (int x = 0; x != size; x++) {
                row.add(x, rg.nextInt(size) >= y ? (1 + rg.nextInt(maxValue - 1)) : 0);
            }
            matrix.add(y, row);
        }

        cache.put(size, matrix);

        return matrix;
    }

    int[][] matrixListToArray(List<List<Integer>> matrixList) {
        int size = matrixList.size();
        int[][] matrixArray = new int[size][size];
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                matrixArray[j][i] = matrixList.get(j).get(i);
            }
        }
        return matrixArray;
    }
}
