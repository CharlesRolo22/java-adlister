package models;

import java.io.Serializable;

public class Car implements Serializable {
    private long vinNumber;
    private String manufacturer;
    private String model;
    private int year;
    private String bodyType;
    private long mileage;
    private String fuelType;
    private boolean isAutomatic;

    public Car(){};

    public Car(long vinNumber, String manufacturer, String model, int year, String bodyType, long mileage, String fuelType, boolean isAutomatic) {
        this.vinNumber = vinNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.bodyType = bodyType;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.isAutomatic = isAutomatic;
    }


    public long getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(long vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}