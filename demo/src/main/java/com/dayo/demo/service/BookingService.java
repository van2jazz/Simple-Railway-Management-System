package com.dayo.demo.service;

import com.dayo.demo.model.Booking;
import com.dayo.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {


    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }


//    public List<Booking> getAllBookings(){
//        return this.bookingRepository.findAll();
//    }
//
    public Optional<Booking> getBookingById(long id){
        return this.bookingRepository.findById(id);
    }
//
//    public List<Booking> getByIdContaining(String ticketId){
//        return this.bookingRepository.findByTicketIdContaining(ticketId);
//    }




}
