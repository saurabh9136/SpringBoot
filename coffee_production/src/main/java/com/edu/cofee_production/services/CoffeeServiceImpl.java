package com.edu.cofee_production.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.stereotype.Service;

import com.edu.cofee_production.entity.Coffee;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    private List<Coffee> coffeeList = new ArrayList<>();
    public CoffeeServiceImpl() {
        coffeeList.add(new Coffee("Espresso", 250));
        coffeeList.add(new Coffee("Cappuccino", 300));
        coffeeList.add(new Coffee("Latte", 350));
        coffeeList.add(new Coffee("Mocha", 400));
        coffeeList.add(new Coffee("Americano", 200));
    }
    @Override
    public Coffee addCoffee(Coffee coffee) {
        coffeeList.add(coffee);
        return coffee;
    }

    @Override
    public List<Coffee> getAllCoffee() {
        return coffeeList;
    }

    @Override
    public Coffee getCoffeeByName(String name) {
        for (Coffee coffee : coffeeList) {
            if (coffee.getName().equals(name)) {
                return coffee;
            }
        }
        return null;
    }

    @Override
    public void deleteCoffeeByName(String name) {
        Iterator<Coffee> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            Coffee coffee = iterator.next();
            if (coffee.getName().equals(name)) {
                iterator.remove();
                break;
            }
        }
    }
}


