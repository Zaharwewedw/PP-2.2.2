package web.dao;

import web.Model.Car;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CarDaoImp implements CarDao {

    public Set<Car> getListCar(Integer i) {
        if (i > 5)  i = 5;
        Car.setIdCar(i);
        Set<Car> carList = new HashSet<>();
        Collections.addAll(carList, new Car("BMW", 134, "E60"),
        new Car("Chevrolet", 411, "Impala"),
        new Car("YAZ", 777, "Patriot"),
        new Car("Renault", 131, "Logan"),
        new Car("Mitsubishi ", 141, "Lancer"));
        return carList.stream().limit(i).collect(Collectors.toSet());
    }
}
