package com.dayo.demo.service;

import com.dayo.demo.model.Booking;
import com.dayo.demo.repository.AdminRepository;
import com.dayo.demo.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {


    private BookingRepository bookingRepository;

    public AdminService(AdminRepository adminRepository, BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings(){
        return this.bookingRepository.findAll();
    }

    //Optional
    public Optional<Booking> getBookingById(long id){
        return this.bookingRepository.findById(id);
    }


}
