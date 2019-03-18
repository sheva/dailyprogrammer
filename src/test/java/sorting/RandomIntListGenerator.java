package sorting;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class RandomIntListGenerator {

    static List<Integer> getListOfRandomInts(int size) {
        return new Random().ints(size).boxed().collect(Collectors.toList());
    }
}
