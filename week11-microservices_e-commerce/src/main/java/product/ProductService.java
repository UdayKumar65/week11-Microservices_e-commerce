package product;

import java.util.List;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repo = null;
    private final KafkaTemplate<String, String> kafkaTemplate = null;

    public Product save(Product product) {
        Product saved = repo.save(product);

        kafkaTemplate.send("product-topic", "Product Created: " + saved.getId());

        return saved;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }
}