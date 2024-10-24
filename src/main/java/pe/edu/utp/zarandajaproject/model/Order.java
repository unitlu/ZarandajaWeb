package pe.edu.utp.zarandajaproject.model;

import javax.swing.plaf.nimbus.State;
import java.sql.Date;

public class Order {
    private int id;
    private Date date;
    private StateOrder stateOrder;
    private float total;
    private Customer customer;
    private DeliveryDriver deliveryDriver;
    private Manager manager;
    private Cook cook;
    private Restaurant restaurant;

    // Constructor vacío
    public Order() {}

    public Order(int id, Date date, StateOrder stateOrder, float total, Customer customer, DeliveryDriver deliveryDriver, Manager manager, Cook cook, Restaurant restaurant) {
        this.id = id;
        this.date = date;
        this.stateOrder = stateOrder;
        this.total = total;
        this.customer = customer;
        this.deliveryDriver = deliveryDriver;
        this.manager = manager;
        this.cook = cook;
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StateOrder getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(StateOrder stateOrder) {
        this.stateOrder = stateOrder;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryDriver getDeliveryDriver() {
        return deliveryDriver;
    }

    public void setDeliveryDriver(DeliveryDriver deliveryDriver) {
        this.deliveryDriver = deliveryDriver;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
