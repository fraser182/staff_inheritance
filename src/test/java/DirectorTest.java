import org.junit.Before;
import org.junit.Test;
import management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

Director director;
//    Test all methods.

    @Before
    public void before() {
        director = new Director("Alistair", "AB235472B", 60000.00, "The Company", 300000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Alistair", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AB235472B", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("The Company", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(300000.00, director.getBudget(), 0.01);
    }


    //    Test all methods including raiseSalary and payBonus


    @Test
    public void canRaiseSalary() {
        director.raiseSalary(3000.00);
        assertEquals(63000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1200, director.payBonus(), 0.01);
    }

}
