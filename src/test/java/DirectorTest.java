import Staff.Management.Director;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("David Brent", "NI123456M", 150000.00, "Sales", 500000.00);
    }

    @Test
    public void hasBudget() {
        assertEquals(500000.00, director.getBudget(), 0.001);
    }

    @Test
    public void canChangeBudget() {
        director.setBudget(700000.00);
        assertEquals(700000.00, director.getBudget(), 0.001);
    }

    @Test
    public void canGetName() {
        assertEquals("David Brent", director.getName());

    }

    @Test
    public void canGetNI() {
        assertEquals("NI123456M", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(150000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canGetDept() {
        assertEquals("Sales", director.getDept());
    }

    @Test
    public void canChangeName() {
        director.setName("Tony Hancock");
        assertEquals("Tony Hancock", director.getName());
    }

    @Test
    public void canChangeNI() {
        director.setNiNumber("NI555444F");
        assertEquals("NI555444F", director.getNiNumber());
    }

    @Test
    public void canChangeSalary() {
        director.setSalary(130000.00);
        assertEquals(130000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canChangeDept() {
        director.setDepartment("Admin");
        assertEquals("Admin", director.getDept());
    }

    @Test
    public void canIncreaseSalary() {
        director.incSalary(1.10);
        assertEquals(165000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(3000.00, director.payBonus(), 0.001);
    }

    @Test
    public void canNotAcceptNullName() {
        director.setName(null);
        assertEquals("David Brent", director.getName());
    }

    @Test
    public void canNotAcceptNegativeInc() {
        director.incSalary(-1.05);
        assertEquals(150000.00, director.getSalary(), 0.001);
    }
}
