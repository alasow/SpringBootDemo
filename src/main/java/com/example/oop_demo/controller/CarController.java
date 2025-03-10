package com.example.oop_demo.controller;

import com.example.oop_demo.model.Car;
import com.example.oop_demo.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }
}
