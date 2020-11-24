package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPerson {

    @Test
    public void testSetName() {
        Person person = new Person("peter");
        String expected1 = "peter";
        assertEquals(expected1, person.getName());

        person.setName("Peter");
        String expected2 = "Peter";
        assertEquals(expected2, person.getName());
    }

    @Test
    public void constructorTest() {
        Person person = new Person("peter");
        assertEquals(true, person instanceof Person);
        String expected = "peter";
        assertEquals(expected, person.getName());
    }

}
