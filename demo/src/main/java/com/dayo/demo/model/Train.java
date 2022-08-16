package com.dayo.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "TRAIN")
public class Train {
    private Long Id;

    private int capacity;

//    private String departure;
//
//    private String destination;


//    private Date departureDate;
//
//    private Date arrivalTime;

    private int seat;

//    private double price;


    public Train(){
    }

    public Train ( int seat) {
//        this.departure = departure;
//        this.destination = destination;
//        this.departureDate = departureDate;
//        this.arrivalTime = arrivalTime;
        this.seat = seat;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

//    public String getDeparture() {
//        return departure;
//    }
//
//    public void setDeparture(String departure) {
//        this.departure = departure;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }

//    public Date getDepartureDate() {
//        return departureDate;
//    }
//
//    public void setDepartureDate(Date departureDate) {
//        this.departureDate = departureDate;
//    }
//
//    public Date getArrivalTime() {
//        return arrivalTime;
//    }
//
//    public void setArrivalTime(Date arrivalTime) {
//        this.arrivalTime = arrivalTime;
//    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}
