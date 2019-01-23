import org.junit.Test;

import static junit.framework.Assert.*;

public class BalancedTest {
    @Test
    public void test1() {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced("xxxyyy");
        assertTrue(actual);
    }

    @Test
    public void test2() {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced("yyyxxx");
        assertTrue(actual);
    }

    @Test
    public void test3() {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced("xxxyyyy");
        assertFalse(actual);
    }

    @Test
    public void test4() {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced("yyxyxxyxxyyyyxxxyxyx");
        assertTrue(actual);
    }

    @Test
    public void test5() {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced("xyxxxxyyyxyxxyxxyy");
        assertFalse(actual);
    }

    @Test
    public void test6() {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced("");
        assertTrue(actual);
    }

    @Test
    public void test7() {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced("x");
        assertFalse(actual);
    }
}
