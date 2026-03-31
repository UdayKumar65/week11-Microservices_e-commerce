package order;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ProductEventConsumer {

    @KafkaListener(topics = "product-topic", groupId = "order-group")
    public void consume(String message) {
        System.out.println("Received Event: " + message);
    }
}