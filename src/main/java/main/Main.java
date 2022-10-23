package main;

import objects.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setName("Ozon");
        Buyer buyer = new Buyer("Наталья");
        shop.setBuyer(buyer);

        Department department = new Department();
        department.setName("Электроника и бытовая техника");
        shop.addDepartment(department);

        Cashier cashier = new Cashier("Алиса");
        Product product = new Product("Телевизор");

        department.addProduct(product);
        department.addCashier(cashier);

        shop.sell();











    }
}
