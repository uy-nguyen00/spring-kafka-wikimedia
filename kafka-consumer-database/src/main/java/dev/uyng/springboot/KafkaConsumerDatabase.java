package dev.uyng.springboot;

import dev.uyng.springboot.entity.WikimediaData;
import dev.uyng.springboot.repository.WikimediaDataRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerDatabase {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerDatabase.class);
    private final WikimediaDataRepository wikimediaDataRepository;

    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) {
        LOGGER.info("Received message -> {}", message);

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(message);

        wikimediaDataRepository.save(wikimediaData);
    }
}
