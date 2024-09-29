package ru.panov.couch_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.panov.couch_service.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
