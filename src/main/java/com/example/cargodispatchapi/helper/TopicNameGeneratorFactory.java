package com.example.cargodispatchapi.helper;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TopicNameGeneratorFactory {
    private final Map<String, TopicNameGenerator> topicNameGeneratorMap;

    public TopicNameGeneratorFactory(Map<String, TopicNameGenerator> topicNameGeneratorMap) {
        this.topicNameGeneratorMap = topicNameGeneratorMap;
    }

    public String getTopicName(String cargoProvider) {
        return getTopicGenerator(cargoProvider).generateTopicName();
    }

    private TopicNameGenerator getTopicGenerator(String cargoProvider) {
        return topicNameGeneratorMap.get(cargoProvider);
    }
}
