package sef.finaltask.activity.FirstTask;

import junit.framework.TestCase;
import org.junit.Test;
import sef.finaltask.activity.FirstTask.Person;

public class PersonTest extends TestCase {

    @Test
    public void testPersonConstructor() {
        Person person = new Person();
        assertEquals("I am an error message", "Unknown", person.getFirstName());
    }

    @Test
    public void testPerson2() {
        Person person = new Person("Jacob", 32);
        assertEquals("I am an error message", 32, person.getAge());

    }

    @Test
    public void testPerson() {
        Person person = new Person("Jade", 30);
        String intro = "My name is" + "Jane" + " and I am" + 30 + "years old";
        assertEquals("I am error message", intro, person.introduce());
    }
}