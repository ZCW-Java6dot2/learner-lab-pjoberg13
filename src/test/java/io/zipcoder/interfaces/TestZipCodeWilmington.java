package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestZipCodeWilmington {

    @Before
    public void setUp() throws Exception {
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void testFireStaff() {
        assertEquals(true, ZipCodeWilmington.getInstructorList().isEmpty());
    }

    @Test
    public void testHireStaff() {
        Instructor instructor = new Instructor("Chris");
        Instructor instructor1 = new Instructor("Dolio");
        Instructor instructor2 = new Instructor("Kris");
        ZipCodeWilmington.hire(instructor);
        ZipCodeWilmington.hire(instructor1);
        ZipCodeWilmington.hire(instructor2);
        int expected = 3;
        assertEquals(expected, ZipCodeWilmington.getInstructorList().size());
    }
}