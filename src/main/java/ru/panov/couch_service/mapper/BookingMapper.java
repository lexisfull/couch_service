package ru.panov.couch_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.panov.couch_service.dto.BookingDto;
import ru.panov.couch_service.entity.Booking;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookingMapper {
    BookingDto toBookingDto(Booking booking);
    Booking toBooking(BookingDto bookingDto);
}
