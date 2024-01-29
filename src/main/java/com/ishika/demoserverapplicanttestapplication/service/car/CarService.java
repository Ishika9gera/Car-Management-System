package com.ishika.demoserverapplicanttestapplication.service.car;
import com.ishika.demoserverapplicanttestapplication.domainobject.CarDO;
import com.ishika.demoserverapplicanttestapplication.exceptions.CarAlreadyInUseException;
import com.ishika.demoserverapplicanttestapplication.exceptions.ConstraintsViolationException;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
public class CarService {
    public CarDO find(Long carId) throws EntityNotFoundException;

    public CarDO create(CarDO carDO) throws ConstraintsViolationException;

    void delete(Long carId) throws EntityNotFoundException;

    public CarDO selectCar(long carId) throws EntityNotFoundException, CarAlreadyInUseException;

    void dropSelectedCar(long carId) throws EntityNotFoundException;

    public List<CarDO> find(Boolean available);

    public List<CarDO> findAll();
}
