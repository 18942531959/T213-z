package com.zking.ssm.Service.imp;

import com.zking.ssm.Service.ICustomerService;
import com.zking.ssm.mapper.CustomerMapper;
import com.zking.ssm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;


    @Transactional
    @Override
    public List<Customer> queryCustomer() {
        return customerMapper.queryCustomer();
    }
}
