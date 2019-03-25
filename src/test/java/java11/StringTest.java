package java11;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testStripLeading() {
        String hasLeadingWhiteSpace = " Test  ";
        String strippedTest = hasLeadingWhiteSpace.stripLeading();
        assertEquals("Test  ", strippedTest);
    }

    @Test
    public void testStripTrailing() {
        String hasTrailingWhiteSpace = " Test  ";
        String strippedTest = hasTrailingWhiteSpace.stripTrailing();
        assertEquals(" Test", strippedTest);
    }

    @Test
    public void testStrip() {
        String hasLeadingAndTrailingWhiteSpace = " Test\t\n  ";
        String stripped = hasLeadingAndTrailingWhiteSpace.strip();
        assertEquals("Test", stripped);
    }

    @Test
    public void testStrip2() {
        String test = " te st  ";
        String actual = test.strip();
        assertEquals("te st", actual);
    }

    @Test
    public void test_isBlank() {
        assertTrue("".isBlank());
        assertTrue(System.getProperty("line.separator").isBlank());
        assertTrue("\t".isBlank());
        assertTrue("    ".isBlank());
        assertTrue("\t\n    ".isBlank());
    }
}
