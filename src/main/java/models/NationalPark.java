package models;

import java.io.Serializable;
import java.time.LocalDate;

public class NationalPark implements Serializable {
    private long id;
    private String name;
    private String location;
    private LocalDate dateOfEstablishment;
    private String description;

    public NationalPark(){};

    public NationalPark(long id, String name, String location, LocalDate dateOfEstablishment, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.dateOfEstablishment = dateOfEstablishment;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
