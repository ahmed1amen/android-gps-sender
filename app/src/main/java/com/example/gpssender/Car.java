package com.example.gpssender;

public class Car {

    public Car(String lat, String lng, String carName) {
        this.lat = lat;
        this.lng = lng;
        this.carName = carName;
    }

    private String lat;
  private String lng;
  private String carName;


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
