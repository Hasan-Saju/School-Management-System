package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;

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
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //only salary will change by time
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


}


