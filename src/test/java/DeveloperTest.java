import Staff.Management.Manager;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeveloperTest {


    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dawn Tinsley", "NI112233F", 30000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Dawn Tinsley", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("NI112233F", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        developer.setName("Jim Bowen");
        assertEquals("Jim Bowen", developer.getName());
    }

    @Test
    public void canChangeNI(){
        developer.setNiNumber("NI332211F");
        assertEquals("NI332211F", developer.getNiNumber());
    }

    @Test
    public void canChangeSalary() {
        developer.setSalary(40000.00);
        assertEquals(40000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canIncreaseSalary() {
        developer.incSalary(1.2);
        assertEquals(36000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, developer.payBonus(), 0.001);
    }
}
