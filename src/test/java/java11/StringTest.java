package java11;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.Assert.assertEquals;

public class StringTest {

    @Test
    public void testRepeat() {
        String test = "havryliuk";
        String repeated = test.repeat(5);
        assertEquals("havryliukhavryliukhavryliukhavryliukhavryliuk", repeated);
    }

    @Test
    public void testLines() {
        String multipleLinesString = "First line.\nSecond line.\nThird line.\n";
        List<String> lines = multipleLinesString.lines().collect(Collectors.toList());
        assertEquals(3, lines.size());
    }
}
