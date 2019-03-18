package sorting;

import com.google.common.collect.Ordering;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {

    @Test
    public void mergeSort100Million() {
        List<Integer> input = RandomIntListGenerator.getListOfRandomInts(100000000);

        Sorter sorter = new Sorter();
        System.out.println(LocalDateTime.now() + " Sorting 100 million integers.");
        sorter.sort(input);
        System.out.println(LocalDateTime.now() + " 100 million integers sorted.");
        assertTrue(Ordering.natural().isOrdered(input));
    }

    @Test
    public void mergeSortThousand() {
        List<Integer> input = RandomIntListGenerator.getListOfRandomInts(1000);

        Sorter sorter = new Sorter();
        System.out.println(LocalDateTime.now() + " Sorting 1000 integers.");
        sorter.sort(input);
        System.out.println(LocalDateTime.now() + " 1000 integers sorted.");
        assertTrue(Ordering.natural().isOrdered(input));
    }

    @Test
    public void smallMergeSort() {
        Integer[] expectedArray = {1, 2, 4, 5, 54, 58, 99, 99, 234, 235, 236, 278, 878, 888, 384957};
        List<Integer> input = Arrays.asList(expectedArray);
        Collections.shuffle(input);

        Sorter sorter = new Sorter();
        sorter.sort(input);
        assertTrue(Ordering.natural().isOrdered(input));
    }
}