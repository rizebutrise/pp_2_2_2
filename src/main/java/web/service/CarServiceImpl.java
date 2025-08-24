package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Black", 2025));
        cars.add(new Car("Toyota", "Red", 2021));
        cars.add(new Car("Ford", "Yellow", 2023));
        cars.add(new Car("BMW", "Green", 2020));
        cars.add(new Car("Audi", "White", 2019));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
