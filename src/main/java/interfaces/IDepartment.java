package interfaces;

import objects.Cashier;
import objects.Product;

import java.util.ArrayList;

public interface IDepartment {

    String getName();

    ArrayList<Product> getProductsList();
    ArrayList<Cashier> getCashiersList();

    void addCashier(Cashier cashier);

    void addProduct(Product product);

    void removeProduct(Product product);

}
