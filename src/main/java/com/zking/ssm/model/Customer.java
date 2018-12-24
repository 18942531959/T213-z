package com.zking.ssm.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
public class Customer implements Serializable {
    private Integer customerId;

    private String customerName;

    private List<Order> orders=new ArrayList<>();

    public List<Order> getOrder() {
        return orders;
    }

    public void setOrder(List<Order> order) {
        this.orders = order;
    }

    public Customer(Integer customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Customer() {
        super();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}