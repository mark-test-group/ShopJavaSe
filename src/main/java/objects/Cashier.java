package objects;


import interfaces.ICashier;
import lombok.*;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cashier implements ICashier {
    private String name;
    private Buyer buyer;
    private Product product;

    private ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void sell(Product product) {
        productList.remove(product);
        transaction(product);
        }

    @Override
    public void transaction(Product product) {
          System.out.println("Кассир: " + name + " произвел/а продажу");
            System.out.println("Товар: " + product.getName());
            System.out.println("Покупатель: " + buyer.getName());

    }

    @Override
    public void showAvailableProduct() {
        for (Product product1 : productList) {
            System.out.println("Товары в наличии: " + product1.getName()
            );
        }
    }

    @Override
    public void addProd(Product product) {
        productList.add(product);
    }


}




