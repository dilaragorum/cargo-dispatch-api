package com.example.cargodispatchapi.helper;

import org.springframework.stereotype.Component;

// "example.cargo.delivery.aras-shipment-changed.0"
@Component
public class ArasTopicNameGenerator extends TopicNameGenerator{

    private static final String ARAS_CARGO_TOPIC_SUFFIX = "-aras-shipment-changed.0";

    @Override
    public boolean isEligible(String cargoType) {
        return cargoType.equals("aras");
    }

    @Override
    public String generateTopicName() {
        return getProductContentTopicName(ARAS_CARGO_TOPIC_SUFFIX);
    }
}
