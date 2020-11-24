package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

    @Test
    public void implementationTest() {
        Student student = new Student("peter");
        assertEquals(true, student instanceof Learner);
    }

    @Test
    public void inheritanceTest() {
        Student student = new Student("peter");
        assertEquals(true, student instanceof Person);
    }

    @Test
    public void learn() {
        Student student = new Student("peter");
        int expected1 = 0;
        assertEquals(expected1, student.getTotalStudyTime(), .001);

        student.learn(5d);
        double expected2 = 5d;
        assertEquals(expected2, student.getTotalStudyTime(), .001);
    }
}