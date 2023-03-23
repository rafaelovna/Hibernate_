package dao.impl;

import dao.CityDao;
import hibernate.HibernateSessionFactoryUtil;
import model.City;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityDaoImpl implements CityDao {
    @Override
    public void create(City city) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
        }
    }

    @Override
    public City readById(int id) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            City city = session.get(City.class, id);
            transaction.commit();
            return city;
        }
    }

    @Override
    public List<City> readAll() {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            List<City> cities = session.createQuery("from City", City.class).list();
            transaction.commit();
            return cities;
        }
    }

    @Override
    public void updateById(int id) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            City city = session.get(City.class, id);
            session.update(city);
            transaction.commit();
        }
    }

    @Override
    public void delete(City city) {
        try (Session session = HibernateSessionFactoryUtil.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();
        }
    }
}
