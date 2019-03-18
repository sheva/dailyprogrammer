package sorting;

import java.util.ArrayList;
import java.util.List;

class Sorter {
    private List<Integer> numbers;
    private List<Integer> helper;

    void sort(List<Integer> values) {
        this.numbers = values;
        int size = values.size();
        this.helper = new ArrayList<>(size);
        mergesort(0, size - 1);
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper.add(i , numbers.get(i));
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helper.get(i) <= helper.get(j)) {
                numbers.add(k, helper.get(i));
                i++;
            } else {
                numbers.add(k, helper.get(j));
                j++;
            }
            k++;
        }

        while (i <= middle) {
            numbers.add(k, helper.get(i));
            k++;
            i++;
        }
    }
}
