package com.example.cargodispatchapi.helper;

import org.springframework.stereotype.Component;

//"example.cargo.delivery-ptt-shipment-changed.0"
@Component(value = "ptt")
public class PttTopicNameGenerator extends TopicNameGenerator{
    private static final String PTT_CARGO_TOPIC_SUFFIX = "-ptt-shipment-changed.0";
    @Override
    public String generateTopicName() {
        return getProductContentTopicName(PTT_CARGO_TOPIC_SUFFIX);
    }
}
