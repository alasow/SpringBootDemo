package com.example.oop_demo.service;

import com.example.oop_demo.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        // Adding sample data
        cars.add(new Car("Toyota", "Corolla", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}

