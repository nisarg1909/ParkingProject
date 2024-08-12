package com.springBootPractice.ParkingProject.Members;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends CrudRepository<Members,String> {
}
