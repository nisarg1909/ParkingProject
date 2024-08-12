package com.springBootPractice.ParkingProject.Cars;

import com.springBootPractice.ParkingProject.Members.Members;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cars {
    @Id
    private String id;
    private String name;
    private String color;
    @ManyToOne
    private Members members;

    public Cars() {
    }

    public Cars(String id, String name, String color, String member_id) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.members = new Members(member_id,"","","","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }
}
