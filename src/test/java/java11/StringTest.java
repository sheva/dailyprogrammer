package java11;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringTest {

    @Test
    public void testRepeat() {
        String test = "havryliuk";
        String repeated = test.repeat(5);
        assertEquals("havryliukhavryliukhavryliukhavryliukhavryliuk", repeated);
    }
}
