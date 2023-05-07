package com.example.showcaseconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class showcaseListener {

    @KafkaListener(topics = "${topic.update-process}", groupId = "spring.kafka.consumer.group-id")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group: " + message);
    }

}
