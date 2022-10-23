package objects;


import interfaces.IDepartment;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department implements IDepartment {

    private String name;
    private ArrayList<Cashier> cashiersList = new ArrayList<>();
    private ArrayList<Product> productsList = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addCashier(Cashier cashier) {
        cashiersList.add(cashier);
    }

    @Override
    public void addProduct(Product product) {
        productsList.add(product);
    }
    @Override
    public void removeProduct(Product product) {
        productsList.remove(product);
    }


}

