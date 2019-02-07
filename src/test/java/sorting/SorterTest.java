package sorting;

import com.google.common.collect.Ordering;
import org.junit.Test;

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
}