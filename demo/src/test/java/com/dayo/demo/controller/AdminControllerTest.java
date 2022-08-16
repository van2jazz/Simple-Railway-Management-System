//package com.dayo.demo.controller;
//
//import com.dayo.demo.model.Booking;
//import com.dayo.demo.model.SeatType;
//import com.dayo.demo.model.Station;
//import com.dayo.demo.model.TicketStatus;
//import com.dayo.demo.repository.AdminRepository;
//import com.dayo.demo.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//
//class AdminControllerTest {
//
//    @Mock
//    private AdminRepository repository;
//
//    @Autowired
//    private AdminController adminController;
//
////    @Test
////    void getAllBookings() {
////        when(repository.findAll()).thenReturn(Stream.
////                of(new Booking("11", TicketStatus.UNUSED, 1500.54, SeatType.ECONOMY),
////                        new Booking("12",TicketStatus.USED, 2540.45, SeatType.FIRST_CLASS)).collect(Collectors.toList()));
////        assertEquals(2, adminController.getAllBookings().size());
////    }
//
////    @Test
////    void getBookingById() {
////        String  id = "ABC";
////        when(repository.findById(id)).thenReturn(Stream
////        .of(new Booking("ABC", 1000.36)).collect(Collectors.toList()));
////        assertEquals(1,adminController.getBookingById(id).size());
////    }
//}