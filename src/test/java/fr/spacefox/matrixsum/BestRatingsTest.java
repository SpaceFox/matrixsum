package fr.spacefox.matrixsum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestRatingsTest {

    @Test
    void sum() {
        assertEquals(
                16,
                BestRatings.sum(List.of(
                        List.of(0, 2, 3),
                        List.of(1, 0, 4),
                        List.of(5, 6, 7))));
    }

    @Test
    void sumArray() {
    }
}