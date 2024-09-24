package Testing;


import controller.ReceptionistController;
import model.Receptionist;
import org.junit.Test;

import static org.junit.Assert.*;


public class ReceptionistTesting<Expected> {

    @Test
    public void registerReceptionist(){
        ReceptionistController receptionistController = new ReceptionistController();
        Receptionist receptionist = new Receptionist("snehaa", "snehaa", "sneha@123.com", "sneha12");
        int actual = receptionistController.registerReceptionistPreparedStatement(receptionist);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void loginReceptionist(){
        ReceptionistController receptionistController = new ReceptionistController();
       Receptionist receptionist = new Receptionist();
       Receptionist actual = receptionistController.loginReceptionistPS("snehaa", "snehaa123");
       String expected = null;
        assertEquals(expected , actual);

    }
}
