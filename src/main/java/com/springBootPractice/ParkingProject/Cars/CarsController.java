package com.springBootPractice.ParkingProject.Cars;

import com.springBootPractice.ParkingProject.Members.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarsController {
    @Autowired
    private CarsService carsService;

    @RequestMapping("/cars")
    public List<Cars> getAllCars(){
        return carsService.getAllCars();
    }

    @RequestMapping("/cars/{id}")
    public Cars getCarsById(@PathVariable("id")String id){
        return carsService.getCarById(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/cars")
    public String addCar(@RequestBody Cars cars){
        carsService.addCar(cars);
        return "Record Added Successfully";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/cars")
    public String updateCar(@RequestBody Cars cars){
        carsService.updateCar(cars);
        return "Record Updated Successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/cars")
    public String deleteCar(@RequestBody Cars cars){
        carsService.deleteCar(cars);
        return "Record Deleted Successfully";
    }


}
