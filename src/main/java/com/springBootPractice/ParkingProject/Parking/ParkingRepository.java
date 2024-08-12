package com.springBootPractice.ParkingProject.Parking;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingRepository extends CrudRepository<Parking,String> {
    List<Parking> findByCarsId(String car_id);
}
