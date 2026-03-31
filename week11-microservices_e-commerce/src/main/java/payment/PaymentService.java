package payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment() {
        return "Payment Successful";
    }
}