package main;

import lombok.EqualsAndHashCode;
import objects.*;


public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setName("Ozon");

        Buyer buyer = new Buyer("Наталья");
        Department department = new Department();
        Product product = new Product("Принтер");
        Product product1 = new Product("TV");
        Product product2 = new Product("Мультиварка");
        Product product3 = new Product("Фен");
        Product product4 = new Product("ПК");

        department.setName("Электроника и бытовая техника");
        Cashier cashier = new Cashier();
        cashier.setName("Алиса");
        cashier.setBuyer(buyer);

        cashier.addProd(product);
        cashier.addProd(product1);
        cashier.addProd(product2);
        cashier.addProd(product3);
        cashier.addProd(product4);

        department.addCashier(cashier);
        cashier.showAvailableProduct();
        // изменить, чтобы продавал не магазин, а кассир, какой именно товар и кому
        cashier.sell(product);

        cashier.showAvailableProduct();

        //имеется список товаров, кассир продает товар sell(), товар удаляется из списка, метод transaction() показывает данные об операции









    }
}
