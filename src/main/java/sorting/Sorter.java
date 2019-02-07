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

    List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        int size = list1.size() + list2.size();
        List<Integer> result = new ArrayList<>(size);

        int list1Pointer = 0;
        int list2Pointer = 0;
        for (int i = 0; i < size; i++) {
            try {
                if (list1.get(list1Pointer) < list2.get(list2Pointer)) {
                    result.add(i, list1.get(list1Pointer));
                    list1Pointer++;
                } else {
                    result.add(i, list2.get(list2Pointer));
                    list2Pointer++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                Integer last;
                if (list1.size() > list2.size()) {
                    last = list1.get(list1.size() - 1);
                } else {
                    last = list2.get(list2.size() - 1);
                }
                result.add(size - 1, last);
            }
        }

        return result;
    }
}
