package com.udacity.pricing.service;

import com.udacity.pricing.domain.price.Price;

import java.util.List;

public interface PriceServices {
    List<Price> getAllPrices();
}
