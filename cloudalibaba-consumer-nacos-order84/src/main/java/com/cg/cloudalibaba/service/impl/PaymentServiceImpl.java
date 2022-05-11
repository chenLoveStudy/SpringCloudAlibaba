package com.cg.cloudalibaba.service.impl;

import com.cg.cloudalibaba.service.PaymentService;
import org.springframework.stereotype.Service;
//降级类需加入容器，不然报错
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentSQL(Long id) {
        return "服务降级返回,没有该流水信息"+id+"PaymentServiceImpl........";
    }
}
