package com.example.cargodispatchapi.service;

import com.example.cargodispatchapi.helper.TopicNameGeneratorFactory;
import com.example.cargodispatchapi.mapper.ShipmentMapper;
import com.example.cargodispatchapi.model.KafkaMessage;
import com.example.cargodispatchapi.model.DispatchRequest;
import com.example.cargodispatchapi.model.ShipmentEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CargoServiceImpl implements CargoService {

    private final TopicNameGeneratorFactory topicNameGeneratorFactory;

    private final KafkaProducer kafkaProducer;

    @Override
    public void DispatchCargoMessage(DispatchRequest dispatchRequest) {
        String topicName = topicNameGeneratorFactory.getTopicName(dispatchRequest.getCargoType());

        ShipmentEvent shipmentEventBody = ShipmentMapper.MAPPER.mapToShipmentEvent(dispatchRequest);

        KafkaMessage<ShipmentEvent> shipmentEvent = KafkaMessage.<ShipmentEvent>builder()
                .topic(topicName)
                .body(shipmentEventBody)
                .build();

        kafkaProducer.publish(shipmentEvent);
    }
}
