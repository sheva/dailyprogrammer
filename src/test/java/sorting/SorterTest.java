package sorting;

import com.google.common.collect.Ordering;
import javafx.util.Pair;
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

    @Test
    public void mergeTestOne() {
        Integer[] array1 = {1};
        List<Integer> input1 = Arrays.asList(array1);
        List<Integer> input2 = Arrays.asList(new Integer[] {});

        Integer[] expectedArray = {1};
        List<Integer> expected = Arrays.asList(expectedArray);

        Sorter sorter = new Sorter();
        List<Integer> actual = sorter.merge(input1, input2);
        assertEquals(expected, actual);
    }

    @Test
    public void splitTest() {
        Integer[] inputArray = {2, 54, 58, 99, 150, 236, 278, 878, 384957};
        List<Integer> input = Arrays.asList(inputArray);

        Sorter sorter = new Sorter();
        Pair<List<Integer>, List<Integer>> actual = sorter.split(input);

        Integer[] expectedArray1 = {2, 54, 58, 99};
        List<Integer> expectedList1 = Arrays.asList(expectedArray1);
        Integer[] expectedArray2 = {150, 236, 278, 878, 384957};
        List<Integer> expectedList2 = Arrays.asList(expectedArray2);
        Pair<List<Integer>, List<Integer>> expected = new Pair<>(expectedList1, expectedList2);

        assertEquals(expected, actual);
    }

    @Test
    public void splitTestOne() {
        Integer[] inputArray = {2};
        List<Integer> input = Arrays.asList(inputArray);

        Sorter sorter = new Sorter();
        Pair<List<Integer>, List<Integer>> actual = sorter.split(input);

        List<Integer> expectedList1 = Arrays.asList(new Integer[] {});
        Integer[] expectedArray2 = {2};
        List<Integer> expectedList2 = Arrays.asList(expectedArray2);
        Pair<List<Integer>, List<Integer>> expected = new Pair<>(expectedList1, expectedList2);

        assertEquals(expected, actual);
    }
}