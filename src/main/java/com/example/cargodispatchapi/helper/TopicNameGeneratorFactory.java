package com.example.cargodispatchapi.helper;

import com.example.cargodispatchapi.exception.InvalidCargoException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TopicNameGeneratorFactory {
    private final List<TopicNameGenerator> topicNameGenerators;

    public TopicNameGeneratorFactory(List<TopicNameGenerator> topicNameGenerators) {
        this.topicNameGenerators = topicNameGenerators;
    }

    public String getTopicName(String cargoProvider) {
        return getTopicGenerator(cargoProvider).generateTopicName();
    }

    private TopicNameGenerator getTopicGenerator(String cargoProvider) {
        return topicNameGenerators.stream()
                .filter((topicNameGenerator) -> topicNameGenerator.isEligible(cargoProvider))
                .findFirst()
                .orElseThrow(() -> new InvalidCargoException("This cargo is not valid"));
    }
}
