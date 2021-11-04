package com.it.springcloud.service.imp;

import com.it.springcloud.dao.PaymentDao;
import com.it.springcloud.entity.Payment;
import com.it.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud
 * @description: service实现类
 * @author: wf
 * @create: 2021-11-04 13:50
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;
    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
