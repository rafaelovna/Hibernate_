package hibernate;

import model.City;
import model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

    private static SessionFactory factory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getFactory() {
        if (factory == null) {
            try {

                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(City.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                factory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {

                System.out.println("Исключение!" + e);

            }
        }
        return factory;
    }
}
