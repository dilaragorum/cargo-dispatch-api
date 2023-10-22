package com.example.cargodispatchapi.helper;

public abstract class TopicNameGenerator {
    private static final String DELIVERY_PREFIX = "example.cargo.delivery";

    public abstract String generateTopicName();

    protected String getProductContentTopicName(String suffix) {
        return DELIVERY_PREFIX.concat(suffix);
    }
}
