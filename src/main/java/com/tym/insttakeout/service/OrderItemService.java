package com.tym.insttakeout.service;

import com.tym.insttakeout.dao.MenuInfoDao;
import com.tym.insttakeout.dao.OrderItemDao;
import com.tym.insttakeout.entity.Customer;
import com.tym.insttakeout.entity.MenuItem;
import com.tym.insttakeout.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    @Autowired
    private MenuInfoService menuInfoService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderItemDao orderItemDao;

    public void saveOrderItem(int menuId) {
        final OrderItem orderItem = new OrderItem();
        final MenuItem menuItem = menuInfoService.getMenuItem(menuId);
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String username = loggedInUser.getName();
        Customer customer = customerService.getCustomer(username);

        orderItem.setMenuItem(menuItem);
        orderItem.setCart(customer.getCart());
        /*
            TODO
            if want to update dup,
            1) customer.getCart().getItemList();
            2) then, we go through the list and compare if the orderItem tobe added occured;
                 if yes => update its quantity by 1
                 if no => add;

         */
        orderItem.setQuantity(1);
        orderItem.setPrice(menuItem.getPrice());
        orderItemDao.save(orderItem);
    }
}
