package com.tym.insttakeout.service;

import com.tym.insttakeout.dao.CustomerDao;
import com.tym.insttakeout.entity.Cart;
import com.tym.insttakeout.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.smartcardio.Card;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public void signUp(Customer customer) {
        Cart cart = new Cart();
        customer.setCart(cart);
        customer.setEnabled(true);
        customerDao.signUp(customer);
    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }



}
