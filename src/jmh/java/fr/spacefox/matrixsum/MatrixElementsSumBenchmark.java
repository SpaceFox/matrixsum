package fr.spacefox.matrixsum;

import org.openjdk.jmh.annotations.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Fork(value = 1)
@Threads(1)
@Warmup(iterations = 2)
@Measurement(iterations = 2)
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class MatrixElementsSumBenchmark {

    private MatrixUtils matrixUtils = new MatrixUtils();
    private List<List<Integer>> matrixList;
    private int[][] matrixArray;

    @Param({"10", "100", "1000", "10000"})
//    @Param({"2", "4", "8", "16", "32", "64", "128", "256", "512", "1024", "2048", "4096", "8192", "16384"})
    int size;

    @Setup(Level.Trial)
    public void setup() {
        matrixList = matrixUtils.randomMatrix(size);
        matrixArray = matrixUtils.matrixListToArray(matrixList);
    }

    @Benchmark
    public int bestRatings() {
        return BestRatings.sum(matrixList);
    }

    @Benchmark
    public int bestRatingsArray() {
        return BestRatings.sumArray(matrixArray);
    }

    @Benchmark
    public int bestRatingsKt() {
        return BestRatingsKt.sum(matrixList);
    }

    @Benchmark
    public int bestRatingsArrayKt() {
        return BestRatingsKt.sumArray(matrixArray);
    }


    @Benchmark
    public int branches() {
        return Branches.sum(matrixList);
    }

    @Benchmark
    public int branchesArray() {
        return Branches.sumArray(matrixArray);
    }

    @Benchmark
    public int branchesKt() {
        return BranchesKt.sum(matrixList);
    }

    @Benchmark
    public int branchesArrayKt() {
        return BranchesKt.sumArray(matrixArray);
    }

    @Benchmark
    public int indices() {
        return Indices.sum(matrixList);
    }

    @Benchmark
    public int indicesArray() {
        return Indices.sumArray(matrixArray);
    }

    @Benchmark
    public int indicesKt() {
        return IndicesKt.sum(matrixList);
    }

    @Benchmark
    public int indicesArrayKt() {
        return IndicesKt.sumArray(matrixArray);
    }

}
