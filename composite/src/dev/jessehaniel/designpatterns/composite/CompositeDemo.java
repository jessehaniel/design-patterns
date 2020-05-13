package dev.jessehaniel.designpatterns.composite;

import dev.jessehaniel.designpatterns.composite.Department;
import dev.jessehaniel.designpatterns.composite.HeadDepartment;
import dev.jessehaniel.designpatterns.composite.FinancialDepartment;
import dev.jessehaniel.designpatterns.composite.SalesDepartment;

public class CompositeDemo {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
        
        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
        
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        
        headDepartment.printDepartmentName();
    }
}
