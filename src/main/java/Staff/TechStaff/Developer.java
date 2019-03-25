package Staff.TechStaff;

import Staff.Employee;

public class Developer extends Employee {

    private String deptName;

    public Developer(String name, Integer NINumber, Integer salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
