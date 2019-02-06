package saxparser;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
class Plane {
    private int year;
    private String make;
    private String model;
    private String colour;
    private String description;
    private double price;
    private Seller seller;
    private Location location;
}
