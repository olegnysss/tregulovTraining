package Tregulov.generics.wildcards;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WildcardsTest {
    @Test
    public void testCalculateAverage() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);

        double averageInt = NumberUtils.calculateAverage(integers);
        assertEquals(2.0, averageInt, 0.0001);

        double averageDouble = NumberUtils.calculateAverage(doubles);
        assertEquals(2.0, averageDouble, 0.0001);
    }
}

class NumberUtils {
    //The ? extends Number wildcard is used to specify that the method can accept any subtype
    // of Number, such as Integer, Double, Float, etc.
    //If we create List<Object>, we couldn't call this method with List<Integer>
    public static double calculateAverage(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }
}