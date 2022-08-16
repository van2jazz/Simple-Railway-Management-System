package com.dayo.demo.repository;

import com.dayo.demo.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {

//    @Query(value = "SELECT * from Train where f.departure = :departture and f.destination =:destination" +
//    "and date(f.departure_date) = date(:date) and f.seat >  0", nativeQuery = true);
//    List<Train> getAvailableTrains(String departure, string destination, Date date);
}
