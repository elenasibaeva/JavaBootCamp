package sef.finaltask.activity.FirstTask;

public class Person {
    private String firstName;
    private int age;

// add method of introduce of person
// --> "My name is <name> and I am <age> old"

//Behavior - write default constructor.
    public Person () {
        this.firstName = "Unknown";
        this.age = 0;
    }

//Behavior - write parameterized constructor
    public Person (String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

// write getter for String firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        try {
            if (firstName.matches(".5&6/")) {
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.println("Name is containing numbers");
        }
        this.firstName = firstName;
    }
//write getter for int age
      public int getAge(){
        return this.age;
      }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s and I am %d age old", getFirstName(), getAge());
    }



}