package objects;


import interfaces.IDepartment;
import interfaces.IShop;
import lombok.*;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shop implements IShop {

    private String name;
    private Cashier cashier;
    private Buyer buyer;
    private Department department;
    private Product product;

    ArrayList<IDepartment> departments = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void addDepartment(IDepartment department) {
        departments.add(department);
    }

    @Override
    public void sell() {
        for (IDepartment department : departments) {
            System.out.println("Отдел: " + department.getName() + " произвел продажу");
            department.removeProduct(product);
            for (Product product1 : department.getProductsList()) {
                System.out.println("Товар: " + product1.getName());
             for (Cashier cashier1: department.getCashiersList()){
                 System.out.println("Кассир: " +cashier1.getName() + "; Покупатель: "+ buyer.getName());
             }
            }
        }
    }
}



