package saxparser;

import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

@Getter
class PlaneHandler extends DefaultHandler {

    private List<Plane> planes = new ArrayList<>();

    private Plane tempPlane;
    private String tempValue;
    private Seller tempSeller;
    private Location tempLocation;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("ad")) {
            tempPlane = Plane.builder().build();
        }
        if (qName.equals("seller")) {
            tempSeller = new Seller();
            tempSeller.setPhone(attributes.getValue("phone"));
            tempSeller.setEmail(attributes.getValue("email"));
        }
        if (qName.equals("location")) {
            tempLocation = new Location();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("ad")) {
            planes.add(tempPlane);
        }
        if (qName.equals("year")) {
            tempPlane.setYear(Integer.parseInt(tempValue));
        }
        if (qName.equals("make")) {
            tempPlane.setMake(tempValue);
        }
        if (qName.equals("model")) {
            tempPlane.setModel(tempValue);
        }
        if (qName.equals("color")) {
            tempPlane.setColour(tempValue);
        }
        if (qName.equals("description")) {
            tempPlane.setDescription(tempValue);
        }
        if (qName.equals("price")) {
            tempPlane.setPrice(DoubleParser.parse(tempValue));
        }
        if (qName.equals("seller")) {
            tempSeller.setName(tempValue);
            tempPlane.setSeller(tempSeller);
        }
        if (qName.equals("location")) {
            tempPlane.setLocation(tempLocation);
        }
        if (qName.equals("city")) {
            tempLocation.setCity(tempValue);
        }
        if (qName.equals("state")) {
            tempLocation.setState(tempValue);
        }
    }

    @Override
    public void characters(char[] ac, int i, int j) {
        tempValue = new String(ac, i, j).trim();
    }
}
