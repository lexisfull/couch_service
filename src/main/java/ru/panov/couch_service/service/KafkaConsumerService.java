package ru.panov.couch_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "topic1", groupId = "group1")
    public void listen(String message) {
        System.out.println(message);
    }
}
