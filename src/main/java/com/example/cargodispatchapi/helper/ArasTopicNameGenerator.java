package com.example.cargodispatchapi.helper;

import org.springframework.stereotype.Component;

// "example.cargo.delivery.aras-shipment-changed.0"
@Component(value = "aras")
public class ArasTopicNameGenerator extends TopicNameGenerator{

    private static final String ARAS_CARGO_TOPIC_SUFFIX = "-aras-shipment-changed.0";
    @Override
    public String generateTopicName() {
        return getProductContentTopicName(ARAS_CARGO_TOPIC_SUFFIX);
    }
}
