package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Hasan= new Teacher(1,"Hasan",10000);
        Teacher Anika= new Teacher(2,"Anika",8000);
        Teacher Fahad= new Teacher(3,"Fahad",7000);

        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(Hasan);
        teacherList.add(Anika);
        teacherList.add(Fahad);

        Student Saju= new Student(1,"Saju",11);
        Student Rahat= new Student(2,"Rahat",8);
        Student Zafrin= new Student(3,"Zafrin",11);

        List<Student> studentList=new ArrayList<>();
        studentList.add(Saju);
        studentList.add(Rahat);
        studentList.add(Zafrin);

        School Rajuk= new School(teacherList,studentList);
        System.out.println("Money Earned by Rajuk School: "+Rajuk.getTotalMoneyEarned());
        Saju.payfees(15000);

        Teacher Faisal=new Teacher(9,""Faisal,4000);
        Rajuk.addTeachers(Faisal);
        
        Zafrin.payfees(14000);
        System.out.println("Money Earned by Rajuk School: "+Rajuk.getTotalMoneyEarned());

        System.out.println("Starting to pay Salary");
        Hasan.receiveSalary(Hasan.getSalary());
        System.out.println("Rajuk spent for salary for Saju : "+Rajuk.getTotalMoneySpent()+" Remaining amount is : "+ (Rajuk.getTotalMoneyEarned()-Rajuk.getTotalMoneySpent()) );

        Anika.receiveSalary(Anika.getSalary());
        System.out.println(Anika.getName()+" got her salary.");
        System.out.println("Now the balance for school is: "+(Rajuk.getTotalMoneyEarned()-Rajuk.getTotalMoneySpent()));


        System.out.println(Saju);
        System.out.println(Anika);
    }
}
