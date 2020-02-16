package fr.spacefox.matrixsum

object BestRatingsKt {
    @JvmStatic
    fun sum(matrix: List<List<Int>>): Int {
        var result = 0
        for (j in matrix[0].indices) {
            for (i in matrix.indices) {
                if (matrix[i][j] == 0) {
                    break
                }
                result += matrix[i][j]
            }
        }
        return result
    }

    @JvmStatic
    fun sumArray(matrix: Array<IntArray>): Int {
        var result = 0
        for (j in matrix[0].indices) {
            for (i in matrix.indices) {
                if (matrix[i][j] == 0) {
                    break
                }
                result += matrix[i][j]
            }
        }
        return result
    }
}