package com.zking.ssm.Service.imp;

import com.zking.ssm.Service.IOrderService;
import com.zking.ssm.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IOrderServiceTest extends BaseTestCat{
    @Autowired
    private IOrderService iOrderService;

    @Test
    public void querySingeOrder() {
        Order order = iOrderService.querySingeOrder(1);
        System.out.println(order);
    }
}