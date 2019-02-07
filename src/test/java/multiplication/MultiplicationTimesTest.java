package multiplication;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MultiplicationTimesTest {

    @Test
    public void schoolMultiplication() {
        long x = 3925794447L;
        long y = 6239462978L;

        Multiplicator schoolMultiplicator = new SchoolMultiplicator();

        LocalDateTime schoolBefore = LocalDateTime.now();
        long schoolResult = schoolMultiplicator.multiply(x, y);
        LocalDateTime schoolAfter = LocalDateTime.now();

        LocalDateTime schoolBefore2 = LocalDateTime.now();
        long schoolResult2 = schoolMultiplicator.multiply(x, y);
        LocalDateTime schoolAfter2 = LocalDateTime.now();

        System.out.println("School multiplication took " + schoolBefore.until(schoolAfter, ChronoUnit.MILLIS) + " ms");
        System.out.println("School multiplication 2 took " + schoolBefore2.until(schoolAfter2, ChronoUnit.MILLIS) + " ms");
    }

    @Test
    public void karatsubaMultiplication() {
        long x = 3925794647L;
        long y = 6239465978L;

        Multiplicator karatsubaMultiplicator = new KaratsubaMultiplicator();

        LocalDateTime karatsubaBefore = LocalDateTime.now();
        long karatsubaResult = karatsubaMultiplicator.multiply(x, y);
        LocalDateTime karatsubaAfter = LocalDateTime.now();

        System.out.println("Karatsuba multiplication took " + karatsubaBefore.until(karatsubaAfter, ChronoUnit.MILLIS) + " ms");
    }
}
