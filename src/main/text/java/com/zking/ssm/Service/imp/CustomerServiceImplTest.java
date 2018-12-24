package com.zking.ssm.Service.imp;

import com.zking.ssm.Service.ICustomerService;
import com.zking.ssm.model.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImplTest extends  BaseTestCat{
        @Autowired
        private ICustomerService iCustomerService;

    @Test
    public void queryCustomer() {
        List<Customer> customers = iCustomerService.queryCustomer();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}