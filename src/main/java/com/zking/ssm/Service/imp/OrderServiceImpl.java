package com.zking.ssm.Service.imp;

import com.zking.ssm.Service.IOrderService;
import com.zking.ssm.mapper.OrderMapper;
import com.zking.ssm.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class OrderServiceImpl implements IOrderService {
        @Autowired
        private OrderMapper orderMapper;

    @Transactional
    @Override
    public Order querySingeOrder(Integer orderId) {
        return orderMapper.querySingeOrder(orderId);
    }
}
