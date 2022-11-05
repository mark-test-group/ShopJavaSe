package interfaces;

import objects.Cashier;
import objects.Product;

import java.util.ArrayList;

public interface IDepartment {

    String getName();

    ArrayList<Cashier> getCashiersList();

    void addCashier(Cashier cashier);





}
