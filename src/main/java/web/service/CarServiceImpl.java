package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService{
    public List<Car> cars;
    @Override
    public List<Car> carSheet(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Focus", 90));
        cars.add(new Car("Nissan", "X-Trail", 145));
        cars.add(new Car("Daewoo", "Matiz", 60));
        cars.add(new Car("Skoda", "Rapid", 110));
        cars.add(new Car("Dodge", "Ram TRX", 700));
    }

}
