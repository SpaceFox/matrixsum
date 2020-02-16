package fr.spacefox.matrixsum

import java.util.*

object BranchesKt {
    @JvmStatic
    fun sum(matrix: List<List<Int>>): Int {
        val usableColumns = BooleanArray(matrix.size)
        Arrays.fill(usableColumns, true)
        var result = 0
        for (row in matrix) {
            for (i in row.indices) {
                if (usableColumns[i]) {
                    val v = row[i]
                    if (v == 0) {
                        usableColumns[i] = false
                    } else {
                        result += v
                    }
                }
            }
        }
        return result
    }

    @JvmStatic
    fun sumArray(matrix: Array<IntArray>): Int {
        val usableColumns = BooleanArray(matrix.size)
        Arrays.fill(usableColumns, true)
        var result = 0
        for (row in matrix) {
            for (i in row.indices) {
                if (usableColumns[i]) {
                    val v = row[i]
                    if (v == 0) {
                        usableColumns[i] = false
                    } else {
                        result += v
                    }
                }
            }
        }
        return result
    }
}