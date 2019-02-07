package sorting;

import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {

    @Test
    public void mergeSort100Million() {
        List<Integer> input = RandomIntListGenerator.getListOfRandomInts(100000000);

        Sorter sorter = new Sorter();
        List<Integer> result = sorter.mergeSort(input);
        assertTrue(Ordering.natural().isOrdered(result));
    }

    @Test
    public void mergeSortThousand() {
        List<Integer> input = RandomIntListGenerator.getListOfRandomInts(1000);

        Sorter sorter = new Sorter();
        List<Integer> result = sorter.mergeSort(input);
        assertTrue(Ordering.natural().isOrdered(result));
    }

    @Test
    public void mergeTest() {
        Integer[] array1 = {1, 4, 5, 99, 234, 235, 888};
        List<Integer> input1 = Arrays.asList(array1);
        Integer[] array2 = {2, 54, 58, 99, 236, 278, 878, 384957};
        List<Integer> input2 = Arrays.asList(array2);

        Integer[] expectedArray = {1, 2, 4, 5, 54, 58, 99, 99, 234, 235, 236, 278, 878, 888, 384957};
        List<Integer> expected = Arrays.asList(expectedArray);

        Sorter sorter = new Sorter();
        List<Integer> actual = sorter.merge(input1, input2);
        assertEquals(expected, actual);
    }
}