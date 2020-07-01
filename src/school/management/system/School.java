package school.management.system;

import java.util.List;

/**
 * can have many teachers and students
 * will implement Teacher and student
 * using Arraylist
 */
public class School {

   // private Teacher[] teacher= new Teacher[5];  array

    private List<Teacher> teachers;  //vector
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     *
     * @param teachers list of teachers
     * @param students list of students
     */
    public School(List<Teacher> teachers, List<Student> students)
    {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers()
    {
        return teachers;
    }

    /**
     *
     * @param teacher we can add a teacher in teachers list
     */
    public void addTeachers(Teacher teacher)
    {
        teachers.add(teacher);
    }

    public List<Student> getStudents()
    {
        return students;
    }

    /**
     *
     * @param student we will add a student to update students list
     */
    public void addStudents(Student student)
    {
        students.add(student);
    }

    public int getTotalMoneyEarned()
    {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int MoneyEarned)
    {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent()
    {
        return totalMoneySpent;
    }

    /**
     *
     * @param MoneySpent -> money spent for teacher salary
     */
    public void updateTotalMoneySpent(int MoneySpent)
    {
        totalMoneySpent -= MoneySpent;
    }



}
