package sef.finaltask.activity.FirstTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private String companyName;
    private double salary;

    public Employee() {
        this.employeeID = -1;
        this.jobTitle = "Cabin Crew";
        this.companyName = "Emirates";
        this.salary = -1000;
    }

    public Employee(int ID, String jobTitle, String companyName, double salary){
        employeeID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(String firstName, int age){
        super.setFirstName(firstName);
        super.setAge(age);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getCompanyName(){
        return getCompanyName();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

// "My name is <name> and I am <age> years old
//I am working as <jobTitle> in <companyName>


    public String introduce() {
        return String.format("My name is %s and I am %d age old. I am working as %s in %s",
                getFirstName(), getAge(), getJobTitle(), getCompanyName());
    }
}
