package com.edu.cofee_production.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.cofee_production.entity.Coffee;
import com.edu.cofee_production.services.CoffeeService;

@RestController
@RequestMapping("/coffee")
public class Controller {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping
    public List<Coffee> getAllCoffee() {
        return coffeeService.getAllCoffee();
    }

    @GetMapping("/{name}")
    public Coffee getCoffeeByName(@PathVariable String name) {
        return coffeeService.getCoffeeByName(name);
    }

    @PostMapping
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        return coffeeService.addCoffee(coffee);
    }

    @DeleteMapping("/{name}")
    public void deleteCoffeeByName(@PathVariable String name) {
        coffeeService.deleteCoffeeByName(name);
    }
}
