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


}



