import Staff.Employee;
import Staff.Management.Director;
import Staff.Management.Manager;
import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Developer developer;
    DatabaseAdmin databaseAdmin;
    Director director;

    @Test
    public void hasName(){
        director = new Director("Martin", 24680, 62000, "Top Floor", 300000);
        databaseAdmin = new DatabaseAdmin("Mikel", 13579, 38000, "DB");
        developer = new Developer("David", 56789, 40000, "Front End");
        manager = new Manager("Carl", 12345, 30000, "Accounting");
        assertEquals("Carl", manager.getName());
        assertEquals("David", developer.getName());
        assertEquals("Mikel", databaseAdmin.getName());
        assertEquals("Martin", director.getName());
    }

    @Test
    public void hasNINumber(){
        director = new Director("Martin", 24680, 62000, "Top Floor", 300000);
        databaseAdmin = new DatabaseAdmin("Mikel", 13579, 38000, "DB");
        developer = new Developer("David", 56789, 40000, "Front End");
        manager = new Manager("Ryan", 34567, 23000, "Reception");
        assertEquals(34567, manager.getNINumber(), 0.01);
        assertEquals(56789, developer.getNINumber(), 0.01);
        assertEquals(13579, databaseAdmin.getNINumber(), 0.01);
        assertEquals(24680, director.getNINumber(), 0.01);
    }

    @Test
    public void hasDeptName(){
        director = new Director("Martin", 24680, 62000, "Top Floor", 300000);
        databaseAdmin = new DatabaseAdmin("Mikel", 13579, 38000, "DB");
        developer = new Developer("David", 56789, 40000, "Front End");
        manager = new Manager("Ryan", 34567, 23000, "Reception");
        assertEquals("Reception", manager.getDeptName());
        assertEquals("Front End", developer.getDeptName());
        assertEquals("DB", databaseAdmin.getDeptName());
        assertEquals("Top Floor", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director = new Director("Martin", 24680, 62000, "Top Floor", 300000);
        databaseAdmin = new DatabaseAdmin("Mikel", 13579, 38000, "DB");
        developer = new Developer("David", 56789, 40000, "Front End");
        manager = new Manager("Marty", 23456, 32000, "HR");
        assertEquals(64000, manager.raiseSalary(), 0.01);
        assertEquals(80000, developer.raiseSalary(), 0.01);
        assertEquals(76000, databaseAdmin.raiseSalary(), 0.01);
        assertEquals(124000, director.raiseSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        director = new Director("Martin", 24680, 62000, "Top Floor", 300000);
        databaseAdmin = new DatabaseAdmin("Mikel", 13579, 38000, "DB");
        developer = new Developer("David", 56789, 40000, "Front End");
        manager = new Manager("Marty", 23456, 32000, "HR");
        assertEquals(32320, manager.payBonus(), 0.01);
        assertEquals(40400, developer.payBonus(), 0.01);
        assertEquals(38380, databaseAdmin.payBonus(), 0.01);
        assertEquals(62620, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        director = new Director("Martin", 24680, 62000, "Top Floor", 300000);
        assertEquals(300000, director.getBudget(), 0.01);
    }


}
