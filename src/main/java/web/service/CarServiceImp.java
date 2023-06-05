package web.service;

import web.Model.Car;
import web.dao.CarDaoImp;
import java.util.Set;

public class CarServiceImp implements CarService {
    CarDaoImp carDaoImp = new CarDaoImp();

    @Override
    public Set<Car> getListCar(Integer i) {
        return carDaoImp.getListCar(i);
    }
}
