package com.dayo.demo.service;

import com.dayo.demo.model.Booking;
import com.dayo.demo.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private BookingRepository bookingRepository;

    public UserService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    public void cancelBookings(Booking booking){
        this.bookingRepository.save(booking);
    }

}
