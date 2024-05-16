package nl.saxion.sdp.exercises.week1.finder;

public class Result {
    private final int max;
    private final int min;

    public Result(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
