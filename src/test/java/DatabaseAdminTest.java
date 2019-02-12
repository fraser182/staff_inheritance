import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Janine", "DT453252W", 25000.00);
    }


    //    Again test all methods for both classes.

    @Test
    public void hasName() {
        assertEquals("Janine", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("DT453252W", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }


//    Test all methods including raiseSalary and payBonus


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(27000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }
}
