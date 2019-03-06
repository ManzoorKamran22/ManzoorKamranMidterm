package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        EmployeeInfo emp1 = new EmployeeInfo("Zaryab", 110);
        try {
            Assert.assertEquals(emp1.getEmployeeName(), "Zaryab");
            Assert.assertEquals(emp1.getEmployeeId(), 110);
        } catch (Exception ex) {
            ex.printStackTrace();

            //Employee Bonus Unit Testing
            Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(8, 1500), 3900.0);

            //Get and Set Unit Testing
            emp1.setSalary(100000);
            Assert.assertEquals(emp1.getSalary(), 100000);

        }
    }
}
