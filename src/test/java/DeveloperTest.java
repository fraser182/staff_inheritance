import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void before() {
        developer = new Developer("David", "JE34232W", 35000.00);
    }


    //    Again test all methods for both classes.

    @Test
    public void hasName() {
        assertEquals("David", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JE34232W", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }


//    Test all methods including raiseSalary and payBonus


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(3000.00);
        assertEquals(38000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, developer.payBonus(), 0.01);
    }
}
