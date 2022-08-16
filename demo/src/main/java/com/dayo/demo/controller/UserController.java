package com.dayo.demo.controller;

import com.dayo.demo.model.Booking;
import com.dayo.demo.model.Train;
import com.dayo.demo.repository.BookingRepository;
import com.dayo.demo.repository.TrainRepository;
import com.dayo.demo.repository.UserRepository;
import com.dayo.demo.service.BookingService;
import com.dayo.demo.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RequestMapping("/api/user/v1")
@RestController

public class UserController {

    @Autowired
    private UserService userService;

    private BookingService bookingService;


    @Autowired
    BookingRepository bookingRepository;

    @PostMapping(name = "/bookings/create")
    public void createBooking(Booking booking){
        this.bookingRepository.save(booking);
    }


    @PutMapping("/bookings/cancel/{id}")
    public void cancelBooking(@RequestBody() Booking booking){
        this.userService.cancelBookings(booking);
    }

    @GetMapping("/bookings/{id)")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id") long id) {
        Optional<Booking> bookingData = bookingService.getBookingById(id);

        if (bookingData.isPresent()) {
            return new ResponseEntity<>(bookingData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }











}
