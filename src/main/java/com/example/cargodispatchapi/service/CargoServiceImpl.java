package com.example.cargodispatchapi.service;

import com.example.cargodispatchapi.helper.TopicNameGeneratorFactory;
import com.example.cargodispatchapi.mapper.ShipmentMapper;
import com.example.cargodispatchapi.model.KafkaMessage;
import com.example.cargodispatchapi.model.Shipment;
import com.example.cargodispatchapi.model.ShipmentEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CargoServiceImpl implements CargoService{
    @Autowired
    private TopicNameGeneratorFactory topicNameGeneratorFactory;

    private final CargoChangePublisher cargoChangePublisher;

    @Override
    public void DispatchCargoMessage(Shipment shipment) {
        String topicName = topicNameGeneratorFactory.getTopicName(shipment.getCargoType());

        ShipmentEvent shipmentEventBody = ShipmentMapper.MAPPER.mapToShipmentEvent(shipment);

        KafkaMessage<ShipmentEvent> shipmentEvent = KafkaMessage.<ShipmentEvent>builder()
                .topic(topicName)
                .body(shipmentEventBody)
                .build();

        cargoChangePublisher.publish(shipmentEvent);
    }
}
