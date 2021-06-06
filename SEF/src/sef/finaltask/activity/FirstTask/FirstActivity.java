package sef.finaltask.activity.FirstTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstActivity {
    public static void main(String[] args) {

        Employee id1 = new Employee(1, "cabin crew", "Emirates", 1000);
        Employee id2 = new Employee(2, "cabin crew", "Emirates", 1500);
        Employee id3 = new Employee(3, "cabin crew", "Emirates", 2000);
        Employee id4 = new Employee(4, "cabin crew", "Emirates", 2500);
        Employee id5 = new Employee(5, "cabin crew", "Emirates", 3000);


        ArrayList<Employee> list = new ArrayList();
        list.add(id1);
        list.add(id2);
        list.add(id3);
        list.add(id4);
        list.add(id5);

// Sort list
        System.out.println("sort list");
        for (Employee employee : list) {
            System.out.println(employee.getSalary());
        }

        for (Employee employee : list) {
            System.out.println("Salary for: " + employee.getFirstName() + " is: " + employee.getSalary());
        }

        System.out.println("Biggest salary: " + newSalaryComparator(id1,id2, id3, id4, id5);

    }

    private static double newSalaryComparator(Employee id1, Employee id2, Employee id3, Employee id4 , Employee employee2) {
        return Math.max(id1.getEmployeeID(), .getSalary(), employee2.getSalary());
    }

}
