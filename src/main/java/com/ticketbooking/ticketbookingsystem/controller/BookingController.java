package com.ticketbooking.ticketbookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ticketbooking.ticketbookingsystem.model.Booking;
import com.ticketbooking.ticketbookingsystem.service.BookingService;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class BookingController {

    @Autowired
    private BookingService service;

    @PostMapping("/book")
    public Booking book(@RequestBody Booking booking) {
        return service.bookTickets(booking);
    }

   @GetMapping("/tickets")
public Map<String, Integer> getTickets() {
    return service.getAllTickets();
}
}