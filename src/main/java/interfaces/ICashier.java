package interfaces;

import objects.Product;

import java.util.ArrayList;

public interface ICashier {

    String getName();

    ArrayList<Product> getProductList();

    void sell(Product product);

    void transaction(Product product);

    void showAvailableProduct();

    void addProd(Product product);


}
