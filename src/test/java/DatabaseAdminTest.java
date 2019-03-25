import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Chris Finch", "NI333444F", 40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Chris Finch", databaseAdmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("NI333444F", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00,databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Frank Spencer");
        assertEquals("Frank Spencer", databaseAdmin.getName());
    }

    @Test
    public void canChangeNI() {
    databaseAdmin.setNiNumber("NI999888F");
    assertEquals("NI999888F", databaseAdmin.getNiNumber());

    }

    @Test
    public void canChangeSalary() {
        databaseAdmin.setSalary(50000.00);
        assertEquals(50000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canIncSalary() {
        databaseAdmin.incSalary(1.05);
        assertEquals(42000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, databaseAdmin.payBonus(), 0.001);
    }
}
