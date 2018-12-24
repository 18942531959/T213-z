package com.zking.ssm.Service;

import com.zking.ssm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ICustomerService {
    List<Customer> queryCustomer();
}