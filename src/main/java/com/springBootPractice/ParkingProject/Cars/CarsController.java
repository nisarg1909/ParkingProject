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

    @RequestMapping("/cars/members/{member_id}")
    public List<Cars> getCarsByMembersId(@PathVariable("member_id")String member_id){
        return carsService.getCarsByMemberId(member_id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/cars/members/{member_id}")
    public String addCar(@RequestBody Cars cars,@PathVariable("member_id")String member_id){
        Members members = new Members(member_id,"","","","");
        cars.setMembers(members);
        carsService.addCar(cars);
        return "Record Added Successfully";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/cars/members/{member_id}")
    public String updateCar(@RequestBody Cars cars,@PathVariable("member_id")String member_id){
        Members members = new Members(member_id,"","","","");
        cars.setMembers(members);
        carsService.updateCar(cars);
        return "Record Updated Successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/cars/members/{member_id}")
    public String deleteCar(@RequestBody Cars cars,@PathVariable("member_id")String member_id){
        Members members = new Members(member_id,"","","","");
        cars.setMembers(members);
        carsService.deleteCar(cars);
        return "Record Deleted Successfully";
    }

}
