package web.dao;

import web.Model.Car;
import java.util.Set;

public interface CarDao {
    Set<Car> getListCar(Integer i);
}
