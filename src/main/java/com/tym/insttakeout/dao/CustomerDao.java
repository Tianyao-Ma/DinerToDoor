package com.tym.insttakeout.dao;

import com.tym.insttakeout.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
    public void signUp(Customer customer) {

    };

    public Customer getCustomer(String email) {
        return new Customer.CustomerBuilder().build();
    }

}
