package com.example.cargodispatchapi.service;

import com.example.cargodispatchapi.model.KafkaMessage;
import com.example.cargodispatchapi.utility.JsonConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final JsonConverter jsonConverter;
    public <T> void publish(KafkaMessage<T>kafkaMessage) {
        String message = jsonConverter.objectToJson(kafkaMessage.getBody());

        kafkaTemplate.send(kafkaMessage.getTopic(), message);
    }

}
