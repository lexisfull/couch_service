package ru.panov.couch_service.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.panov.couch_service.dto.BookingDto;
import ru.panov.couch_service.service.BookingService;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final BookingService bookingService;

    @KafkaListener(topics = "topic1", groupId = "groupId",
            containerFactory = "kafkaListenerContainerFactory")
    public void listen(@Payload BookingDto bookingDto) {
        log.info("Получено бронирование: {}", bookingDto);
        bookingService.saveBooking(bookingDto);
    }
}
