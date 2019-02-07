package sorting;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

class Sorter {
    List<Integer> mergeSort(List<Integer> input) {
        List<Integer> result = new ArrayList<>();



        return result;
    }

    private Pair<List<Integer>, List<Integer>> split(List<Integer> list) {
        List<Integer> list1;
        List<Integer> list2;

        int size = list.size();
        list1 = list.subList(0, size / 2);
        list2 = list.subList(size / 2, size);

        return new Pair<>(list1, list2);
    }

    private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        int size = list1.size() + list2.size();
        List<Integer> result = new ArrayList<>(size);

        int list1Pointer = 0;
        int list2Pointer = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < list2.get(i)) {
                result.add(i, list1.get(list1Pointer));
                list1Pointer++;
            } else {
                result.add(i, list2.get(list2Pointer));
                list2Pointer++;
            }
        }

        return result;
    }
}
