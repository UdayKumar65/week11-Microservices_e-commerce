package notification;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "product-topic")
    public void notifyUser(String msg) {
        System.out.println("Notification sent: " + msg);
    }
}