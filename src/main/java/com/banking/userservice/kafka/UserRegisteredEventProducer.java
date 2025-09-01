package com.banking.userservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserRegisteredEventProducer {

    @Autowired
    private KafkaTemplate<String, UserRegisteredEvent> kafkaTemplate;

    private static final String TOPIC = "user-registered-topic";

    public void sendUserRegisteredEvent(UserRegisteredEvent event) {
        kafkaTemplate.send(TOPIC, event);
    }
}
