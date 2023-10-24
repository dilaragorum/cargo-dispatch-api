package com.example.cargodispatchapi.helper;

public abstract class TopicNameGenerator {
    private static final String DELIVERY_PREFIX = "example.cargo.delivery";

    protected String getProductContentTopicName(String suffix) {
        return DELIVERY_PREFIX.concat(suffix);
    }

    public abstract boolean isEligible(String cargoType);

    public abstract String generateTopicName();


}
