package dao;

import model.City;
import model.Employee;

import java.util.List;

public interface CityDao {

    void create(City city);

    City readById(int id);

    List<City> readAll();

    void updateById(int id);

    void delete(City city);

}
