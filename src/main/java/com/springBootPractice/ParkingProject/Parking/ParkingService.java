package com.springBootPractice.ParkingProject.Parking;

import com.springBootPractice.ParkingProject.Cars.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {
    @Autowired
    private ParkingRepository parkingRepository;

    public List<Parking> getAllParking(){
        List<Parking> parkingList = new ArrayList<>();
        parkingRepository.findAll().forEach(parkingList::add);
        return parkingList;
    }

    public Parking getParkingById(String id){
        return parkingRepository.findById(id).get();
    }

    public List<Parking> getParkingByCarId(String car_id){
        return parkingRepository.findByCarsId(car_id);
    }

    public List<Parking> getParkingByMemberId(String member_id){
        return parkingRepository.findByMembersId(member_id);
    }

    public void addParking(Parking parking){
        parkingRepository.save(parking);
    }

    public void updateParking(Parking parking){
        parkingRepository.save(parking);
    }

    public void deleteParking(Parking parking){
        parkingRepository.delete(parking);
    }

}
