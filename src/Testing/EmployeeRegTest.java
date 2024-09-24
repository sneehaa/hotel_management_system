
package Testing;

import controller.EmployeeController;
import model.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeRegTest{
    @Test

    public void registerEmployee() {
        EmployeeController employeeController = new EmployeeController();
        Employee employee = new Employee("sanjeela", "sanjeela", "sanjeela@123", "sanjeela123");
        int actual = employeeController.registerEmployeePreparedStatement(employee);
        int expected = 1;
        assertEquals(expected, actual);
    }
}


