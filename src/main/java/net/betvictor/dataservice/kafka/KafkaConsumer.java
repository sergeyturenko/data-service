package net.betvictor.dataservice.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.betvictor.dataservice.kafka.model.StatisticModel;
import net.betvictor.dataservice.service.StatisticService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final StatisticService statisticService;

    @KafkaListener(topics = "words.processed")
    void listenWithFilter(
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
            @Payload StatisticModel statisticModel) {
        log.info("Incoming message: partition={}, message={}", partition, statisticModel);
        statisticService.add(statisticModel);
    }

}
