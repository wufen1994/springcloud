package com.it.springcloud.dao;

import com.it.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud
 * @description: dao层
 * @author: wf
 * @create: 2021-11-04 13:37
 */
@Mapper
public interface PaymentDao {
    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
