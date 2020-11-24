package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTechConnect {

    @Before
    public void setUp() throws Exception {
        TechConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents() {
        assertTrue(TechConnect.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudents() {
        Student student = new Student("Peter");
        Student student1 = new Student("Ralph");
        Student student2 = new Student("Toby");
        Student[] students = {student, student1, student2};
        for(Student aStudent : students) {
            TechConnect.recruitStudent(aStudent);
        }
        int expected = 3;
        assertEquals(expected, TechConnect.getStudents().size());
    }
}