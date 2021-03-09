package com.eroger.domain;

import java.math.BigDecimal;

public class Restaurant {
    private String name;
    private Rating customerRating;
    private int distance;
    private BigDecimal price;
    private Cuisine cuisine;

    public Restaurant(String name, Rating customerRating, int distance, BigDecimal price, Cuisine cuisine) {
        this.name = name;
        this.customerRating = customerRating;
        this.distance = distance;
        this.price = price;
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public Rating getCustomerRating() {
        return customerRating;
    }

    public int getDistance() {
        return distance;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }
}