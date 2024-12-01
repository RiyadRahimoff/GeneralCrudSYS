package studentmanagmentsys;

import exception.MarkException;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

 private int rollNumber;
    private List<SubjectMark> subjectsAndMarks;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.subjectsAndMarks = new ArrayList<>();
    }

    @Override
    public void printInfo() {
        System.out.println("Student name: " + getName());
        System.out.println("Student age: " + getAge());
        System.out.println("Student marks: " + subjectsAndMarks);
    }

    public void addSubjectAndMark(String subName, int markSub) throws MarkException {
        if (markSub < 0 || markSub > 100) {
            throw new MarkException();
        } else {
          subjectsAndMarks.add(new SubjectMark(subName,markSub));
        }
    }
}
