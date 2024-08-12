package com.springBootPractice.ParkingProject.Members;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Members {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String contactNo;
    private String houseNo;

    public Members() {
    }

    public Members(String id, String firstName, String lastName, String contactNo, String houseNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.houseNo = houseNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
}
