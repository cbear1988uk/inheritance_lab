package Staff;

public abstract class Employee {

    private String name;
    private Integer NINumber;
    private Integer salary;

    public Employee(String name, Integer NINumber, Integer salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public Integer getNINumber(){
        return this.NINumber;
    }

    public Integer raiseSalary(){
        return this.salary * 2;
    }

    public Integer payBonus(){
        return salary / 100 + salary;
    }
}
