package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * intitialize the object
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name,int salary) {
        this.id = id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //only salary will change by time
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }

    /**
     * gives salary to teachers
     * @param salary
     */
    public void receiveSalary(int salary)
    {
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "\n\nName of the teacher: "+name
                +"\nSalary: "+salary
                +"\nSalary earned "+salaryEarned;
    }
}


