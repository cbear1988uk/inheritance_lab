package Staff.TechStaff;

import Staff.Employee;

public class DatabaseAdmin extends Employee {

    private String deptName;

    public DatabaseAdmin(String name, Integer NINumber, Integer salary, String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
