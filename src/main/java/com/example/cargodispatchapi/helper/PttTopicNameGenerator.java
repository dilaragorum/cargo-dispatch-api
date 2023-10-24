package com.example.cargodispatchapi.helper;

import org.springframework.stereotype.Component;

//"example.cargo.delivery-ptt-shipment-changed.0"
@Component
public class PttTopicNameGenerator extends TopicNameGenerator{
    private static final String PTT_CARGO_TOPIC_SUFFIX = "-ptt-shipment-changed.0";

    @Override
    public boolean isEligible(String cargoType) {
        return cargoType.equals("ptt");
    }
    @Override
    public String generateTopicName() {
        return getProductContentTopicName(PTT_CARGO_TOPIC_SUFFIX);
    }
}
