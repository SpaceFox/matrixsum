package fr.spacefox.matrixsum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndicesTest {

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 })
    void sum(int size) {
        List<List<Integer>> matrix = new MatrixUtils().randomMatrix(size);
        assertEquals(BestRatings.sum(matrix), Indices.sum(matrix));
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 })
    void sumArray(int size) {
        final MatrixUtils matrixUtils = new MatrixUtils();
        int[][] matrix = matrixUtils.matrixListToArray(matrixUtils.randomMatrix(size));
        assertEquals(BestRatings.sumArray(matrix), Indices.sumArray(matrix));
    }
}