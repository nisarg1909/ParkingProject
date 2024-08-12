package com.springBootPractice.ParkingProject.Members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MembersController {
    @Autowired
    private MembersService membersService;

    @RequestMapping("/members")
    public List<Members> getAllMembers(){
        return membersService.getAllMembers();
    }

    @RequestMapping("/members/{id}")
    public Members getMemberById(String id){
        return membersService.getMemberById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/members")
    public String addMember(@RequestBody Members members){
        membersService.addMember(members);
        return "Record Added Successfully";
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/members")
    public String updateMember(@RequestBody Members members){
        membersService.updateMember(members);
        return "Record Updated Successfully";
    }

    @RequestMapping(method= RequestMethod.DELETE, value = "/members")
    public String deleteMember(@RequestBody Members members){
        membersService.deleteMember(members);
        return "Record Deleted Successfully";
    }

}
