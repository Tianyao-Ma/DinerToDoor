package com.tym.insttakeout.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="cart")
public class Cart implements Serializable {
    private static final long serialVersionUID = 8436097833452420298L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double totalPrice;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrderItem> orderItemList;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public Cart setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
        return this;
    }

    public int getId() {
        return id;
    }

    public Cart setId(int id) {
        this.id = id;
        return this;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Cart setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
}
