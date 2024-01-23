import Shop.Customer;
import Shop.Order;
import Shop.Product;
import Shop.Shop;

import java.util.Objects;

import static Shop.Shop.customers;
import static Shop.Shop.products;

public class Main {
    public static void main(String[] args) {
        Shop.customers.add(new Customer("Иванов Семён Петрович", 36, "8-956-745-59-32"));
        Shop.customers.add(new Customer("Петров Сергей Гаврилович", 54, "8-963-475-32-15"));
        Shop.customers.add(new Customer("Ламатханова Таисия Олеговна", 19, "8-985-456-37-68"));
        Shop.products.add(new Product("Машинка", 1300));
        Shop.products.add(new Product("Кукла", 2450));
        Shop.products.add(new Product("Конструктор", 900));
        Shop.products.add(new Product("Машинка", 1300));
        Shop.products.add(new Product("Машинка", 7000));
        Shop.products.add(new Product("Кукла", 5600));
        Shop.orders.add(new Order(customers.get(0), products.get(2), 4));
        Shop.orders.add(new Order(customers.get(2), products.get(1), 10));
        Shop.orders.add(new Order(customers.get(1), products.get(0), 3));
        Shop.orders.add(new Order(customers.get(0), products.get(3), 6));
        Shop.orders.add(new Order(customers.get(1), products.get(5), 7));
        Shop.orders.add(new Order(customers.get(2), products.get(4), 2));

        Shop.orders.removeIf(Objects::isNull);
        System.out.println("Итоговое количество заказов = " + Shop.orders.size());
        ;
    }

}
