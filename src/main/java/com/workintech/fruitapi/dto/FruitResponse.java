package com.workintech.fruitapi.dto;

import com.workintech.fruitapi.entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}
