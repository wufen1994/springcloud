package com.it.springcloud.service;

import com.it.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
public interface PaymentService {
    public int save(Payment payment);
    public Payment getPaymentById(Long id);

}
