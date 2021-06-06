package sef.finaltask.activity.FirstTask;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void testcheckEmployeeCreatedProrerly(){
        Employee employee = new Employee();
        employee.setFirstName("Jake");
        assertEquals("I am an error message", "Jake", employee.getFirstName());

        employee.setAge(30);
        assertEquals("I am an error message", 30, employee.getAge());
    }


    public void testCheckEmployeeSecondConstructor(){
        int ID = 1;
        String job = "job1";
        String company = "company1";
        double salary = 1000;
        Employee employee = new Employee(ID, job, company, salary);

        assertEquals("Error in constructor", ID, employee.getEmployeeID());
        assertEquals("Error in constructor", job, employee.getJobTitle());
        assertEquals("Error in constructor",company, employee.getCompanyName());
    }

    public void testCheckEmployeeThirdConstructor(){
        String firstName = "Jade";
        int age = 30;
        Employee employee = new Employee(firstName, age);

        assertEquals("Error in constructor", firstName, employee.getFirstName());
        assertEquals("Error in constructor", age, employee.getAge());
    }

    public void testCheckEmployeeIntroduction(){
        String intro = "My name is John and I am 30 years old.\n I am working as cabin crew in Emirates.";
        Employee employee = new Employee("John", 30);
        employee.setJobTitle("cabin crew");
        employee.setCompanyName("Emirates");
        assertEquals("Unexpected result of intro", intro, employee.introduce());
    }
}
