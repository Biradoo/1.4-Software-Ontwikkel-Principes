package nl.saxion.sdp.exercises.week1.finder;

public class Finder {
    public Result findMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
            if (max < numbers[i])
                max = numbers[i];
        }
        return new Result(min, max);
    }
}
