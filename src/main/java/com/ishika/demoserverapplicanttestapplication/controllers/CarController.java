package com.ishika.demoserverapplicanttestapplication.controllers;

import com.ishika.demoserverapplicanttestapplication.domainobject.CarDO;
import com.ishika.demoserverapplicanttestapplication.dto.CarDTO;
import com.ishika.demoserverapplicanttestapplication.exceptions.ConstraintsViolationException;
import com.ishika.demoserverapplicanttestapplication.mapper.CarMapper;
import com.ishika.demoserverapplicanttestapplication.service.car.CarService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/cars")
public class CarController {
    private CarService carService;


    @GetMapping("/available")
    public List<CarDTO> findCars(@RequestParam boolean available) {
        return CarMapper.makeCarDTOList(carService.find(available));
    }


    @GetMapping("/all")
    public List<CarDTO> findAllCars() {
        return CarMapper.makeCarDTOList(carService.findAll());
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarDTO createCar(@Valid @RequestBody CarDTO carDTO) throws ConstraintsViolationException {
        CarDO carDO = CarMapper.makeCarDO(carDTO);
        return CarMapper.makeCarDTO(carService.create(carDO));
    }

}