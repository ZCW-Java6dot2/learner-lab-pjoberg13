package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor("Chris");
        assertEquals(true, instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor("Chris");
        assertEquals(true, instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor("Chris");
        Student student = new Student("Peter");
        double expected1 = 0;
        assertEquals(expected1, student.getTotalStudyTime(), .001);

        instructor.teach(student, 5d);
        double expected2 = 5d;
        assertEquals(expected2, student.getTotalStudyTime(), .001);
    }

    @Test
    public void lecture() {
        Instructor instructor = new Instructor("Chris");
        Student student = new Student("Peter");
        Student student1 = new Student("Ralph");
        Student student2 = new Student("Toby");
        Student[] students = {student, student1, student2};
        instructor.lecture(students, 6);
        double expected = 6 / students.length;
        for(Student aStudent : students) {
            assertEquals(expected, aStudent.getTotalStudyTime(), .001);
        }
    }
}