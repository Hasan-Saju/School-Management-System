package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //initialize the object
    //grade means which class the student study in
    //Fees for every student is 22000Tk
    //intially fees paid=0
    public Student(int id, String name, int grade)
    {
        this.id= id;        //first id from this class and 2nd one from argument
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=22000;
    }

    //we will never change a students name, id

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * receive tuition fees
     * @param fees= the student will pay
     */
    public void payfees(int fees)
    {
        feesPaid = feesPaid+fees;
        School.updateTotalMoneyEarned(fees);
    }

    /**
     * return the details, way of getting the private data
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainFees()
    {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "\n\nStudent's name: "+name+
                "\nTotal fees paid: "+feesPaid+
                "\nFees Remaining: "+getRemainFees();
    }

}
