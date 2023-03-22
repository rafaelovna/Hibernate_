import dao.CityDao;
import dao.EmployeeDao;
import dao.impl.CityDaoImpl;
import dao.impl.EmployeeDaoImpl;
import model.City;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Application {

    public static EmployeeDao employeeDao = new EmployeeDaoImpl();
    public static CityDao city = new CityDaoImpl();
    public static void main(String[] args) {


//        Employee employee1 = new Employee("Sveta", "Polokhova", "f", 33, 1);
//        Employee employee2 = new Employee("Vanya", "Kirov", "m", 42, 2);
//        Employee employee3 = new Employee("Viki", "Morozova", "f", 25, 3);
//        // Создаем объект
//        employeeDao.create(employee1);
//        employeeDao.create(employee2);
//        employeeDao.create(employee3);

        // Получаем объект по id
//        System.out.println(employeeDao.readById(3));
//
        // Получаем полный список объектов
//        List<Employee> list = employeeDao.readAll();
//        for (Employee employee : list) {
//            System.out.println(employee);
//        }
        // Изменяем объект
//        employeeDao.updateById(employee2);

        // Удаляем объект
//        employeeDao.delete(employee3);

        // Добавляем сотрудников в город
//        Employee employee3 = new Employee("Lina", "Morozova", "f", 25);
//        employeeDao.addEmployeeToCity(3, employee3);

        //Удаляем город у сотрудника
//        Employee employee = employeeDao.readById(15);
//        employeeDao.removeCityFromEmployee(employee);

//        *************************************************************************************************
        // Создаем объект
//        City city1 = new City("Rostov");
//        City city2 = new City("Perm");
//        City city3 = new City("Rim");
//        city.create(city1);
//        city.create(city2);
//        city.create(city3);

        // Получаем объект по id
//        System.out.println(city.readById(3));

        // Получаем полный список объектов
//        System.out.println(city.readAll());

        // Изменяем объект
//        city.updateById(4);

        // Удаляем объект
//        city.delete(city1);
    }
}
