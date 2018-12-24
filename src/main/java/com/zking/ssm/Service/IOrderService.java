package com.zking.ssm.Service;

import com.zking.ssm.model.Order;
import org.springframework.stereotype.Repository;


public interface IOrderService {
    Order querySingeOrder(Integer orderId);
}