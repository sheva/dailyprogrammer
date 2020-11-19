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
    
    enum QName {
        AD, SELLER, LOCATION, YEAR, MAKE, MODEL, COLOR, DESCRIPTION, PRICE, CITY, STATE
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName == null) return; 
        
        switch (qName.toUpperCase()) {
            case AD:    
                tempPlane = Plane.builder().build(); 
                break;
            case SELLER: {
                tempSeller = new Seller();
                tempSeller.setPhone(attributes.getValue("phone"));
                tempSeller.setEmail(attributes.getValue("email"));
                break;
            }
            case LOCATION:  
                tempLocation = new Location(); 
                break;
            default: 
                throw new IllegalArgumentException("Invalid qName value " + qName);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName == null) return; 
        
        switch (qName.toUpperCase()) {
            case AD:    
                planes.add(tempPlane); 
                break;
            case YEAR:  
                tempPlane.setYear(Integer.parseInt(tempValue)); 
                break;
            case MAKE:  
                tempPlane.setMake(tempValue);   
                break;
            case MODEL: 
                tempPlane.setModel(tempValue);  
                break;
            case COLOR: 
                tempPlane.setColour(tempValue); 
                break;
            case CITY:  
                tempLocation.setCity(tempValue);    
                break;
            case STATE: 
                tempLocation.setState(tempValue);   
                break;   
            case PRICE: 
                tempPlane.setPrice(DoubleParser.parse(tempValue)); 
                break;
            case SELLER: {
                tempSeller.setName(tempValue);
                tempPlane.setSeller(tempSeller);
                break;
            }
            case LOCATION:  
                tempPlane.setLocation(tempLocation);  
                break;
            case DESCRIPTION:   
                tempPlane.setDescription(tempValue); 
                break;     
            default: 
                throw new IllegalArgumentException("Invalid qName value " + qName);
        }
    }

    @Override
    public void characters(char[] ac, int i, int j) {
        tempValue = new String(ac, i, j).trim();
    }
}
