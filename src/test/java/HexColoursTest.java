import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexColoursTest {

    @Test
    public void hexColor1() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexcolor(255, 99, 71);
        String expected = "#FF6347";
        assertEquals(expected, actual);
    }

    @Test
    public void hexColor2() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexcolor(184, 134, 11);
        String expected = "#B8860B";
        assertEquals(expected, actual);
    }

    @Test
    public void hexColor3() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexcolor(189, 183, 107);
        String expected = "#BDB76B";
        assertEquals(expected, actual);
    }

    @Test
    public void hexColor4() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexcolor(0, 0, 205);
        String expected = "#0000CD";
        assertEquals(expected, actual);
    }
}
