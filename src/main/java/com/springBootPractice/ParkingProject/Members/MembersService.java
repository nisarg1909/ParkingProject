package com.springBootPractice.ParkingProject.Members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MembersService {
    @Autowired
    private MembersRepository membersRepository;

    public List<Members> getAllMembers(){
        List<Members> membersList = new ArrayList<>();
        membersRepository.findAll().forEach(membersList::add);
        return membersList;
    }

    public Members getMemberById(String id){
        return membersRepository.findById(id).get();
    }

    public void addMember(Members members){
        membersRepository.save(members);
    }

    public void updateMember(Members members){
        membersRepository.save(members);
    }

    public void deleteMember(Members members){
        membersRepository.delete(members);
    }

}
