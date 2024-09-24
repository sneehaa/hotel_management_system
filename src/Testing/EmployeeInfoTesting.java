package Testing;


import model.Employee;
import org.junit.Test;
import view.Update.EmployeeInfo;

import static org.junit.Assert.assertEquals;

public class EmployeeInfoTesting {
    @Test
    public void updateEmployee() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        Employee employee = new Employee("Sanjeela", "sanjeela", "sanjeela@gmail.com","sanjeela");
//        int actual = employeeInfo.updateEmployee(employee);
        int expected = 0;

    }
}
