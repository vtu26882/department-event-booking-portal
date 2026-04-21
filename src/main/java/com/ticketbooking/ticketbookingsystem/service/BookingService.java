package com.ticketbooking.ticketbookingsystem.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ticketbooking.ticketbookingsystem.model.Booking;
import com.ticketbooking.ticketbookingsystem.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repository;

   private Map<String, Integer> eventTickets = new HashMap<>();

public BookingService() {
    eventTickets.put("AI Seminar", 50);
    eventTickets.put("Cloud Computing workshop", 45);
    eventTickets.put("IoT Fest", 65);
}

    public Booking bookTickets(Booking booking) {

    String event = booking.getEventName();
    int requested = booking.getTickets();

    int available = eventTickets.getOrDefault(event, 0);

    if (requested <= 0) {
        throw new RuntimeException("Invalid tickets");
    }

    if (requested > available) {
        throw new RuntimeException("Not enough tickets");
    }

    eventTickets.put(event, available - requested);

    return repository.save(booking);
}

    public Map<String, Integer> getAllTickets() {
    return eventTickets;
}
}