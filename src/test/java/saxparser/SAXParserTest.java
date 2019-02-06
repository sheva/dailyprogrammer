package saxparser;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class SAXParserTest {

    private static List<Plane> expected = new ArrayList<>();

    static {
        Plane plane1 = Plane.builder().year(1977).make("c").model("Skyhawk").colour("Light blue and white").description(
            "New paint, nearly new interior,\n" + "            685 hours SMOH, full IFR King avionics").price(23.495)
                            .seller(new Seller("Skyway Aircraft", null, "555-222-3333"))
                            .location(new Location("Rapid City,", "South Dakota")).build();
        Plane plane2 = Plane.builder().year(1965).make("p").model("Cherokee").colour("Gold").description(
            "240 hours SMOH, dual NAVCOMs, DME,\n" + "            new Cleveland brakes, great shape")
                            .seller(new Seller("John Seller", "jseller@www.axl.com", "555-333-2222"))
                            .location(new Location("St. Joseph,", "Missouri")).build();

        expected.add(plane1);
        expected.add(plane2);
    }

    @Test
    public void testSAXParser() throws IOException, URISyntaxException {
        String xml = new String(Files.readAllBytes(Paths.get("src/test/resources/saxparser/planes.xml")));
        File file = new File("src/test/resources/saxparser/planes.xml");

        PlanesXMLParser parser = new PlanesXMLParser();
        List<Plane> planes = parser.getPlanes(file);
        assertEquals(2, planes.size());
        assertEquals(expected, planes);
    }
}
