package fr.spacefox.matrixsum

import org.apache.commons.lang3.ArrayUtils
import java.util.stream.Collectors
import java.util.stream.IntStream

object IndicesKt {
    @JvmStatic
    fun sum(matrix: List<List<Int>>): Int {
        val usableColumns =
            IntStream.range(0, matrix.size).boxed().collect(Collectors.toList())
        var result = 0
        for (row in matrix) {
            var it = 0
            while (it < usableColumns.size) {
                val i = usableColumns[it]
                val v = row[i]
                if (v == 0) {
                    usableColumns.removeAt(it)
                    it--
                } else {
                    result += v
                }
                it++
            }
        }
        return result
    }

    @JvmStatic
    fun sumArray(matrix: Array<IntArray>): Int {
        var usableColumns = IntStream.range(0, matrix.size).toArray()
        var result = 0
        for (row in matrix) {
            var it = 0
            while (it < usableColumns.size) {
                val i = usableColumns[it]
                val v = row[i]
                if (v == 0) {
                    usableColumns = ArrayUtils.remove(usableColumns, it)
                    it--
                } else {
                    result += v
                }
                it++
            }
        }
        return result
    }
}