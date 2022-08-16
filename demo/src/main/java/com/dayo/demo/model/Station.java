package com.dayo.demo.model;

import javax.persistence.*;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STATION_ID")
    private int stationId;

    @Column(name = "STATION_NAME")
    private String stationName;

    public Station(){
    }


    public Station(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

}
