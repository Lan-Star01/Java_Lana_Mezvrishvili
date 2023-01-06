package com.example.java_lana_mezvrishvili;

public class DatabaseInf {
    private long id;
    private String currentLocation;
    private String  landingLocation;
    private Integer currentDat;
    private Integer returnDat;
    private Integer passengers;
    private Integer price;

    public DatabaseInf(String currentLocation, String landingLocation, Integer currentDat, Integer returnDat, Integer passengers, Integer price) {
        this.currentLocation = currentLocation;
        this.landingLocation = landingLocation;
        this.currentDat = currentDat;
        this.returnDat = returnDat;
        this.passengers = passengers;
        this.price = price;
    }


    public String getLandingLocation() {
        return landingLocation;
    }

    public void setLandingLocation(String landingLocation) {
        this.landingLocation = landingLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }


    public Integer getCurrentDat() {
        return currentDat;
    }

    public void setCurrentDat(Integer currentDat) {
        this.currentDat = currentDat;
    }

    public Integer getReturnDat() {
        return returnDat;
    }

    public void setReturnDat(Integer returnDat) {
        this.returnDat = returnDat;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DatabaseInf{" +
                "id=" + id +
                ", currentLocation='" + currentLocation + '\'' +
                ", LandingLocation='" + landingLocation + '\'' +
                ", currentDat=" + currentDat +
                ", returnDat=" + returnDat +
                ", passengers=" + passengers +
                ", price=" + price +
                '}';
    }
}
