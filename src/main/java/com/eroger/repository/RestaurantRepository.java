package com.eroger.repository;

import com.eroger.domain.Cuisine;
import com.eroger.domain.Rating;
import com.eroger.domain.Restaurant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {
    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepository() {

        restaurants.add(restaurantBuilder("DelKanpai", Rating.FIVE, 3, new BigDecimal(80), new Cuisine("Japanese")));
        restaurants.add(restaurantBuilder("Deliciousgenix", Rating.FOUR, 7, new BigDecimal(20), new Cuisine("Other")));
        restaurants.add(restaurantBuilder("Herbed Delicious", Rating.FOUR, 7, new BigDecimal(20), new Cuisine("Vietnamese")));
        restaurants.add(restaurantBuilder("Deliciousscape", Rating.THREE, 7, new BigDecimal(50), new Cuisine("Greek")));
        restaurants.add(restaurantBuilder("Hideaway Delicious", Rating.TWO, 5, new BigDecimal(40), new Cuisine("Chinese")));
        restaurants.add(restaurantBuilder("Cuts Delicious", Rating.THREE, 9, new BigDecimal(25), new Cuisine("Korean")));
        restaurants.add(restaurantBuilder("Lord Delicious", Rating.ONE, 7, new BigDecimal(35), new Cuisine("Russian")));
        restaurants.add(restaurantBuilder("Deliciousbea", Rating.FIVE, 6, new BigDecimal(50), new Cuisine("African")));
        restaurants.add(restaurantBuilder("Chowology", Rating.FIVE, 9, new BigDecimal(30), new Cuisine("Japanese")));
    }

    private Restaurant restaurantBuilder(String name, Rating rating, int distance, BigDecimal price, Cuisine cuisine) {
        return new Restaurant(name, rating, distance, price, cuisine);
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
