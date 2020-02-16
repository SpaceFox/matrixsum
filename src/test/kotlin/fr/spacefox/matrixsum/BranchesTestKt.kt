package fr.spacefox.matrixsum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class BranchesTestKt {
    @ParameterizedTest
    @ValueSource(ints = [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384])
    fun sum(size: Int) {
        val matrix =
            MatrixUtils().randomMatrix(size)
        Assertions.assertEquals(BestRatingsKt.sum(matrix), BranchesKt.sum(matrix))
    }

    @ParameterizedTest
    @ValueSource(ints = [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384])
    fun sumArray(size: Int) {
        val matrixUtils = MatrixUtils()
        val matrix = matrixUtils.matrixListToArray(matrixUtils.randomMatrix(size))
        Assertions.assertEquals(BestRatingsKt.sumArray(matrix), BranchesKt.sumArray(matrix))
    }
}