package com.ticketbooking.ticketbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ticketbooking.ticketbookingsystem.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}