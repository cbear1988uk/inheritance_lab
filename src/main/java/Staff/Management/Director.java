package Staff.Management;

import Staff.Management.Manager;

public class Director extends Manager {

    private Integer budget;

    public Director(String name, Integer NINumber, Integer salary, String deptName, Integer budget){
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public Integer getBudget(){
        return this.budget;
    }

    
}
