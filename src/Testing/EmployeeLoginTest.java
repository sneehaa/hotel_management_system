package Testing;

import controller.EmployeeController;
import model.Employee;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EmployeeLoginTest {
    @Test
    public void loginEmployee(){
        EmployeeController employeeController=new EmployeeController();
        Employee employee= new Employee();
        Employee actual=employeeController.loginEmployeePS("sanjeela", "sanjeela123");
        String expected = null;
        assertEquals(actual,expected);

    }
}

