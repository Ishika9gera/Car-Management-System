package com.ishika.demoserverapplicanttestapplication.domainobject;
import com.ishika.demoserverapplicanttestapplication.domainvalue.EngineType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.ZonedDateTime;
public class CarDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean active;

    @Column
    private Boolean available;

    @Column(nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private ZonedDateTime dateCreated = ZonedDateTime.now();

    @Column(nullable = false)
    @NotNull(message = "LicensePlate can not be null!")
    private String licensePlate;

    @Column
    private Integer seatCount;

    @Column
    private Boolean convertible;

    @Column
    private Integer rating;

    @Enumerated(EnumType.STRING)
    @Column
    private EngineType engineType;

    @Column
    private String manufacturer;


    private CarDO() {
    }


    public CarDO(String licensePlate, Boolean available, Integer seatCount, Boolean convertible, Integer rating, EngineType engineType, String manufacturer) {
        this.licensePlate = licensePlate;
        this.active = true;
        this.available = available;
        this.seatCount = seatCount;
        this.convertible = convertible;
        this.rating = rating;
        this.engineType = engineType;
        this.manufacturer = manufacturer;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Boolean getActive() {
        return active;
    }


    public void setActive(Boolean active) {
        this.active = active;
    }


    public Boolean getAvailable() {
        return available;
    }


    public void setAvailable(Boolean available) {
        this.available = available;
    }


    public ZonedDateTime getDateCreated() {
        return dateCreated;
    }


    public void setDateCreated(ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    public String getLicensePlate() {
        return licensePlate;
    }


    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public Integer getSeatCount() {
        return seatCount;
    }


    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }


    public Boolean getConvertible() {
        return convertible;
    }


    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }


    public Integer getRating() {
        return rating;
    }


    public void setRating(Integer rating) {
        this.rating = rating;
    }


    public EngineType getEngineType() {
        return engineType;
    }


    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }


    public String getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
