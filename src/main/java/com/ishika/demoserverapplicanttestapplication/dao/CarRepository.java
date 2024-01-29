package com.ishika.demoserverapplicanttestapplication.dao;

import com.ishika.demoserverapplicanttestapplication.domainobject.CarDO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<CarDO, Long> {

    List<CarDO> findByAvailable(Boolean available);

    List<CarDO> findAll();

    List<CarDO> findAllByLicensePlateContainsOrSeatCountIsGreaterThanEqual(String licensePlate, Integer seatCount);

    List<CarDO> findAllByManufacturerIsStartingWith(String manufacturer);

}