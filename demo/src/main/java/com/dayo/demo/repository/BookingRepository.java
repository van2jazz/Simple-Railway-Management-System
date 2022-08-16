package com.dayo.demo.repository;

import com.dayo.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

//    @Query(value = "Update Booking SET ticketStatus = isCancelled WHERE BOOKED(false)")
//    public void cancelBooking(boolean);



}


