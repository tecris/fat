package org.playground.poc;

public class Address {
    private String streetName;
    private String streetNumber;
    private String suburb;
    private String city;
    public String unit;

    public void setStreetName(String aStreetName){
        this.streetName = aStreetName;
    }

    public String getStreetName() {
        return streetName;
    }
}
