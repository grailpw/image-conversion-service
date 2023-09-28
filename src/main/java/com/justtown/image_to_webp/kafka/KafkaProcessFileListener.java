package com.justtown.image_to_webp.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaProcessFileListener {

    @KafkaListener(topics = "image_to_webp", groupId = "media-conversion")
    void listener(@Payload String data) {
        System.out.println("Listener received: " + data);
    }
}
