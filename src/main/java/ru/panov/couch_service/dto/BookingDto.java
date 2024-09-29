package ru.panov.couch_service.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {

    private Long id;
    private Long personId;
    private Long executorId;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateTime;

    @Override
    public String toString() {
        return "BookingDto{" +
                "id=" + id +
                ", personId=" + personId +
                ", executorId=" + executorId +
                ", dateTime=" + dateTime +
                '}';
    }
}
