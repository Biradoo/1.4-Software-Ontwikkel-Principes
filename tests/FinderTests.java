import nl.saxion.sdp.exercises.week1.finder.Finder;
import nl.saxion.sdp.exercises.week1.finder.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinderTests {

    @Test
    public void descArray_ExpectMin() {
        int[] numbers = {3,1,6,2};

        Result result = new Finder().findMinMax(numbers);
        assertEquals(1, result.getMin());
    }

    @Test
    public void descArray_ExpectMax() {
        int[] numbers = {3,1,6,2};

        Result result = new Finder().findMinMax(numbers);
        assertEquals(6, result.getMax());
    }
}
