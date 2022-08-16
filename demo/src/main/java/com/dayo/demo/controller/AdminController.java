package com.dayo.demo.controller;



import com.dayo.demo.model.Booking;
import com.dayo.demo.service.AdminService;
import com.dayo.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin/v1")

public class AdminController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private AdminService adminService;

//    @GetMapping("/bookings")
//    public ResponseEntity<List<Booking>> getAllBookings(@RequestParam(required = false) String ticketId) {
//        try {
//            List <Booking> bookings = new ArrayList<>(); //~
//
//            if (ticketId == null)
//                bookingService.getAllBookings().forEach(bookings::add);
//            else
//                bookingService.getByIdContaining(ticketId).forEach(bookings::add);
//
//            if(bookings.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity<>(bookings, HttpStatus.OK);
//
//        }catch (Exception e){
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    //new
    @GetMapping("/bookings")
    public ResponseEntity<List<Booking>> getAllBooking() {
        List<Booking> bookings = new ArrayList<>();

        bookingService.findAll().forEach(bookings::add);

        if (bookings.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/bookings/{id)")
    public ResponseEntity<Booking> getBookingById(@PathVariable("id") long id) {
        Optional<Booking> bookingData = adminService.getBookingById(id);

        if (bookingData.isPresent()) {
            return new ResponseEntity<>(bookingData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
