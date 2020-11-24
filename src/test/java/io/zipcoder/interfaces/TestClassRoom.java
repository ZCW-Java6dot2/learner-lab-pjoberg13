package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassRoom {

    @Test
    public void testGetRoster() {
        ClassRoom classRoom = new ClassRoom();
        for(Student aStudent : classRoom.getStudentList()) {
            assertTrue(classRoom.getRoster().containsKey(aStudent.getName()));
        }
        for(Instructor anInstructor : classRoom.getInstructorList()) {
            assertTrue(classRoom.getRoster().containsKey(anInstructor.getName()));
        }
    }

}