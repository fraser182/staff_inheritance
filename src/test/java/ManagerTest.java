import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

Manager manager;


    @Before
    public void before() {
        manager = new Manager("John", "JK250552A", 40000.00, "Finance");
    }

    @Test
    public void hasName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JK250552A", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Finance", manager.getDeptName());
    }


//    Test all methods including raiseSalary and payBonus


    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(3000.00);
        assertEquals(43000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.changeName("Mr Manager");
        assertEquals("Mr Manager", manager.getName());
    }

    @Test
    public void cantChangeName() {
        manager.changeName(null);
        assertEquals("John", manager.getName());
    }
}
