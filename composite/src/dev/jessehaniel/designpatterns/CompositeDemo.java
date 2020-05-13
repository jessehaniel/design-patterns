package dev.jessehaniel.designpatterns;

import dev.jessehaniel.designpatterns.base.Department;
import dev.jessehaniel.designpatterns.composite.HeadDepartment;
import dev.jessehaniel.designpatterns.leaf.FinancialDepartment;
import dev.jessehaniel.designpatterns.leaf.SalesDepartment;

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
