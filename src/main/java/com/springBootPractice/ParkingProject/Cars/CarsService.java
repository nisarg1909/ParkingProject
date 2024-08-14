package com.springBootPractice.ParkingProject.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsService {
    @Autowired
    private CarsRepository carsRepository;

    public List<Cars> getAllCars(){
        List<Cars> carsList = new ArrayList<>();
        carsRepository.findAll().forEach(carsList::add);
        return carsList;
    }

    public Cars getCarById(String id){
        return carsRepository.findById(id).get();
    }


    public void addCar(Cars cars){
        carsRepository.save(cars);
    }

    public void updateCar(Cars cars){
        carsRepository.save(cars);
    }

    public void deleteCar(Cars cars){
        carsRepository.delete(cars);
    }

}
