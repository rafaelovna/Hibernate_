package dao.impl;

import dao.EmployeeDao;
import hibernate.HibernateSessionFactoryUtil;
import model.City;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee readById(int id) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            transaction.commit();
            return employee;
        }
    }

    @Override
    public List<Employee> readAll() {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();
            transaction.commit();
            return employees;
        }
    }

    @Override
    public void updateById(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void delete(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(employee);
            transaction.commit();
        }
    }

    @Override
    public void addEmployeeToCity(int id, Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            City city = session.get(City.class, id);
            employee.setCityId(city);
            session.persist(employee);
            transaction.commit();
        }
    }
    @Override
        public void removeCityFromEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            City cityId = employee.getCityId();
            session.remove(cityId);
            transaction.commit();
        }


    }
}
