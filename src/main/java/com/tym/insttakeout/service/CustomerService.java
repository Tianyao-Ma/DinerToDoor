package com.tym.insttakeout.service;

import com.tym.insttakeout.dao.CustomerDao;
import com.tym.insttakeout.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    public void signUp(Customer customer) {
        customerDao.signUp(customer);
    }
    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }
}
