package com.edu.cofee_production.services;

import java.util.List;

import com.edu.cofee_production.entity.Coffee;

public interface CoffeeService {

	Coffee addCoffee(Coffee coffee);

    List<Coffee> getAllCoffee();

    Coffee getCoffeeByName(String name);

    void deleteCoffeeByName(String name);

	
}
