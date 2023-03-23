package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDao {
    void create(Employee employee);

    Employee readById(int id);

    List<Employee> readAll();

    void updateById(Employee employee);

    void delete(Employee employee);

    void addEmployeeToCity(int id, Employee employee);

    void removeCityFromEmployee(Employee employee);

}
