package com.ishika.demoserverapplicanttestapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ishika.demoserverapplicanttestapplication.domainobject.CarDO;
import com.ishika.demoserverapplicanttestapplication.domainvalue.EngineType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDTO {
    @JsonIgnore
    private Long id;

    private Boolean available;
    private String licensePlate;
    private Integer seatCount;
    private Boolean convertible;
    private Integer rating;
    private EngineType engineType;
    private String manufacturer;


    private CarDTO() {
    }


    private CarDTO(Long id, Boolean available, String licensePlate, Integer seatCount, Boolean convertible, Integer rating, EngineType engineType, String manufacturer) {
        this.id = id;
        this.available = available;
        this.licensePlate = licensePlate;
        this.seatCount = seatCount;
        this.convertible = convertible;
        this.rating = rating;
        this.engineType = engineType;
        this.manufacturer = manufacturer;
    }


    public static CarDTOBuilder newBuilder() {
        return new CarDTOBuilder();
    }


    @JsonProperty
    public Long getId() {
        return id;
    }


    public Boolean getAvailable() {
        return available;
    }


    public String getLicensePlate() {
        return licensePlate;
    }


    public Integer getSeatCount() {
        return seatCount;
    }


    public Boolean getConvertible() {
        return convertible;
    }


    public Integer getRating() {
        return rating;
    }


    public EngineType getEngineType() {
        return engineType;
    }


    public String getManufacturer() {
        return manufacturer;
    }


    public static class CarDTOBuilder {
        private Long id;
        private Boolean available;
        private String licensePlate;
        private Integer seatCount;
        private Boolean convertible;
        private Integer rating;
        private EngineType engineType;
        private String manufacturer;


        public CarDTOBuilder setId(Long id) {
            this.id = id;
            return this;
        }


        public CarDTOBuilder setAvailable(Boolean available) {
            this.available = available;
            return this;
        }


        public CarDTOBuilder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }


        public CarDTOBuilder setSeatCount(Integer seatCount) {
            this.seatCount = seatCount;
            return this;
        }


        public CarDTOBuilder setConvertible(Boolean convertible) {
            this.convertible = convertible;
            return this;
        }


        public CarDTOBuilder setRating(Integer rating) {
            this.rating = rating;
            return this;
        }


        public CarDTOBuilder setEngineType(EngineType engineType) {
            this.engineType = engineType;
            return this;
        }


        public CarDTOBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }


        public CarDTO createCarDTO() {
            return new CarDTO(id, available, licensePlate, seatCount, convertible, rating, engineType, manufacturer);
        }

    }
}

