package fr.spacefox.matrixsum

import fr.spacefox.matrixsum.BestRatingsKt.sum
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BestRatingsTestKt {
    @Test
    fun sum() {
        Assertions.assertEquals(
            16,
            sum(
                listOf(
                    listOf(0, 2, 3),
                    listOf(1, 0, 4),
                    listOf(5, 6, 7)
                )
            )
        )
    }

    @Test
    fun sumArray() {
    }
}