package com.it.springcloud.controller;

import com.it.springcloud.entity.CommonResult;
import com.it.springcloud.entity.Payment;
import com.it.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description: 控制层
 * @author: wf
 * @create: 2021-11-04 13:55
 */
@RestController
@Slf4j
public class PaymentController extends BaseController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment/save")
    public CommonResult save(@RequestBody Payment payment){
        int result = paymentService.save(payment);
        if (result > 0){
            return this.createResponse(200, "保存成功", result);
        }else {
            return this.errorRespoonse(100, "新增失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentById(id);
        if (null != payment){
            return this.createResponse(200, "查询成功", payment);
        }else {
            return this.errorRespoonse(100, "查询失败");
        }
    }
}
