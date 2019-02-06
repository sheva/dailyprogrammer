package saxparser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class PlanesXMLParser {

    List<Plane> getPlanes(File file) {
        List<Plane> planes = new ArrayList<>();

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            PlaneHandler planeHandler = new PlaneHandler();
            saxParser.parse(file, planeHandler);
            planes = planeHandler.getPlanes();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return planes;
    }
}
