package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {

    ArrayList<Student> studentList = TechConnect.getStudents();
    ArrayList<Instructor> instructorList = ZipCodeWilmington.getInstructorList();
    HashMap<String, Person> roster = new HashMap<String, Person>();

    public ClassRoom() {
        for(Student aStudent : studentList) {
            roster.put(aStudent.getName(), aStudent);
        }
        for(Instructor anInstructor : instructorList) {
            roster.put(anInstructor.getName(), anInstructor);
        }
    }

    public HashMap<String, Person> getRoster() {
        return roster;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Instructor> getInstructorList() {
        return instructorList;
    }
}
