package com.cg.cloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cg.cloudalibaba.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class CircleBreakerController {
    public static final String SERVICE_URL = "http://nacos-payment-provider";
    //==================OpenFeign
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/openfeign/{id}")
    public String paymentSQL(@PathVariable("id") Long id)
    {
        if(id == 4)
        {
            throw new RuntimeException("没有该id");
        }
        return paymentService.paymentSQL(id);
    }

}


