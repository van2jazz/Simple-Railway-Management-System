package com.dayo.demo.repository;

import com.dayo.demo.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

    Optional<Station> findStationByCode(int id);


//
//
//    Optional<Station> findStationById(int id);
//
//    List<Station> findAll();
}
