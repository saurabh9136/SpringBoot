package com.edu.cofee_production.entity;

public class Coffee {

    private String name;
    private double price;

    public Coffee() {}

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

