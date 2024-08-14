package com.springBootPractice.ParkingProject.Parking;

import com.springBootPractice.ParkingProject.Cars.Cars;
import com.springBootPractice.ParkingProject.Members.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingController {
    @Autowired
    private ParkingService parkingService;

    @RequestMapping("/parking")
    public List<Parking> getAllParking(){
        return parkingService.getAllParking();
    }

    @RequestMapping("/parking/{id}")
    public Parking getParkingById(@PathVariable("id")String id){
        return parkingService.getParkingById(id);
    }

    @RequestMapping("/parking/cars/{car_id}")
    public List<Parking> getParkingByCarsId(@PathVariable("car_id")String car_id){
        return parkingService.getParkingByCarId(car_id);
    }

    @RequestMapping("/parking/members/{member_id}")
    public List<Parking> getParkingByMemberId(@PathVariable("member_id")String member_id){
        return parkingService.getParkingByMemberId(member_id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/parking/cars/{car_id}/{member_id}")
    public String addParking(@RequestBody Parking parking, @PathVariable("car_id")String car_id, @PathVariable("member_id")String member_id){
        Cars cars = new Cars(car_id,"","");
        parking.setCars(cars);
        Members members = new Members(member_id,"","","","");
        parking.setMembers(members);
        parkingService.addParking(parking);
        return "Record Added Successfully";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/parking/cars/{car_id}/{member_id}")
    public String updateParking(@RequestBody Parking parking, @PathVariable("car_id")String car_id, @PathVariable("member_id")String member_id){
        Cars cars = new Cars(car_id,"","");
        parking.setCars(cars);
        Members members = new Members(member_id,"","","","");
        parking.setMembers(members);
        parkingService.updateParking(parking);
        return "Record Updated Successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/parking/cars/{car_id}/{member_id}")
    public String deleteParking(@RequestBody Parking parking, @PathVariable("car_id")String car_id, @PathVariable("member_id")String member_id){
        Cars cars = new Cars(car_id,"","");
        parking.setCars(cars);
        Members members = new Members(member_id,"","","","");
        parking.setMembers(members);
        parkingService.deleteParking(parking);
        return "Record Deleted Successfully";
    }


}
