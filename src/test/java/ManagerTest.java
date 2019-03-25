import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {


    Manager manager;

    @Before
    public void before(){
        manager = new Manager("David Brent", "NI123456M", 50000.00, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("David Brent", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI123456M", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.001);

    }

    @Test
    public void hasDepartment() {
        assertEquals("Sales", manager.getDept());
    }

    @Test
    public void canChangeName() {
    manager.setName("Gareth Keenan");
    assertEquals("Gareth Keenan", manager.getName());
    }

    @Test
    public void canChangeNI() {
        manager.setNiNumber("NI654321F");
        assertEquals("NI654321F", manager.getNiNumber());
    }

    @Test
    public void canChangeSalary() {
        manager.setSalary(40000.00);
        assertEquals(40000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canChangeDepartment() {
        manager.setDepartment("office");
        assertEquals("office", manager.getDept());

    }

    @Test
    public void canRaiseSalary() {
        manager.incSalary(1.10);
        assertEquals(55000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(500, manager.payBonus(), 0.001);


    }
}
