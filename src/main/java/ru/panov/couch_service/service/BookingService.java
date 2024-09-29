package ru.panov.couch_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.panov.couch_service.dao.BookingRepository;
import ru.panov.couch_service.dto.BookingDto;
import ru.panov.couch_service.mapper.BookingMapper;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public void saveBooking(BookingDto bookingDto) {
        bookingRepository.save(bookingMapper.toBooking(bookingDto));
    }
}
