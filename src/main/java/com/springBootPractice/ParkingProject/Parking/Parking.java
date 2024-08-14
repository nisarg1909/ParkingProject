package com.springBootPractice.ParkingProject.Parking;

import com.springBootPractice.ParkingProject.Cars.Cars;
import com.springBootPractice.ParkingProject.Members.Members;
import jakarta.persistence.*;

import java.sql.Date;


@Entity
public class Parking {
    @Id
    private String id;
    private String dates;
    private String time_in;
    private String time_out;
    private String parkingNo;
    @ManyToOne
    private Cars cars;
    @ManyToOne
    private Members members;

    public Parking() {
    }

    public Parking(String id, String dates, String time_in, String time_out, String parkingNo, String car_id, String member_id) {
        this.id = id;
        this.dates = dates;
        this.time_in = time_in;
        this.time_out = time_out;
        this.parkingNo = parkingNo;
        this.cars = new Cars(car_id,"","");
        this.members = new Members(member_id,"","","","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getTime_in() {
        return time_in;
    }

    public void setTime_in(String time_in) {
        this.time_in = time_in;
    }

    public String getTime_out() {
        return time_out;
    }

    public void setTime_out(String time_out) {
        this.time_out = time_out;
    }

    public String getParkingNo() {
        return parkingNo;
    }

    public void setParkingNo(String parkingNo) {
        this.parkingNo = parkingNo;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }
}
